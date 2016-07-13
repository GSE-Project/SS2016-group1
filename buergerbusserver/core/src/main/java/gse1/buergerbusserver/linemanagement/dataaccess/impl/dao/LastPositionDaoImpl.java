package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LastPositionDao;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

/**
 * @author ricarda42
 *
 */
@Named
public class LastPositionDaoImpl extends ApplicationMasterDataDaoImpl<LastPositionEntity> implements LastPositionDao {

  @Override
  protected Class<LastPositionEntity> getEntityClass() {

    return LastPositionEntity.class;
  }

  @Override
  public LastPositionEntity getLastPosition(Long busId) {

    try {
      //selecting table for required records to fetch
      LastPositionEntity lastPosition = Alias.alias(LastPositionEntity.class);
      EntityPathBase<LastPositionEntity> alias = Alias.$(lastPosition);
      JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

      //specifying the where criteria here
      query.where(Alias.$(lastPosition.getBusId()).eq(busId));
      //fetching the records and returing
      return query.list(alias).get(0);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

  }

  @Override
  /**
   * this set method is multi-purpose and depends on the type of input it receives
   * for example, when we receive takenSeats as -1 then it means we only want to update last position
   * when the value for takenSeats > 1 then we also update the takenSeats field
   */
  public void setLastPosition(Long busId, double lon, double lat, int takenSeats) {

    try {
      //selecting table for updation
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaUpdate<LastPositionEntity> update = criteriaBuilder.createCriteriaUpdate(LastPositionEntity.class);
      Root<LastPositionEntity> lastPosition = update.from(LastPositionEntity.class);

      //checking if this update is also for the takenSeats
      if (takenSeats > -1) {
        
        BusEntity bus = Alias.alias(BusEntity.class);
        EntityPathBase<BusEntity> alias = Alias.$(bus);
        JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

        query.where(Alias.$(bus.getId()).eq(busId));

        //here we're checking if the received number for updating seats is not greater than Bus's actual no.of seats
        //if it's greater then the input is wrong and we throw an exception
        if (query.list(alias).get(0).getTotalSeats() < takenSeats)
          throw new Exception("Specified seats are greater than vehicle capacity.");
        
        //setting no.of seats here
        update.set(lastPosition.get("takenSeats"), takenSeats);
      }
      //setting the location of the bus
        update.set(lastPosition.get("lon"), lon);
        update.set(lastPosition.get("lat"), lat);

        //providing the update criteria
      update.where(criteriaBuilder.equal(lastPosition.get("busId"), busId));

      //finally, committing the changes here
      getEntityManager().createQuery(update).executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

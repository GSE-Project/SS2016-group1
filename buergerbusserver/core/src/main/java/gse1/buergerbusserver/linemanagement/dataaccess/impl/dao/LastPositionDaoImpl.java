package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LastPositionDao;

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
      LastPositionEntity lastPosition = Alias.alias(LastPositionEntity.class);
      EntityPathBase<LastPositionEntity> alias = Alias.$(lastPosition);
      JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

      query.where(Alias.$(lastPosition.getBusId()).eq(busId));
      return query.list(alias).get(0);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

  }

  @Override
  public void setLastPosition(Long busId, double lon, double lat, int takenSeats) {

    try {

      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaUpdate<LastPositionEntity> update = criteriaBuilder.createCriteriaUpdate(LastPositionEntity.class);
      Root<LastPositionEntity> lastPosition = update.from(LastPositionEntity.class);

      if (takenSeats > -1) {
        BusEntity bus = Alias.alias(BusEntity.class);
        EntityPathBase<BusEntity> alias = Alias.$(bus);
        JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

        query.where(Alias.$(bus.getId()).eq(busId));

        if (query.list(alias).get(0).getTotalSeats() < takenSeats)
          throw new Exception("Specified seats are greater than vehicle capacity.");
        update.set(lastPosition.get("takenSeats"), takenSeats);
      } else {
        update.set(lastPosition.get("lon"), lon);
        update.set(lastPosition.get("lat"), lat);
      }

      update.where(criteriaBuilder.equal(lastPosition.get("busId"), busId));

      getEntityManager().createQuery(update).executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

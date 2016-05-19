package gse1.buergerbusserver.lastpositionmanagement.dataaccess.impl.dao;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.dao.LastPositionDao;

/**
 * @author razadfki
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
  public void setLastPosition(Long busId, double lon, double lat) {

    try {
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaUpdate update = criteriaBuilder.createCriteriaUpdate(LastPositionEntity.class);
      Root lastPosition = update.from(LastPositionEntity.class);

      update.set(lastPosition.get("lon"), lon);
      update.set(lastPosition.get("lat"), lat);
      update.where(criteriaBuilder.equal(lastPosition.get("busId"), busId));

      getEntityManager().createQuery(update).executeUpdate();
      // getEntityManager().refresh(LastPositionEntity.class);

      /*
       * LastPositionEntity lpe = getEntityManager().createQuery(updateQuery);
       *
       * Query query = em.createQuery("UPDATE LASTPOSITION set lon = :lon, lat = :lat WHERE busId = :busId");
       *
       * query.setParameter("lon", lon); query.setParameter("lat", lat); query.setParameter("busId", busId);
       * query.executeUpdate();
       */
      // em.refresh(LastPositionEntity.class);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

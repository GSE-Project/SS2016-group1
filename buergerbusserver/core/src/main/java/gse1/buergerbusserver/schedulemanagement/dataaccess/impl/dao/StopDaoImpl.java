package gse1.buergerbusserver.schedulemanagement.dataaccess.impl.dao;

import java.util.Date;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;

/**
 * @author mbaniasad
 *
 */
@Named
public class StopDaoImpl extends ApplicationMasterDataDaoImpl<StopEntity> implements StopDao {

  @Override
  protected Class<StopEntity> getEntityClass() {

    return StopEntity.class;
  }

  /**
   * get the last updated timestamp in {@link StopEntity}
   *
   * @return timeStamp
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public Date lastUpdate() {

    try {
      //selectin the table for the required records
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Date> maxQuery = criteriaBuilder.createQuery(Date.class);
      Root stopEntityRoot = maxQuery.from(StopEntity.class);

      //selecting the records the providing the criteria record with the max timeStamp value
      //it should not return multiple records
      maxQuery.select(criteriaBuilder.max(stopEntityRoot.<Date> get("timeStamp")));

      //to avoid problems only one record is returning here
      return getEntityManager().createQuery(maxQuery).getSingleResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

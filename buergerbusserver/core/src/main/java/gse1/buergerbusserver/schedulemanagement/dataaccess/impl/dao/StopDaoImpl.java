package gse1.buergerbusserver.schedulemanagement.dataaccess.impl.dao;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;

import java.util.Date;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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

  @Override
  public Date lastUpdate() {

    try {
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Date> maxQuery = criteriaBuilder.createQuery(Date.class);
      Root stopEntityRoot = maxQuery.from(StopEntity.class);

      maxQuery.select(criteriaBuilder.max(stopEntityRoot.<Date> get("timeStamp")));

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


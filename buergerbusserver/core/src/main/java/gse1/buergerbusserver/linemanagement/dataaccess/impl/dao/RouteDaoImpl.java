package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import java.util.Date;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.RouteEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.RouteDao;

/**
 * @author MZEEN
 *
 */
@Named
public class RouteDaoImpl extends ApplicationMasterDataDaoImpl<RouteEntity> implements RouteDao {

  @Override
  protected Class<RouteEntity> getEntityClass() {

    return RouteEntity.class;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public Date lastUpdate() {

    try {
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Date> maxQuery = criteriaBuilder.createQuery(Date.class);
      Root routeEntityRoot = maxQuery.from(RouteEntity.class);

      maxQuery.select(criteriaBuilder.max(routeEntityRoot.<Date> get("timeStamp")));

      return getEntityManager().createQuery(maxQuery).getSingleResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

}

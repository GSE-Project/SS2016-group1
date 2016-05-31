package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import java.util.Date;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;

/**
 * @author razadfki
 *
 */
@Named
public class LineDaoImpl extends ApplicationMasterDataDaoImpl<LineEntity> implements LineDao {

  /**
   * The constructor.
   */
  public LineDaoImpl() {
    super();
  }

  @Override
  protected Class<LineEntity> getEntityClass() {

    return LineEntity.class;
  }
  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

  @Override
  public Date lastUpdate() {
    try {
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Date> maxQuery = criteriaBuilder.createQuery(Date.class);
      Root lineEntityRoot = maxQuery.from(LineEntity.class);

      maxQuery.select(criteriaBuilder.max(lineEntityRoot.<Date> get("timeStamp")));

      return getEntityManager().createQuery(maxQuery).getSingleResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}

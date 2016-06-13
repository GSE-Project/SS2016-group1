package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.BusDao;

/**
 * Implementation of {@link BusDao}.
 *
 * @author ricarda42
 *
 */

@Named
public class BusDaoImpl extends ApplicationMasterDataDaoImpl<BusEntity> implements BusDao {

  /**
   * the constructor
   */
  public BusDaoImpl() {

    super();

  }

  @Override
  protected Class<BusEntity> getEntityClass() {

    return BusEntity.class;
  }

  @Override
  public List<BusEntity> getBusesOnLine(Long lineId) {

    BusEntity bus = Alias.alias(BusEntity.class);
    EntityPathBase<BusEntity> alias = Alias.$(bus);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    query.where(Alias.$(bus.getLineId()).eq(lineId));

    return query.list(alias);
  }

  @Override
  public void updateBusStatus(Long busId, Long lineId) {

    try {
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaUpdate<BusEntity> update = criteriaBuilder.createCriteriaUpdate(BusEntity.class);
      Root<BusEntity> busEntityRoot = update.from(BusEntity.class);

      update.set(busEntityRoot.get("lineId"), lineId);
      update.where(criteriaBuilder.equal(busEntityRoot.get("id"), busId));

      getEntityManager().createQuery(update).executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public Date lastUpdate() {

    try {
      CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Date> maxQuery = criteriaBuilder.createQuery(Date.class);
      Root busEntityRoot = maxQuery.from(BusEntity.class);

      maxQuery.select(criteriaBuilder.max(busEntityRoot.<Date> get("timeStamp")));

      return getEntityManager().createQuery(maxQuery).getSingleResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    // return null;
  }

}

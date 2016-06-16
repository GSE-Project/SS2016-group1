package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.CustomStopEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.CustomStopDao;

/**
 * Implementation of {@link CustomStopDao}.
 *
 * @author Sriramk88
 *
 */

@Named
public class CustomStopDaoImpl extends ApplicationMasterDataDaoImpl<CustomStopEntity> implements CustomStopDao {

  /**
   * the constructor
   */
  public CustomStopDaoImpl() {

    super();

  }

  /**
   *
   */

  @Override
  protected Class<CustomStopEntity> getEntityClass() {

    return CustomStopEntity.class;
  }

  @Override
  public List<CustomStopEntity> getCustomStopStatus(Long requestId, String deviceId) {

    try {
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<CustomStopEntity> cq = cb.createQuery(CustomStopEntity.class);
      Root<CustomStopEntity> ro = cq.from(CustomStopEntity.class);

      cq.select(ro);
      cq.where(cb.and(cb.equal(ro.get("requestId"), requestId), cb.equal(ro.get("deviceId"), deviceId)));

      List<CustomStopEntity> result = em.createQuery(cq).getResultList();
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      List<CustomStopEntity> result = null;
      return result;
    }
  }

  @Override
  public List<CustomStopEntity> getCustomStopDevice(String deviceId) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<CustomStopEntity> getCustomStopLine(Long lineId) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<CustomStopEntity> getCustomStopRequests(int status) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void updateCustomStopStatus(Long requestId, int status) {

    // TODO Auto-generated method stub

  }

  @Override
  public Long newCustomStop(Long lineId, Date pickUpTime, double lat, double lon, int numberOfPersons, String deviceId,
      String userName, String userAddress, List<Integer> userAssistance) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date lastUpdate() {

    // TODO Auto-generated method stub
    return null;
  }

}

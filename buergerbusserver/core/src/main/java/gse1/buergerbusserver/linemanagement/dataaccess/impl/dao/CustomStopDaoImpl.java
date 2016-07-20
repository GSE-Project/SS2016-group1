package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
      // selecting table for required records
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<CustomStopEntity> cq = cb.createQuery(CustomStopEntity.class);
      Root<CustomStopEntity> ro = cq.from(CustomStopEntity.class);

      // selecting all the values against the criteria
      cq.select(ro);
      cq.where(cb.and(cb.equal(ro.get("id"), requestId), cb.equal(ro.get("deviceId"), deviceId)));

      // fetching results into list and then returning it
      List<CustomStopEntity> result = em.createQuery(cq).getResultList();
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public List<CustomStopEntity> getCustomStopDevice(String deviceId) {

    try {
      // selecting table for desired records
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<CustomStopEntity> cq = cb.createQuery(CustomStopEntity.class);
      Root<CustomStopEntity> ro = cq.from(CustomStopEntity.class);

      // selecting values matching the given criteria
      cq.select(ro);
      cq.where(cb.equal(ro.get("deviceId"), deviceId));

      // fetching results into list
      List<CustomStopEntity> result = em.createQuery(cq).getResultList();
      // returning the list
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public List<CustomStopEntity> getCustomStopLine(Long lineId, Long busId) {

    try {
      // selecting the desire table for records
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<CustomStopEntity> cq = cb.createQuery(CustomStopEntity.class);
      Root<CustomStopEntity> ro = cq.from(CustomStopEntity.class);

      // getting current time date
      long epochTime = System.currentTimeMillis() / 1000L;
      Date currDate = new java.util.Date(epochTime);

      List<Integer> statusValues = new ArrayList<>();
      statusValues.add(1);
      statusValues.add(3);

      /**
       * selecting values against given criteria. refer to
       * {@link https://github.com/GSE-Project/SS2016-group1/wiki/server-standard-values} for integer values refer to
       * {@link https://github.com/GSE-Project/SS2016-group1/wiki/Criteria-for-getting-and-updating-custom-stops} for
       * criteria
       */
      cq.select(ro);
      cq.where(
          cb.and(cb.equal(ro.get("lineId"), lineId), cb.greaterThanOrEqualTo(ro.<Date> get("pickUpTime"), currDate),
              cb.or(cb.equal(ro.get("status"), 1),
                  cb.and(cb.equal(ro.get("status"), 2), cb.equal(ro.get("acceptingBus"), busId)),
                  cb.and(cb.equal(ro.get("status"), 6), cb.equal(ro.get("acceptingBus"), busId)))));

      // cq.where(cb.equal(ro.get("lineId"), lineId));

      // getting all the results into list
      List<CustomStopEntity> result = em.createQuery(cq).getResultList();
      // iterating over the result list so that we can remove the buses which has rejected the customStop request so
      // far.
      for (int i = 0; i < result.size(); i++) {
        // here we're check if the rejectingBus field is not empty
        if (result.get(i).getRejectingBus() != null) {
          // if rejectingBus field not empty then because its CSV values we split it and then remove form our resutl
          // list
          for (String rejectingBus : result.get(i).getRejectingBus().split(",")) {
            if (rejectingBus.equals(busId.toString()))
              result.remove(i);
          }
        }
      }

      // returning the final and desired results
      return result;

    } catch (Exception e) {
      e.printStackTrace();
      List<CustomStopEntity> result = null;
      return result;
    }
  }

  @Override
  public List<CustomStopEntity> getCustomStopRequests(Long requestId) {

    try {
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<CustomStopEntity> cq = cb.createQuery(CustomStopEntity.class);
      Root<CustomStopEntity> ro = cq.from(CustomStopEntity.class);

      cq.select(ro);
      cq.where(cb.equal(ro.get("id"), requestId));

      List<CustomStopEntity> result = em.createQuery(cq).getResultList();
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      List<CustomStopEntity> result = null;
      return result;
    }
  }

  @Override
  public void updateCustomStopStatus(Long requestId, int status) {

    try {
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaUpdate<CustomStopEntity> cu = cb.createCriteriaUpdate((CustomStopEntity.class));
      Root<CustomStopEntity> ro = cu.from(CustomStopEntity.class);

      cu.set(ro.get("status"), status);
      cu.where(cb.equal(ro.get("id"), requestId));

      em.createQuery(cu).executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public void updateCustomStopAcceptingBus(Long requestId, Long busId) {

    try {
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaUpdate<CustomStopEntity> cu = cb.createCriteriaUpdate((CustomStopEntity.class));
      Root<CustomStopEntity> ro = cu.from(CustomStopEntity.class);

      cu.set(ro.get("acceptingBus"), busId);
      cu.where(cb.equal(ro.get("id"), requestId));

      em.createQuery(cu).executeUpdate();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<String> updateCustomStopRejectingBus(Long requestId, Long busId) {

    try {
      // selecting table for updation process
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaUpdate<CustomStopEntity> cu = cb.createCriteriaUpdate((CustomStopEntity.class));
      Root<CustomStopEntity> ro = cu.from(CustomStopEntity.class);

      List<String> rejectingBus = new ArrayList<>();
      // if rejectingBus field is not empty then we split CSV into our defined List of strings
      if (getCustomStopRequests(requestId).get(0).getRejectingBus() != null) {
        rejectingBus.addAll(Arrays.asList(getCustomStopRequests(requestId).get(0).getRejectingBus().split(",")));
      }
      // here we add our new busId into the list of rejectingBus. the buses which has rejected the customStop request so
      // far.
      rejectingBus.add(busId.toString());
      String rejectingBusString = StringUtils.join(rejectingBus, ',');

      // here we're updating the rejectingBus field against requestId
      cu.set(ro.get("rejectingBus"), rejectingBusString);
      cu.where(cb.equal(ro.get("id"), requestId));

      // committing the changes here
      em.createQuery(cu).executeUpdate();
      return rejectingBus;

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Long newCustomStopTransaction(Long lineId, Date pickUpTime, String location, int numberOfPersons,
      String deviceId, String info) {

    // Session session = HibernateUtil.getSessionFactory().openSession();
    // buildSessionFactory
    // session.beginTransaction();

    // I've no idea what is going on here :/ razadfki
    // @Sriramk88 could you please add some comments for future developer to understand what this code is doing
    // @razadfki We are currently not using this method at all.
    // This code can be used to persist the data (which we are not doing currently).

    Date date = new Date();
    Date currTimeStamp = new Timestamp(date.getTime());

    Configuration config = new Configuration().configure("hibernate.cfg.xml");
    StandardServiceRegistry serviceRegistry =
        new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

    SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
    Session session = sessionFactory.openSession();
    Transaction tx = null;

    try {
      tx = session.beginTransaction();

      CustomStopEntity cse = new CustomStopEntity();

      cse.setDeviceId(deviceId);
      // cse.setUserInfo(info);
      cse.setLineId(lineId);
      cse.setPickUpTime(pickUpTime);
      cse.setNumberOfPersons(numberOfPersons);
      cse.setStatus(5);
      // cse.setStopLocation(location);
      cse.setTimeStamp(currTimeStamp);
      // Long requestId = (Long) session.save(cse);

      Long requestId = cse.getId();
      System.out.println("requestId: " + requestId);
      // session.save(cse);
      Serializable reqID = session.save(cse);
      Long req = (Long) reqID;
      long requestID = req.longValue();

      System.out.println("requestID: " + requestID);
      tx.commit();

      return requestId;
    } catch (HibernateException e) {
      if (tx != null)
        tx.rollback();
      e.printStackTrace();
      return null;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      session.close();
    }
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public Date lastUpdate() {

    try {
      EntityManager em = getEntityManager();
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<Date> cq = cb.createQuery(Date.class);

      Root ro = cq.from(CustomStopEntity.class);
      cq.select(cb.max(ro.<Date> get("TIMESTAMP")));

      // Root<CustomStopEntity> ro = cq.from(CustomStopEntity.class);
      // cq.select(cb.greatest(ro.get(CustomStopEntity_."TIMESTAMP")));

      return em.createQuery(cq).getSingleResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

}

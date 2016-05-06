package gse1.buergerbusserver.busmanagement.dataaccess.impl.dao;

import java.util.List;

import net.sf.mmm.util.exception.api.ObjectNotFoundUserException;

import gse1.buergerbusserver.busmanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.busmanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;

/**
 * @author ricarda42
 *
 */
public class BusDaoImpl extends ApplicationMasterDataDaoImpl<BusEntity> implements BusDao {

  /**
   * the constructor
   */

  public BusDaoImpl() {

    super();

  }

  @Override
  public BusEntity save(BusEntity entity) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void save(Iterable<? extends BusEntity> entities) {

    // TODO Auto-generated method stub

  }

  @Override
  public BusEntity find(Long id) throws ObjectNotFoundUserException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BusEntity findOne(Long id) throws IllegalArgumentException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean exists(Long id) {

    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<BusEntity> findAll(Iterable<Long> ids) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Long id) throws IllegalArgumentException {

    // TODO Auto-generated method stub

  }

  @Override
  public void delete(BusEntity entity) {

    // TODO Auto-generated method stub

  }

  @Override
  public void delete(Iterable<? extends BusEntity> entities) {

    // TODO Auto-generated method stub

  }

  @Override
  public void forceIncrementModificationCounter(BusEntity entity) {

    // TODO Auto-generated method stub

  }

  @Override
  public List<BusEntity> findAll() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<BusEntity> getAvailableBusses() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected Class<BusEntity> getEntityClass() {

    return BusEntity.class;
  }

}

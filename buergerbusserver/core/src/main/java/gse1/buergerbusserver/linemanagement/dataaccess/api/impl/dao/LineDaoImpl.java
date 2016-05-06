package gse1.buergerbusserver.linemanagement.dataaccess.api.impl.dao;

import java.util.List;

import net.sf.mmm.util.exception.api.ObjectNotFoundUserException;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;

/**
 * @author razadfki
 *
 */
public class LineDaoImpl extends ApplicationMasterDataDaoImpl<LineEntity> implements LineDao {

  @Override
  public LineEntity save(LineEntity entity) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void save(Iterable<? extends LineEntity> entities) {

    // TODO Auto-generated method stub

  }

  @Override
  public LineEntity find(Long id) throws ObjectNotFoundUserException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LineEntity findOne(Long id) throws IllegalArgumentException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean exists(Long id) {

    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<LineEntity> findAll(Iterable<Long> ids) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Long id) throws IllegalArgumentException {

    // TODO Auto-generated method stub

  }

  @Override
  public void delete(LineEntity entity) {

    // TODO Auto-generated method stub

  }

  @Override
  public void delete(Iterable<? extends LineEntity> entities) {

    // TODO Auto-generated method stub

  }

  @Override
  public void forceIncrementModificationCounter(LineEntity entity) {

    // TODO Auto-generated method stub

  }

  @Override
  public List<LineEntity> findAll() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected Class<LineEntity> getEntityClass() {

    // TODO Auto-generated method stub
    return null;
  }

}

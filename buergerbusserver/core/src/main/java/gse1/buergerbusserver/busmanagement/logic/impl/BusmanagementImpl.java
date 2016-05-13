package gse1.buergerbusserver.busmanagement.logic.impl;

import java.util.List;

import gse1.buergerbusserver.busmanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.busmanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.busmanagement.logic.api.Busmanagement;
import gse1.buergerbusserver.busmanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;

/**
 * {@link AbstractComponentFacade} implementation of {@link Busmanagement}
 *
 * @author ricarda
 *
 */
// TODO: Check logging requirements
// TODO: Implement methods as given in interface

public class BusmanagementImpl extends AbstractComponentFacade implements Busmanagement {

  private BusDao busDao;

  @Override
  public List<BusEto> findAllBuses() {

    List<BusEntity> buses = this.busDao.findAll();
    return getBeanMapper().mapList(buses, BusEto.class);
  }

  @Override
  public List<BusEto> findBusesOnLine(Long lineId) {

    List<BusEntity> buses = this.busDao.getBusesOnLine(lineId);
    return getBeanMapper().mapList(buses, BusEto.class);
  }

}

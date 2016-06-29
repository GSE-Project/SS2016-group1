package gse1.buergerbusserver.linemanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LastPositionDao;
import gse1.buergerbusserver.linemanagement.logic.api.LastPositionmanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
@Named
@Component
@Transactional
public class LastPositionmanagementImpl extends AbstractComponentFacade implements LastPositionmanagement {

  @Inject
  private LastPositionDao lastPositionDao;

  @Override
  public LastPositionEto getLastPosition(Long busId) {

    try {
      LastPositionEntity lastPosition = this.lastPositionDao.getLastPosition(busId);
      return getBeanMapper().map(lastPosition, LastPositionEto.class);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public void setLastPosition(Long busId, double lon, double lat, int takenSeats) {

    try {
      this.lastPositionDao.setLastPosition(busId, lon, lat,takenSeats);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}

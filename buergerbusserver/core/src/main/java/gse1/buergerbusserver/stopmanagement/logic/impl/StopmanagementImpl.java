package gse1.buergerbusserver.stopmanagement.logic.impl;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.StopDao;
import gse1.buergerbusserver.stopmanagement.logic.api.Stopmanagement;
import gse1.buergerbusserver.stopmanagement.logic.api.to.StopEto;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
@Named
@Component
@Transactional
public class StopmanagementImpl extends AbstractComponentFacade implements Stopmanagement {

  @Inject
  private StopDao stopDao;

  @Override
  public List<StopEto> listAllStops() {

    return getBeanMapper().mapList(this.stopDao.findAll(), StopEto.class);
  }


}

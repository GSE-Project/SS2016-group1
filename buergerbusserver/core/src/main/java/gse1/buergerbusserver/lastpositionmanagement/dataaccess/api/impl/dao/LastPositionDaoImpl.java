package gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.impl.dao;

import javax.inject.Named;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.dao.LastPositionDao;

/**
 * @author razadfki
 *
 */
@Named
public class LastPositionDaoImpl extends ApplicationMasterDataDaoImpl<LastPositionEntity> implements LastPositionDao {

  @Override
  protected Class<LastPositionEntity> getEntityClass() {

    return LastPositionEntity.class;
  }

  @Override
  public LastPositionEntity getLastPosition(Long busId) {

    try {
      LastPositionEntity lastPosition = Alias.alias(LastPositionEntity.class);
      EntityPathBase<LastPositionEntity> alias = Alias.$(lastPosition);
      JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

      query.where(Alias.$(lastPosition.getBusId()).eq(busId));
      return query.list(alias).get(0);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

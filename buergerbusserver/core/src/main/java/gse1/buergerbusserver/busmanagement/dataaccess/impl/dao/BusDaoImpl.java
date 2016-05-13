package gse1.buergerbusserver.busmanagement.dataaccess.impl.dao;

import java.util.List;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.busmanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.busmanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;

/**
 * Implementation of {@link BusDao}.
 *
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

}

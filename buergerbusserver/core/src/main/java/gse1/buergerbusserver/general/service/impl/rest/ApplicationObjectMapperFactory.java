package gse1.buergerbusserver.general.service.impl.rest;


import io.oasp.module.rest.service.impl.json.ObjectMapperFactory;

import javax.inject.Named;

import com.fasterxml.jackson.databind.jsontype.NamedType;

/**
 * The MappingFactory class to resolve polymorphic conflicts within the buergerbusserver application.
 *
 * @author agreul
 */
@Named("ApplicationObjectMapperFactory")
public class ApplicationObjectMapperFactory extends ObjectMapperFactory {

  /**
   * The constructor.
   */
  public ApplicationObjectMapperFactory() {

    super();
    // register polymorphic base classes
    

    @SuppressWarnings("unused")
	NamedType[] subtypes;
    // register mapping for polymorphic sub-classes
    
  }
}

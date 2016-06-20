-- This is the SQL script for setting up the DDL for the h2 database
-- In a typical project you would only distinguish between main and test for flyway SQLs
-- However, in this sample application we provide support for multiple databases in parallel
-- You can simply choose the DB of your choice by setting spring.profiles.active=XXX in config/application.properties
-- Assuming that the preconfigured user exists with according credentials using the included SQLs

CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1000000; --#do not touch what is this
-- *** Bus ***
CREATE TABLE BUS(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,  --#is this needed  for all entities
    numberPlate VARCHAR(255),
    color VARCHAR(255),
    picture VARCHAR(255),
    totalSeats int,
    lineId BIGINT,
    "TIMESTAMP" timestamp NOT NULL
);

ALTER TABLE BUS ADD CONSTRAINT PK_BUS PRIMARY KEY(id);
ALTER TABLE BUS ADD CONSTRAINT UC_BUS_numberPlate UNIQUE(numberPlate);

-- *** Line ***
CREATE TABLE LINE(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,  --#is this needed  for all entities
    name VARCHAR(255),
    routeId BIGINT,
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE LINE ADD CONSTRAINT PK_LINE PRIMARY KEY(id);

-- *** Route ***
CREATE TABLE ROUTE(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,  --#is this needed  for all entities
    route varchar(755),
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE ROUTE ADD CONSTRAINT PK_ROUTE PRIMARY KEY(id);

-- *** LastPosition ***
CREATE TABLE LASTPOSITION(
    id BIGINT NOT NULL,
    busId BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,  --#is this needed  for all entities
    lat  DOUBLE NOT NULL,
    lon  DOUBLE NOT NUll,
    takenSeats int,
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE  LASTPOSITION ADD CONSTRAINT UC_LASTPOSITION_BUSID UNIQUE(busId);

-- *** Stop ***
CREATE TABLE STOP (
    id BIGINT NOT NULL ,
    name VARCHAR( 255 ) ,
    modificationCounter INTEGER NOT NULL ,
    lat DOUBLE NOT NULL ,
    lon DOUBLE NOT NULL ,
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE STOP ADD CONSTRAINT PK_STOP PRIMARY KEY ( id ) ;

-- *** LineStop ***
CREATE TABLE LINE_STOP(
    id BIGINT NOT NULL,
    --#modificationCounter INTEGER NOT NULL,  for the functional tables this is not needed
    line_id BIGINT NOT NULL,
    stop_id BIGINT NOT NULL,
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE LINE_STOP ADD CONSTRAINT PK_LINE_STOP PRIMARY KEY(id);
ALTER TABLE LINE_STOP ADD CONSTRAINT FK_LINE_STOP2LINE FOREIGN KEY(line_id) REFERENCES LINE(id) ;
ALTER TABLE LINE_STOP ADD CONSTRAINT FK_LINE_STOP2STOP FOREIGN KEY(stop_id) REFERENCES STOP(id) ;


-- *** Schedule ***
CREATE TABLE SCHEDULE(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,  --#is this needed  for all entities
    lineId BIGINT,
    lineName varchar(255) NOT NULL,
    stopId BIGINT,
    arrivingTime TIME NOT NULL,
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE SCHEDULE ADD CONSTRAINT PK_SCHEDULE PRIMARY KEY(id);
ALTER TABLE SCHEDULE ADD CONSTRAINT FK_SCHEDULE2STOP FOREIGN KEY(stopId) REFERENCES STOP(id);

-- *** CustomStops ***
CREATE TABLE CUSTOMSTOP(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,
    lineId BIGINT NOT NULL,
    pickUpTime timestamp NOT NULL,
    lat DOUBLE NOT NULL,
    lon DOUBLE NOT NULL,
    numberOfPersons INTEGER NOT NULL,
    deviceId VARCHAR(50) NOT NULL,
    userName VARCHAR(255),
    userAddress VARCHAR(MAX),
    userAssistance VARCHAR(255),
    status INTEGER NOT NULL,
    busId BIGINT,
    "TIMESTAMP" timestamp NOT NULL
);
ALTER TABLE CUSTOMSTOP ADD CONSTRAINT PK_CUSTOMSTOP PRIMARY KEY(id);



-------------------------
--- *** BinaryObject (BLOBs) ***
CREATE TABLE BINARYOBJECT (
  id BIGINT NOT NULL,
  modificationCounter INTEGER NOT NULL,
  data BLOB(2147483647),
  size BIGINT NOT NULL,
  mimetype VARCHAR(255),
  PRIMARY KEY (ID));


--- *** RevInfo (Commit log for envers audit trail) ***
CREATE TABLE REVINFO(
    id BIGINT NOT NULL generated by default as identity (start with 1),
    timestamp BIGINT NOT NULL,
    user VARCHAR(255));

-- drop table bus cascade;
-- drop table line cascade;
-- drop table stop cascade;
-- drop table line_stop cascade;
-- drop table schedule cascade;
-- drop table lastposition cascade;
-- drop table route;

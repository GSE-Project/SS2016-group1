# Digitale Dörfer - mobile people’s bus system

This project deals with the development of a mobile people’s bus system. The system consists of a mobile app that serves as the people’s bus host system, another mobile app for citizens to use the different people’s busses and a server for interconnection of the two Apps. It is intended that the system will be used within the project [Digitale Dörfer](http://www.digitale-doerfer.de).

## Server ##

This repository contains the source code for the server which communicates with both the [Citizen Mobile APP](https://github.com/GSE-Project/SS2016-group2) and the [BusDriveApp](https://github.com/GSE-Project/SS2016-group3).

Implementation follows the framework of the [Open Application Standard Platform for Java (OASP4J)](http://oasp.github.io/oasp4j/oasp4j_overview.html).

## Documents ##

#### Requirements ####
Buergerbus Concept

[Interfaces to clients](https://github.com/GSE-Project/SS2016-group1/wiki/Server-interfaces)

[Traceability matrix](https://github.com/GSE-Project/SS2016-group1/blob/master/Documentation/Traceability%20matrix.pdf)

#### Design ####
[Component diagram](https://github.com/GSE-Project/SS2016-group1/blob/master/Documentation/Component%20Diagram.jpg)

[Traceability of System functions to components](https://github.com/GSE-Project/SS2016-group1/blob/master/Documentation/Traceability%20SF%20to%20components.pdf)

#### Quality Assurance ####
System test specification

Traceability of System functions to test cases

*Links to be added*

## How to install the server ##

## Prerequisite:

(1) First, Download and Install a Java SE Runtime Environment (JRE) including JDK.

(2) Download the Maven zip package from [Downloading Apache Maven]( https://maven.apache.org/download.cgi) and extract it to some directory (keep in mind UAC).

(3) Navigate to the cloned/downloaded folder of the project \SS2016-group1\buergerbusserver

  On Command Line:

      <path>\maven\bin mvn clean package


  It will take some time to build a JAR package for you.

(4) When its done, then go to the \SS2016-group1\buergerbusserver\core\target\ , you'll find a JAR package here.

## How to start the server ##

Locate your JAR package <path>\SS2016-group1\buergerbusserver\core\target\
 
 run command
 
        Java -jar buergerbusserver-core-0.1-SNAPSHOT.jar

 the server should be running now on localhost:8080   
 type in your browser localhost:8080 and follow the first link (Services Overview) i.e., service description language.



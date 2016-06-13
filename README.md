# Digitale Dörfer - mobile people’s bus system

This project deals with the development of a mobile people’s bus system. The system consists of a mobile app that serves as the people’s bus host system, another mobile app for citizens to use the different people’s busses and a server for interconnection of the two Apps. It is intended that the system will be used within the project [Digitale Dörfer](http://www.digitale-doerfer.de).

## Server ##

This repository contains the source code for the server which communicates with both the [Citizen Mobile APP](https://github.com/GSE-Project/SS2016-group2) and the [BusDriveApp](https://github.com/GSE-Project/SS2016-group3).

Implementation follows the framework of the [Open Application Standard Platform for Java (OASP4J)](http://oasp.github.io/oasp4j/oasp4j_overview.html).

## Documents ##

#### Requirements ####
Buergerbus Concept

[Requirements Document](https://docs.google.com/document/d/1E5iwka3XbtIlKH7SrMoKiDbxiYQo_cI9NPrwxsgaUqY/edit?pref=2&pli=1)

[Interfaces to clients](https://github.com/GSE-Project/SS2016-group1/wiki/Server-interfaces)

[Traceability matrix](https://github.com/GSE-Project/SS2016-group1/blob/master/Documentation/Traceability%20matrix.pdf)

#### Design ####
[Component Diagram](https://github.com/GSE-Project/SS2016-group1/blob/master/Documentation/Component%20Diagram.png)

[Traceability of System functions to components](https://github.com/GSE-Project/SS2016-group1/blob/master/Documentation/Traceability%20SF%20to%20components.pdf)

#### Quality Assurance ####
[System test specification for server tests](https://github.com/GSE-Project/SS2016-group1/blob/master/Test/Test%20Cases_reviewed.pdf)
[System test specification for integration tests](https://github.com/GSE-Project/SS2016-group1/blob/master/Test/System%20Test%20cases%20Document%20for%20Integration%20tests.pdf)

*Links to be added*

## Installation guide ##

#### Prerequisite: ####

(1) First, Download and Install a Java SE Runtime Environment (JRE) including JDK.

(2) Download the Maven zip package from [Downloading Apache Maven]( https://maven.apache.org/download.cgi) and extract it to some directory (keep in mind UAC).

(3) Navigate to the cloned/downloaded folder of the project \SS2016-group1\buergerbusserver

  On Command Line:

      <path>\maven\bin mvn clean package


  It will take some time to build a JAR package for you.

(4) When its done, then go to the \SS2016-group1\buergerbusserver\core\target\ , you'll find a JAR package here.

#### How to start the server ####

Locate your JAR package <path>\SS2016-group1\buergerbusserver\core\target\
 
 run command
 
        java -jar buergerbusserver-core-0.1-SNAPSHOT.jar

 the server should be running on default port i.e., on localhost:8080
 
 to run the server other than default port you need to provide **--server.port** argument, cmd should be as follows:
 
         java -jar buergerbusserver-core-0.1-SNAPSHOT.jar --server.port=8082

 now the server should be running on port 8082.
 
 type in your browser localhost:8080 or localhost:PortNumber and follow the first link (Services Overview) i.e., service description language.

#### Troubleshooting ####

##### Problems with Step (3): `mvn clean package`
###### Symptom: ######
On Debian 7.1 the execution of `mvn clean package` fails with error message:
```
error: unmappable character for encoding ASCII
```

###### Solution: ######
Change the default encoding to `UTF8` via the command:
```
export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
```

###### Symptom: ######
Build failure in execution of `mvn clean package` due to compilation error: `No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?`

###### Solution: ######
Make sure that maven utilizes a java JDK and not a JRE. You can check this by running
```
<path>\maven\bin\mvn -v
```
The output should look like this (in this case on linux):
```
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T17:41:47+01:00)
Maven home: /home/<user name>/test_server/apache-maven-3.3.9
Java version: 1.8.0_91, vendor: Oracle Corporation
Java home: /opt/jdk1.8.0_91/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "3.19.0-59-generic", arch: "amd64", family: "unix"
```
Now check if the java referenced by `Java home` is a JDK or a JRE. If it is not a JDK, install one if necessary and set the JAVA_HOME variable of your computer accordingly.

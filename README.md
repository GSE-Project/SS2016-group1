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

 To Install the Apache Tomcat Server, you need to do following steps:

(1) Firstly, Download and Install a Java SE Runtime Environment (JRE)

(1.1) Download a Java SE Runtime Environment (JRE),
      release version 7 or later, from
      http://www.oracle.com/technetwork/java/javase/downloads/index.html

(1.2) Install the JRE according to the instructions included with the
      release.

      You may also use a full Java Development Kit (JDK) rather than just
      a JRE.


(2) Download and Install Apache Tomcat Server

(2.1) Download a binary distribution  32-bit/64-bit Windows Service Installer (pgp, md5, sha1) of Tomcat from:

      http://tomcat.apache.org/ 

(3) Configure Environment Variables

Tomcat is a Java application and does not use environment variables directly.
Environment variables are used by the Tomcat startup scripts. The scripts use
the environment variables to prepare the command that starts Tomcat.

(3.1) Set JRE_HOME or JAVA_HOME (required)

These variables are used to specify location of a Java Runtime
Environment or of a Java Development Kit that is used to start Tomcat.

The JRE_HOME variable is used to specify location of a JRE. The JAVA_HOME
variable is used to specify location of a JDK.

Using JAVA_HOME provides access to certain additional startup options that
are not allowed when JRE_HOME is used.

If both JRE_HOME and JAVA_HOME are specified, JRE_HOME is used.

(4) Start Up Tomcat Server

(4.1) Tomcat can be started by executing one of the following commands:

  On Windows:

      %CATALINA_HOME%\bin\startup.bat

    or

      %CATALINA_HOME%\bin\catalina.bat start

  On *nix:

      $CATALINA_HOME/bin/startup.sh

    or

      $CATALINA_HOME/bin/catalina.sh start

(4.2) After startup, the default web applications included with Tomcat will be
      available by visiting:

      http://localhost:8080/

(4.3) Further information about configuring and running Tomcat can be found in
      the documentation included here, as well as on the Tomcat web site:

      http://tomcat.apache.org/


(5) Shut Down Tomcat Server

(5.1) Tomcat Server can be shut down by executing one of the following commands:

  On Windows:

      %CATALINA_HOME%\bin\shutdown.bat

    or

      %CATALINA_HOME%\bin\catalina.bat stop

  On *nix:

      $CATALINA_HOME/bin/shutdown.sh

    or

      $CATALINA_HOME/bin/catalina.sh stop



## How to start the server ##

To run the  server, the following steps should be followed :

Step 1 :  Start the Apache  Tomcat server by clicking on' startup.bat' file  which is in the directory where the Apache Tomcat server is installed.

Step 2 :  To check if the server is running successfully: open the web browser and type " http://localhost:8080/"  in the address bar. The Tomcat Server page will be displayed. If the server is not running properly, then shutdown the server by clicking on 'shutdown.bat' and start again.

Step 3 :  Exporting Project Modules into a WAR file

           To convert the project into WAR files : 
           
         	(a)Open Eclipse.
         	
        	(b) Click on 'Export' under the  'FILE drop down'.
        	
        	(c) Select the  'War File' under the  option 'WEB'.
        	
        	(d) Select Project as  " buergerbusserver-server " .
        	
        	(e) Now click on Browse and save the  ' buergerbusserver-server.war file' in any directory.

Step 4 :  Deployment of Application on the server : 

          (a) Go to the address bar and type : " http://localhost:8080/". Server page is displayed and thus server is running successfully.
          
          (b) Click on the  Managerapp button on the right hand side, and enter the Username (example : admin) and Password  (example:admin) , which is given during the installation of the Tomcat Server.
          
          (c) A new page will be opened , i.e ' TomCat Application Manager'. Now scroll down and  see the heading " WAR file to Deploy."
          
          (d) Choose WAR file by clicking on choose file and browse through the folder where the WAR file (i.e  buergerbusserver-server.war) was saved and click'Deploy' button.
          
          (e) The 'buergerbusserver-server'  application  now can be seen in the Applications table above indicating that the application is deployed.  Check if the running status is True  , if not then click on the  'Start' button on the right side under the commands .
          
          (f) Now click on the buergerbusserver-server ,  which will be listed in the application table and a security page opens in the browser:(http://localhost:8080/buergerbusserver-server/security/login ). This page is disabled for now, so change the url in the address bar :
          
	        For  Lines :  " http://localhost:8080/buergerbusserver-server/services/rest/linemanagement/v1/lines"
	        
	        For Stops :  " http://localhost:8080/buergerbusserver-server/services/rest/stopmanagement/v1/stops"
	        
    	        For Schedules : " http://localhost:8080/buergerbusserver-server/services/rest/stopmanagement/v1/schedules"

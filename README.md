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

*to be added*

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

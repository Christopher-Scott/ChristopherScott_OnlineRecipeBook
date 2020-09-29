# Online Recipe Book

## Build and Running Instructions

The repo includes two files that you can run to test that the development environment is configured.
 - DateJSP.jsp will test that you can run JSP files from the development environment
 - TestConnect.java will create a SQLite db and test the connection

### Running DateJSP.jsp

This project will use JSP (java server pages) for a custom API to access the database and deliver content to the frontend in the JSON form.  In order to run JSP files in your development environment, there needs to be an application server such as GlassFish or Tomcat installed to handle the pages.

 - To simplify things, I suggest downloading the Netbeans 8.2 bundle which comes with everything needed to run JSP files. Download either the Java EE version or ALL.  You can find the bundle here:
	
<https://netbeans.org/downloads/8.2/rc/>
	
 - Netbeans 8.2 requires Java 8, which can be found here:
<https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html>
	
### Running TestConnect.java
	
This project will also require database interactions.  At these early stages I'm not sure how the database will be configured for the project, so a local SQLite database can be used for initial development and swapped later with a connection to the real database.  You will need both SQLite installed and the JDBC connection jar for SQLite added to the external libraries of the project.

 - SQLite can be found here:
<https://www.sqlite.org/download.html>
		
 - JDBC connector for SQLite:
<https://github.com/xerial/sqlite-jdbc/releases>
		


	

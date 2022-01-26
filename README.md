# envers-demo

1.	Download & Import the project in your favourite IDE
2.	build it and start it as a spring boot application
3.	Once the application is up and running, then you can access below two:
    * H2 database to verify the data and audit tables<br/>
	  To access H2 console, URL: http://localhost:8080/h2-console
	
	  Configure JDBC URL: jdbc:h2:file:./demo-envers/h2-demo
    
    * Swagger UI to modify the Employee data and check the audit data population using H2 console.<br/>
	  URL: http://localhost:8080/swagger-ui/index.html

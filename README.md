# appIntegration2
In this project, we will build a tiered application, using Java EE technologies. The goal is to simulate a scenario where we need to query data and integrate services. We will use a data persistence tool (JPA/Hibernate) to manage data about series and actors. Next, we will build EJBs to provide access to the JPA managed information and web services (provided by the application server) to provide operations to a web service client application. Finally, we will create a web front-end to provide information to users using browsers. Overall, we are going to build the following set of applications: 

  a) An application that loads data about series into a database.
  
  b) A web service that uses an EJB that can access the database and provides basic information about series.
  
  c) A web service that, in part, uses the functionality provided by the web service in b) and adds extra functionality. 
  
  d) A client application that can query both web services. 
  
  e) A web front-end to display basic information regarding series.

simpleapp
=========
`simpleapp` is the simplest Java EE application that demonstrates MVC design pattern. It includes the following components:
- Model - `com.javaclinic.simpleapp.services.TimeService` stateless session EJB
- View - `/WEB-INF/views/time.jsp`, `/WEB-INF/views/error.jsp`
- Controller - `com.javaclinic.simpleapp.web.TimeServlet` servlet

Deploy
------
You can deploy directly to the local JBoss AS7/EAP6 instance:
- `mvn jboss-as:deploy`

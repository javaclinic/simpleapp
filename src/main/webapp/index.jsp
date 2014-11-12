<html>
<body>
<h1>simpleapp :: index.jsp</h1>
<p>This is an example of a simple JEE app. It implements traditional MVC design pattern:</p>
<ul>
  <li>Model - com.javaclinic.simpleapp.services.TimeService stateless session EJB</li>
  <li>View - /WEB-INF/views/time.jsp, /WEB-INF/views/error.jsp</li>
  <li>Controller - com.javaclinic.simpleapp.web.TimeServlet servlet</li>
</ul>
<p><a href="time">Time Servlet</a></p>
<p><a href="time?name=John">Time Servlet (name=John)</a></p>
</body>
</html>

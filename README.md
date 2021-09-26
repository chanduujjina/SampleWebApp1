1.J2EE(Servlets,HTML,JSP,Javascrpit,Jquery)

Needs to create dynamic web project

Web Application development:

1.HttpRequest
2.HttpResponse
3. User Session

Model view Controller(MVC)

M->Model(where the data resides) JDBC
V->View(HTML page)
C->Controller(Servlets)

Servlets:
---------
Servlet is a container

URL(Unifrom resource locator)
1.Http Request
Usually it contains PayLoad(the data usually send to the server)
2.HttpReponse

Prequistes:
Java
J2EE Eclipse
Tomcat server
maven
Mysql

Post data to the server (create) Post
Update data to the server (put)
delete data from server (delete)
Save or update data to the server(Patch)
get the (Get)



How to convert dynamic web Project into maven project


1.Send the data to the server

life a cycle of servlets

1.Servlet class loaded
2.Servlet instane is created
3.init
4.service
4.destroy

Ways to send data from client to server

1)Query param
http://localhost:7777/SampleWebApp1/hello?name=chandu&surName=ujjina

http://localhost:7777/SampleWebApp1/welcome?name=chandu&surName=ujjina


http://localhost:7777/SampleWebApp1/

localhost-Host name
8080 - port number
SampleWebApp1 - context name

filters
listeners

JSP(Java server pages)
Request dispatcher

1.Send data from from another servlet
a)using request dispather(forward,include)
b)url redirecting
c)HttpSession
2)Demo on login page


26/09:
------------
What is a filter?
Logging
Auditing
Metrics
Validation
what is listeners?

    <servlet>
  <servlet-name>loginServlet</servlet-name>
  <servlet-class>com.demo.web.practice.LoginController</servlet-class>
  </servlet>
  
  <servlet-mapping>
   <servlet-name>loginServlet</servlet-name>
  <url-pattern>/login</url-pattern>
  </servlet-mapping>
  
  <filter>
  <filter-name>myFilter</filter-name>
  <filter-class>com.demo.web.practice.MyFilter</filter-class>
  </filter>
  
  <filter-mapping>
  <filter-name>myFilter</filter-name>
  <url-pattern>/login</url-pattern>
  </filter-mapping>
  


introduction of jsp









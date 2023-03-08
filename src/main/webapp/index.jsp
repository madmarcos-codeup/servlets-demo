<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% int counter = 0; %>
<% counter += 1; %>
<% String message = "Why doesnt this work?!??!"; %>
<% request.setAttribute("message", "Hello, World!"); %>

<%--make an empty array list of people --%>
<%--add it as an attribute to request--%>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="partials/navbar.jsp" %>
    <title>JSP - Hello World</title>
</head>
<body>

<%--add if for if the people array list is empty--%>

<%--add some ppl to the array list and move the if to a choose--%>

<%--iterate over the people array and display each person's name as an LI--%>

<%= message %>
${message}

<p>"name" parameter: ${param.name}</p>
<p>"age" parameter: ${param.age > 30 && param.name == "george"}</p>
<p>User-Agent header: ${header["user-agent"]}</p>

<%--<h1>Welcome To The Site!</h1>--%>
<%--<p>Path: <%= request.getRequestURL() %></p>--%>
<%--<p>Query String: <%= request.getQueryString() %></p>--%>
<%--<p>"name" parameter: <%= request.getParameter("name") %></p>--%>
<%--<p>"method" attribute: <%= request.getMethod() %></p>--%>
<%--<p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>

<%= 1 + 1 %>

<h1><%= "Hello World!!!!!!!!" %></h1>
<h1>The current count is <%= counter %>.</h1>
<br/>
View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
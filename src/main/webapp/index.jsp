<%@ page import="docrob.demo2.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%--%>
<%--    response.sendRedirect("https://google.com");--%>
<%--%>--%>
<%
    int counter = 0;
    counter += 1;
%>
<% String message = "Why doesnt this work?!??!"; %>
<% request.setAttribute("msg", "Hello, World!"); %>
<%
    // grab username from request.getParameter();
    // grab password from request.getParameter();

    // if username is not null and = admin
    // and if pw is not null and = password
    // then use response implicit object to redirect

%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="partials/navbar.jsp" %>
    <title>JSP - Hello World</title>
</head>

<%--make an empty array list of people --%>
<%--add it as an attribute to request--%>
<%
    ArrayList<Person> people = new ArrayList<>();
    people.add(new Person("bob"));
    people.add(new Person("sue"));
    people.add(new Person("tom"));
    request.setAttribute("people", people);
%>

<body>

<%--add if for if the people array list is empty--%>
<%--<c:if test="${people.size() == 0}">--%>
<%--    <p>There are no people!!!</p>--%>
<%--</c:if>--%>

<%--add some ppl to the array list and move the if to a choose--%>

<%--iterate over the people array and display each person's name as an LI--%>
<c:choose>
    <c:when test="${people.size() == 1 || people.size() == 2}">
        <p>There ARE people!!!</p>
    </c:when>

    <c:when test="${people.size() > 2}">
        <p>There ARE LOTS OF people!!!</p>
        <ul>
            <c:forEach var="person" items="${people}">
                    <li id=${person.name} class="my-li">${person.name}</li>
            </c:forEach>
        </ul>

    </c:when>

    <c:otherwise>
        <p>There are no people!!!</p>
    </c:otherwise>
</c:choose>

<hr>

JSP variable: <%= message %>
<br>
EL variable: ${msg}

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
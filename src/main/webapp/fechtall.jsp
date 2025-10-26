<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="spring_mvc.dto.Employee" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> a =(List<Employee>)request.getAttribute("k"); %>
<table border="">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Gender</th>
<th>Country</th>
<th>Remove</th>
<th>Edit</th>
</tr>
<%for(Employee u:a){ %>
<tr>
<td><%=u.getId()%></td>
<td><%=u.getName()%></td>
<td><%=u.getE_email() %></td>
<td><%=u.getGender()%></td>
<td><%=u.getCountry()%></td>
<td><a href="did?id=<%=u.getId()%>">Remove</a></td>
<td><a href="update.jsp?id=<%=u.getId()%>&&name=<%=u.getName()%>&&email=<%=u.getE_email() %>&&gender=<%=u.getGender()%>&&count=<%=u.getCountry()%>">Update</a></td>
<%} %>
</tr>
</table>
</body>
</html>
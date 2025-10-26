<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Welcome to Landing page</h1>
<form action="u" method="get"> <br>
<input type="hidden" name="id" placeholder="id" value=<%=request.getParameter("id")%>><br>
<input type="text" name="name" placeholder="Ename" value=<%=request.getParameter("name")%>><br>
<input type="email" name="e_email" placeholder="abc@.com" value=<%=request.getParameter("email")%>><br>
<input type="text" name="pass" placeholder="Password" value=<%=request.getParameter("pass")%>><br>
<!--  male:<input type="radio" name="Gender" value="Male" <%="male".equals(request.getParameter("gender"))? "checked":""%>>-->
<!-- Female:<input type="radio" name="Gender" value="Female" <%="female".equals(request.getParameter("gender"))? "checked":""%>><br>-->
 Male: <input type="radio" name="Gender" value="Male" 
        <%= "Male".equalsIgnoreCase(request.getParameter("gender")) ? "checked" : "" %> >
    Female: <input type="radio" name="Gender" value="Female" 
        <%= "Female".equalsIgnoreCase(request.getParameter("gender")) ? "checked" : "" %> >
<select name="country" value=<%=request.getParameter("count")%>>
<option> IND</option>
<option> AUS</option>
<option> SA</option>
</select>
<button >Submit</button>
<button >Cancel</button>
</form>

</div>
</body>
</html>
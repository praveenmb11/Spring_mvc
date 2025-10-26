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
<h1>Welcome to Insert page</h1>
<form action="insert" method="post"> <br>
<input type="number" name="id" placeholder="id"><br>
<input type="text" name="name" placeholder="Ename"><br>
<input type="email" name="e_email" placeholder="abc@.com"><br>
<input type="password" name="pass" placeholder="Password"><br>
male:<input type="radio" name="gender" value="Male">
Female:<input type="radio" name="gender" value="Female"><br>
<select name="country">
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
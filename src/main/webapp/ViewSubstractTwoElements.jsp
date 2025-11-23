<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Number to Subtraction</h2>
<form action="substract"method="post">

Enter your First Number<input type="text" name="FirstNumber"><br><br>

Enter your Second Number<input type="text" name="SecondtNumber"><br>

<input type="submit" value="Subtraction">

</form>
<%
if(request.getAttribute("result")!=null){
	out.println(request.getAttribute("result"));
}
%>
</body>
</html>
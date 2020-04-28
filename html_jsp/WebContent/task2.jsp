<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%! int cal1(int a, int b){
		return a - b;
	}
%>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
<h1>125 - 15 = <%= cal1(125, 15) %></h1>
<h2>17 - 21 = <%= cal1(17, 21) %></h2>

</body>
</html>
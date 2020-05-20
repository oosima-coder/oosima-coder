<%@ page import = "practice.FortuneBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortuneBean = (FortuneBean)request.getAttribute("result"); %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print("<h1>↓" + fortuneBean.getToday() + "↓</h1>");
out.print("<h1>" + fortuneBean.getFortune() + "</h1>");
%>

</body>
</html>
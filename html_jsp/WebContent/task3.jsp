<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date, java.text.DateFormat, java.text.SimpleDateFormat,  java.util.Calendar" %>

<!DOCTYPE html>
<html>
<head>
<%! int count ; %>
<%!Calendar cal2 = Calendar.getInstance();%>
<%!Date date = new Date();%>

<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	cal2.setTime(date);
	Date oneday = cal2.getTime();
	sdf.format(oneday);

%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>訪問回数: <%= count++ %> </h1>
<P>今日の日付: <% out.print(sdf.format(oneday)); %> </p>

</body>
</html>
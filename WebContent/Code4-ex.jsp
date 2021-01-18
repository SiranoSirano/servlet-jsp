<%@ page language="java" contentType="text/html; charset=UTF-8" import="ex.*"%>
<% Employee emp = new Employee("0001","港　雄介");  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i = 0; i< 10; i++){ %>
<% if(i % 3 == 1){ %>
<p style="color:red" >
<p>	IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
<% }else{ %>
<p>
<% } %>
<p>	IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
<% } %>
</body>
</html>
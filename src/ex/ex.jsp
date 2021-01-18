<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="ex.Employee" %>
<% Employee emp = new Employee("0001","湊 雄輔"); %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">

<body>
<p>IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
</body>
</html>
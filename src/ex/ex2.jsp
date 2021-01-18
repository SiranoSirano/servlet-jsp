<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="ex.Employee" %>
<% Employee emp = new Employee("0001","湊 雄輔"); %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<-- 1~10までiを繰り返して -->
<%= for(int i = 0; i < 10; i++) { %>
<-- １、４、７、10の時＝3で割ってあまりが1の時 -->
<%= if (i % 3 == 1 ){ %>
<p style ="color:red">
<% } else {%>
<p>
<% } %>
<body>
<p>IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
<% } %>
</body>
</html>
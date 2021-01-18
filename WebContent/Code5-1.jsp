<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form action= "ServletJSP/FormSampleServlet" method="get">
名前:<input type ="text" name ="name"><br>
性別:
男:<input type ="radio" name="gender" value="0">
女:<input type ="radio" name="gender" value="1">
その他:<input type ="radio" name="gender" value="2"><br>
<input type ="submit" value="送信">
</form>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
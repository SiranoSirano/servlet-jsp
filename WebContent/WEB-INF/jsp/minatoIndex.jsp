<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="package9syou.model.SiteEV" %>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>港くんのページ</title>
</head>
<body>
<h1>港くんのページへようこそ</h1>
<p>
<a href="/package9syou.model/MinatoIndex?action=Retweet">リツイート</a>:
<%= siteEV.getRetweet() %> 人
<a href="/package9syou.model/MinatoIndex?action=Favorite">いいね</a>:
<%= siteEV.getFavorite() %> 人
</p>
<h2>港くんとは！？</h2>
<p>…</p>
</body>
</html>
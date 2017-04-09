<!DOCTYPE html>
<%@ page language="java"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hermes home</title>
</head>
<body>
<h1>Welcome to Hermes</h1>
<a href="<c:url value="weather" />">Weather</a>


<form action="weather" method="GET">
    id <input type="text" name="id">

    <input type="submit" value="Submit"/>
</form>
</body>
</html>
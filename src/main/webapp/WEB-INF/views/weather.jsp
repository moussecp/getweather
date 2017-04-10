<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Weather</title>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>--%>
    <link rel="stylesheet" href="/WEB-INF/styles/layout.css" type="text/css"/>
</head>
<body>
<c:if test="${weather!= null}">
<h1>Weather for location: ${weather.location.country}, ${weather.location.region}, ${weather.location.city}</h1>
<br/>
<a href="<c:url value="home"/>">Return home</a>
<br/>
<h2>Description</h2>
<a href=${weather.link}>${weather.description}</a>
<h2>Current condition</h2>
<table>
    <tr>
        <td>Description</td>
        <td>${weather.item.condition.text}</td>
    </tr>
    <tr>
        <td>Forecast publication date</td>
        <td>${weather.item.pubDate}</td>
    </tr>
    <tr>
        <td>Temperature</td>
        <td>${weather.item.condition.temp}&#176; (${weather.units.temperature})</td>
    </tr>
</table>
<h2>Astronomy</h2>
<table>
    <tr>
        <td>Sunrise</td>
        <td>${weather.astronomy.sunrise.hours}:${weather.astronomy.sunrise.minutes} ${weather.astronomy.sunrise.convention}</td>
    </tr>
    <tr>
        <td>Sunset</td>
        <td>${weather.astronomy.sunset.hours}:${weather.astronomy.sunset.minutes} ${weather.astronomy.sunset.convention}</td>
    </tr>
</table>
<h2>Atmosphere</h2>
<table>
    <tr>
        <td>Humidity</td>
        <td>${weather.atmosphere.humidity}&#37;</td>
    </tr>
    <tr>
        <td>Pressure</td>
        <td>${weather.atmosphere.pressure}</td>
    </tr>
    <tr>
        <td>Rising</td>
        <td>${weather.atmosphere.rising}</td>
    </tr>
    <tr>
        <td>Visibility</td>
        <td>${weather.atmosphere.visibility} ${weather.units.distance}</td>
    </tr>
</table>
<h2>Wind</h2>
<table>
    <tr>
        <td>Chill</td>
        <td>${weather.wind.chill}</td>
    </tr>
    <tr>
        <td>Direction</td>
        <td>${weather.wind.direction}</td>
    </tr>
    <tr>
        <td>Speed</td>
        <td>${weather.wind.speed} ${weather.units.speed}</td>
    </tr>
</table>
<br/>
</c:if>
<c:if test="${error!= null}">
<p>
    An unexpected error has occured:
    <br>
        ${error}
</p>
</c:if>
<a href="<c:url value="home"/>">Return home</a>
</html>
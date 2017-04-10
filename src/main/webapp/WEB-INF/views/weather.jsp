<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Weather</title>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>--%>
    <link rel="stylesheet" href="/styles/layout.css" type="text/css"/>
</head>
<body>
<div class="wrapper col1">
    <div id="header">
        <div class="fl_left">
            <h1>Hermes' weather forecast</h1>

            <p>Tech demo for fabric8</p>
        </div>
        <br class="clear"/>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
    <div id="topbar">
        <div id="topnav">
            <ul>
                <li class="active"><a href="/">Home</a></li>
                <%--<li><a href="pages/style-demo.html">Style Demo</a></li>--%>
                <%--<li><a href="pages/full-width.html">Full Width</a></li>--%>
                <%--<li><a href="#">DropDown</a>--%>
                <%--<ul>--%>
                <%--<li><a href="#">Link 1</a></li>--%>
                <%--<li><a href="#">Link 2</a></li>--%>
                <%--<li><a href="#">Link 3</a></li>--%>
                <%--</ul>--%>
                <%--</li>--%>
                <%--<li class="last"><a href="#">A Long Link Text</a></li>--%>
            </ul>
        </div>
        <%--<div id="search">--%>
        <%--<form action="#" method="post">--%>
        <%--<fieldset>--%>
        <%--<legend>Site Search</legend>--%>
        <%--<input type="text" value="Search Our Website&hellip;"  onfocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;" />--%>
        <%--<input type="submit" name="go" id="go" value="Search" />--%>
        <%--</fieldset>--%>
        <%--</form>--%>
        <%--</div>--%>
        <br class="clear"/>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col7">
    <c:if test="${weather!= null}">
        <h1>Weather for location: ${weather.location.country}, ${weather.location.region}, ${weather.location.city}</h1>
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
</div>
<div class="wrapper col7">
    <div>
        <c:if test="${error!= null}">
            <p>
                An unexpected error has occured:
                <br>
                    ${error}
            </p>
        </c:if>
    </div>
</div>
<div class="wrapper col6">
    <div id="copyright">
        <p class="fl_left">Copyright &copy; 2017 - All Rights Reserved - <a
                href="https://github.com/moussecp/getweather/">moussecp</a></p>
        <p class="fl_right">Template by <a target="_blank" href="http://www.os-templates.com/"
                                           title="Free Website Templates">OS Templates</a></p>
        <br class="clear"/>
    </div>
</div>
</body>
</html>
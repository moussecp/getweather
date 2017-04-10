<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--
Template Name: Modern Business
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<%@ page language="java"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Weather</title>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>--%>
    <link rel="stylesheet" href="/WEB-INF/styles/layout.css" type="text/css"/>
</head>
<body id="top">
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
<div class="wrapper col3">
    <%--<div id="featured_slide">--%>
    <%--<div id="slider" class="nivoSlider">--%>
    <%--<img src="images/demo/1.gif" alt="" />--%>
    <%--<img src="images/demo/2.gif" alt="" />--%>
    <%--<img src="images/demo/3.gif" alt="" />--%>
    <%--<img src="images/demo/4.gif" alt="" />--%>
    <%--<img src="images/demo/5.gif" alt="" />--%>
    <%--</div>--%>
    <%--</div>--%>
    <div id="featured_intro">
        <div>
            <p>Weather forecast for the given countries:</p>
            <table>
                <tr>
                    <td>Location name</td>
                    <td>ID</td>
                </tr>
                <c:forEach var="location" items="${locationList}">
                    <tr>
                        <td>${location.name}</td>
                        <td>${location.id}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <h:form action="weather" method="GET">
            Set location id <input type="text" name="id">

            <input type="submit" value="Submit"/>
        </h:form>
    </div>
</div>
<!-- ####################################################################################################### -->
<%--<div class="wrapper col4">--%>
<%--<div id="latest">--%>
<%--<ul>--%>
<%--<li>--%>
<%--<h2>Indonectetus facilis leo nibh</h2>--%>
<%--<p class="imgholder"><img src="images/demo/290x100.gif" alt="" /></p>--%>
<%--<p>Nullamlacus dui ipsum conseqlo bo rttis non euisque morbipen asda pibulum orna. <a href="#">More &raquo;</a></p>--%>
<%--</li>--%>
<%--<li>--%>
<%--<h2>Indonectetus facilis leo nibh</h2>--%>
<%--<p class="imgholder"><img src="images/demo/290x100.gif" alt="" /></p>--%>
<%--<p>Nullamlacus dui ipsum conseqlo bo rttis non euisque morbipen asda pibulum orna. <a href="#">More &raquo;</a></p>--%>
<%--</li>--%>
<%--<li class="last">--%>
<%--<h2>Indonectetus facilis leo nibh</h2>--%>
<%--<p class="imgholder"><img src="images/demo/290x100.gif" alt="" /></p>--%>
<%--<p>Nullamlacus dui ipsum conseqlo bo rttis non euisque morbipen asda pibulum orna. <a href="#">More &raquo;</a></p>--%>
<%--</li>--%>
<%--</ul>--%>
<%--<br class="clear" />--%>
<%--</div>--%>
<%--</div>--%>
<!-- ####################################################################################################### -->
<%--<div class="wrapper col5">--%>
<%--<div id="footer">--%>
<%--<div class="footbox">--%>
<%--<h2>Lacus interdum</h2>--%>
<%--<p>Elitpha sellus enim rutrum orna ac met quis risus sus sed metus. Ipsumm aecenas sempor tincidunt feugiat tur aenec a integet rhoncus eger et. Semnisse fauctor in ut convalli citudin vivamus curabitur tinci dunt nam vestique pretium.</p>--%>
<%--</div>--%>
<%--<div class="footbox">--%>
<%--<h2>Lacus interdum</h2>--%>
<%--<ul>--%>
<%--<li><a href="#">Lorem ipsum dolor</a></li>--%>
<%--<li><a href="#">Lorem ipsum dolor sit amet</a></li>--%>
<%--<li><a href="#">Praesent et eros</a></li>--%>
<%--<li><a href="#">Praesent et eros</a></li>--%>
<%--<li><a href="#">Lorem ipsum dolor</a></li>--%>
<%--<li><a href="#">Suspendisse in neque</a></li>--%>
<%--<li><a href="#">Phasellus tempor vestibulum</a></li>--%>
<%--<li><a href="#">Vestibulum quis augu mauris</a></li>--%>
<%--<li class="last"><a href="#">Suspendisse in neque</a></li>--%>
<%--</ul>--%>
<%--</div>--%>
<%--<div class="footbox last">--%>
<%--<h2>Lacus interdum</h2>--%>
<%--<ul>--%>
<%--<li><a href="#">Lorem ipsum dolor</a></li>--%>
<%--<li><a href="#">Lorem ipsum dolor sit amet</a></li>--%>
<%--<li><a href="#">Praesent et eros</a></li>--%>
<%--<li><a href="#">Praesent et eros</a></li>--%>
<%--<li><a href="#">Lorem ipsum dolor</a></li>--%>
<%--<li><a href="#">Suspendisse in neque</a></li>--%>
<%--<li><a href="#">Phasellus tempor vestibulum</a></li>--%>
<%--<li><a href="#">Vestibulum quis augu mauris</a></li>--%>
<%--<li class="last"><a href="#">Suspendisse in neque</a></li>--%>
<%--</ul>--%>
<%--</div>--%>
<%--<div class="thumbbox">--%>
<%--<h2>Lacus interdum</h2>--%>
<%--<ul>--%>
<%--<li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>--%>
<%--<li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>--%>
<%--<li class="last"><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>--%>
<%--<li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>--%>
<%--<li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>--%>
<%--<li class="last"><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>--%>
<%--</ul>--%>
<%--<br class="clear" />--%>
<%--</div>--%>
<%--<br class="clear" />--%>
<%--</div>--%>
<%--</div>--%>
<!-- ####################################################################################################### -->
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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
    <title>Display weather forecast</title>
</head>
<body>
    <h1>Weather by location</h1>
    <br/>
    <a href="<c:url value="homepage" />">Return home</a>
    <br/>
    <c:forEach items="${locationList}" var="location">
        <li id="location<c:out value="location.id"/>">
            <div class="locationMessage">
                <c:out value="${location.message}" />
            </div>
            <div>
                <span class="locationName"><c:out value="${location.name}" /></span>
                <span class="locationwoeid"><c:out value="${location.woeid}" /></span>
            </div>
        </li>
    </c:forEach>
</body>
<br/>
<a href="<c:url value="homepage" />">Return home</a>
</html>
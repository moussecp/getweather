<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Selected story</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
    <h1>Selected story</h1>
    <br/>

    <h:form items="${storyList}" var="story">
        <table>
            <tr>
                <td>ID</td>
                <td>${story.id}</td>
            </tr>
            <tr>
                <td>Date</td>
                <td>${story.date}</td>
            </tr>
            <tr>
                <td>Latitude</td>
                <td>${story.latitude}</td>
            </tr>
            <tr>
                <td>Longitude</td>
                <td>${story.longitude}</td>
            </tr>
            <tr>
                <td>Message</td>
                <td>${story.message}</td>
            </tr>
        </table>
    </h:form>

</body>
</html>
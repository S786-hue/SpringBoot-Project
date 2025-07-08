<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="forcemenu.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Indian Army</title>
</head>
<body>
    <h2>Army Force Registration List</h2>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email Id</th>
            <th>Mobile</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>

        <c:forEach var="forces" items="${forces}">
            <tr>
                <td>${forces.firstname}</td>
                <td>${forces.lastname}</td>
                <td>${forces.email}</td>
                <td>${forces.mobile}</td>
                <td><a href="delforceregistration?id=${forces.id}">Delete</a></td>
                <td><a href="updateforce?id=${forces.id}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor List</title>
</head>
<body>
   <h2>View Doctor Registration List</h2>
    <table>
        <tr>
          <th>First Name</th>
        
          <th>Last Name</th>
        
          <th>Qualification</th>
       
          <th>Profession</th>
        
          <th>Salary</th>
       
          <th>Mobile No</th>
        
          <th>Delete</th>
          <th>Update</th>
        </tr>
        
        <c:forEach var="doctor" items="${doctors}">
           <tr>
            <td>
              ${doctor.firstname}
            </td>
            <td>
              ${doctor.lastname}
            </td>
            <td>
              ${doctor.qualification}
            </td>
            <td>
              ${doctor.profession}
            </td>
            <td>
              ${doctor.salary}
            </td>
            <td>
              ${doctor.mobile}
            </td>
            
            <td>
             <a href="deleteRegistration?id=${doctor.id}">delete</a>
            </td>
             <td>
             <a href="getRegistration?id=${doctor.id}">update</a>
            </td>
            
           </tr>
           
        </c:forEach>
    </table>

</body>
</html>
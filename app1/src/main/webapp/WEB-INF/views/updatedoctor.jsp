<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctors</title>
</head>
<body>

      <form action="updateDoc" method="post"> 
      
      <pre>
           <h2>Doctors Profile Update</h2>
           
                     <input type="hidden" name="id" value="${doctor.id}"/>
           First Name:    <input type="text" name="firstname" value="${doctor.firstname}"/>
           Last Name:     <input type="text" name="lastname" value="${doctor.lastname}"/>
      <!--      Email Id:      <input type="text" name="email" /> -->
           Qualification: <input type="text" name="qualification" value="${doctor.qualification}"/>
           Profession:    <input type="text" name="profession" value="${doctor.profession}"/>
           Salary:        <input type="text" name="salary" value="${doctor.salary}"/>
           Mobile No:     <input type="text" name="mobile" value="${doctor.mobile}"/>
           
                         <input type="submit" value="update"/> 
      </pre>
      </form>
      ${msgs}"

</body>
</html>
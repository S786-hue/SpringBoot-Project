<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="forcemenu.jsp"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Indian Army update </title>
</head>
<body>
      
      <form action="updateforcesReg" method="post">
            <h2>Indian Army Update Registration </h2>
          <pre>
                      <input type="hidden" name="id" value="${forces.id }"/>
               First Name: <input type="text" name="firstname" value="${forces.firstname}"/>
               Last Name:  <input type="text" name="lastname" value="${forces.lastname}"/>
               Email Id:   <input type="text" name="email" value="${forces.email}"/>
               Mobile:     <input type="text" name="mobile" value="${forces.mobile}"/>
               
                           <input type="submit" value="update"/>
          </pre>
      </form>
      ${msg}

</body>
</html>
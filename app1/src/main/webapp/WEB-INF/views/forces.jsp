<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="forcemenu.jsp"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Indian Army</title>
</head>
<body>
      
      <form action="saveforces" method="post">
            <h2>Indian Army Forces</h2>
          <pre>
               First Name: <input type="text" name="firstname"/>
               Last Name:  <input type="text" name="lastname"/>
               Email Id:   <input type="text" name="email"/>
               Mobile:     <input type="text" name="mobile"/>
               <!-- Salary:     <input type="text" name="salary"/>
               Country:    <input type="text" name="country"/>
               State:      <input type="text" name="state"/>
               City:       <input type="text" name="city"/>
               Address:    <input type="text" name="address"/>
               Pincode:    <input type="text" name="pincode"/> -->
                           <input type="submit" value="Save"/>
          </pre>
      </form>
      ${msg}

</body>
</html>
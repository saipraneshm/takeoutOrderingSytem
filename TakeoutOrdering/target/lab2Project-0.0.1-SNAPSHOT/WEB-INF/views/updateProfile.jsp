<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group 14: Update or Delete Profile</title>
<style>
form { 
margin: 0 auto; 
width:250px;
}
</style>


</head>
<body>
 
 <form:form method="post" action="/profile/${id}" modelAttribute="profile">
        
        	<h4 style="text-align: center">Update or Delete Profile</h4>
        	
            <div style="color:red ; text-align: center">${error}</div>
            <div style="color:blue; text-align: center">${info}</div>
            <table align="center">
            	
               <tr>
                <td><form:label path="id">User Id:</form:label></td>
                <td><form:input path="id" readonly="true" value="${id}"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="firstname">Firstname:</form:label></td>
                <td><form:input path="firstname" value="${firstname}"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="lastname">Lastname:</form:label></td>
                <td><form:input path="lastname" value = "${lastname}"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="email">Email:</form:label></td>
                <td><form:input path="email" value="${email}"></form:input></td>
               </tr>
                
               <tr>
                <td><form:label path="address">Address:</form:label></td>
                <td><form:input path="address" value="${address}"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="organization">Organization:</form:label></td>
                <td><form:input path="organization" value ="${organization}"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="aboutMyself">AboutMyself:</form:label></td>
                <td><form:input path="aboutMyself" value="${aboutMyself}"></form:input></td>
               </tr>  
               
               <tr><td><input type="submit" name="action" value="Update"/></td>
               </tr>
              
            </table>
        </form:form>
        
        <form:form method="delete" action="/profile/${id}">
        &nbsp;	<input type="submit" name="_method" value="DELETE"/>
        </form:form>
       

</body>
</html>
<%@page isErrorPage="true" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group 14: Create Profile</title>


</head>
<body>
 
        <form:form method="post" action="/profile" name="newProfileForm" modelAttribute="profile">
            
            		<h4 style="text-align: center">Create New Profile</h4>
            		<div style="color:red; text-align: center ">${error}</div>
            		<div style="color:blue; text-align: center">${info}</div>
            <table align="center">
            	
               <tr>
                <td><form:label path="id">User Id:</form:label></td>
                <td><form:input path="id"></form:input></td>
                <td><div style="color:red">${errorid}</div> </td>
               </tr>
               
               <tr>
                <td><form:label path="firstname">Firstname:</form:label></td>
                <td><form:input path="firstname"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="lastname">Lastname:</form:label></td>
                <td><form:input path="lastname"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="email">Email:</form:label></td>
                <td><form:input path="email"></form:input></td>
                <td><div style="color:red">${erroremail}</div> </td>
               </tr>
                
               <tr>
                <td><form:label path="address">Address:</form:label></td>
                <td><form:input path="address"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="organization">Organization:</form:label></td>
                <td><form:input path="organization"></form:input></td>
               </tr>
               
               <tr>
                <td><form:label path="aboutMyself">AboutMyself:</form:label></td>
                <td><form:input path="aboutMyself"></form:input></td>
               </tr>  
               
               <tr><td><input type="submit" value="Create"/></td></tr>
              
            </table>
            
        </form:form>

</body>
</html>
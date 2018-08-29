<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="red">
<h3><center>Newly Added User Information</center></h3>
<h3> Hi ${userName} </h3>
<form action="addUser" method="post">
		<input type="text" name="userName">
		 <input type="submit" value="Add">
		 
	</form>
<frameset cols="10%,10%">
<frame src="frame4.jsp" name="frame4">
</frameset>	
</body>
</html>
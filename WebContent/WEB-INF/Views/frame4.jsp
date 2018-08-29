<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="pink">
<table style="width: 750px; height: 100px" class="table table-responsive"
			border="5">
							<thead style="color: white; background: black;">
				<tr>
					<th style="font-size: 20px">UserNames</th>
					
				</tr>
			</thead>
			<tbody style="color:black">
				<c:forEach items="${userNameList}" var="user">
					<tr>
						<td style="color:black">New User Name : ${userNameList}</td>
					
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
</body>
</html>
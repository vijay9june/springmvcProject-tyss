<%@page import="com.tyss.retailerspringmvc.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
RetailerBean bean =(RetailerBean)session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="update">Update Profile</a>
	<a href="logout">Logout</a>
	<h2>Welcome <%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" name="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
<%
RetailerBean retailerBean = (RetailerBean)request.getAttribute("bean");
%>
<%
if(retailerBean!=null){
%>
<table>
	<tr>
	<th>Name</th>
	<th>Email</th>
	</tr>
	<tr>
	<th><%=retailerBean.getName()%></th>
	<th><%=retailerBean.getEmail()%></th>
	</tr>
</table>
<%
}
%>
<h3 style="color: red;">${msg}</h3>
</body>
</html>
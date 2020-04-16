<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.do{

}

body{
display:block;
text-align:center;
background-color:blue;
background-size:cover;
background-position:center;
}

.error{
		color:red;
	}


.align{
	display:block;
	text-align:left;
	padding:0% 0% 0% 40%;
}
</style>
</head>
<body>
	<h1>CAR INSURANCE CALCULATOR</h1>
	
	<f:form action="process" method="get"  modelAttribute="insurance">
		<table class="align">
		<tr>
			<td>Name: </td>
			<td><f:input path="Name"/></td>
		</tr>
		<tr>
			<td>RTO: </td>
			<td> <f:input path="RTO"/></td>
		</tr>
		<tr>
			<td>Date of purchase: </td>
			<td><f:input path="year"/></td>
		</tr>
		<tr>
			<td>Model Name: </td>
			<td><f:select path="modelName">
				<f:options items="${insurance.modelnameTypes}"/>
			</f:select></td>
			
		</tr>
		<tr>
			<td>Fuel Type: </td>
			<td><f:select path="fuelType">
					<f:options items="${insurance.allfuelTypes}"/>
				</f:select><br>
		</td>
		<tr>
			<td>Variant Type: </td>
			<td><f:select path="variantType">
					<f:options items="${insurance.allvarianttypes}"/>
				</f:select></td>
		</tr>
		<%-- <tr>
			<td>Date of Purchase: </td>
			<td><f:input  path="DOP"/></td>
		</tr> --%>
		</table>
		<input type="submit" value="submit">
		
	</f:form>
</body>
</html>
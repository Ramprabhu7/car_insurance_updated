<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color:grey;
text-align:center;
display:block;
}

a{
color:black;
font-size:30px;
font-family:Arial;
margin:auto;
padding:5px 10px;
text-decoration:none;
border: 0px solid black;
background-color:red;

}

.first{
background-color:white;
}

.second{
background-color:white;
}

.third{
background-color:white;
} 

ul li{
display:inline-block;
padding:3px 80px;
font-size:30px;
border: 0px solid black;
text-align:center;
margin:0px;
}

.content{
	padding:150px 150px;
	border:0px solid black;
	}

ul li a:hover{
color:white;
} 
</style>
</head>
<body>
<div class="content">
		<div class="first">
		<ul>
			<li>${company1}</li>
			<li>IDV- ${IDV1}</li>
			<li><a href="page1">Rs.${premium1}</a> </li>
		</ul>
		</div>
		
		<div class="second">
			<ul>
			<li>${company2}</li>
			<li>IDV- ${IDV2}</li>
			<li><a href="page2">Rs.${premium2}</a> </li>
		</ul>
		</div>
		
		<div class="third">
			<ul>
			<li>${company3}</li>
			<li>IDV- ${IDV3}</li>
			<li><a href="page3">Rs.${premium3}</a> </li>
		</ul>
		</div>
		
 </div>
</body>
</html>
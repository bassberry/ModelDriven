


<%@page import="dataobjects.*"%>
<%
	// Fetch content to be displayed !
	
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" media="screen,projection"
	title="Standardstylesheet" href="stylesheets/default.css"
	type="text/css" />
</head>
<body>
	<form action="index.jsp" method="post">
	
		
	
	
		<div class="object">
			<label>Person</label>
			<hr>
		
			<div>
				<label>Vorname:</label> <input type="
				text
				" name="Vorname" />
			</div>
		
			<div>
				<label>Nachname:</label> <input type="
				text
				" name="Nachname" />
			</div>
		
			<div>
				<label>Alter:</label> <input type="
				text
				" name="Alter" />
			</div>
		
		</div>
	
	
		<div class="controlPanel">
			<button type="submit" name ="proceedAction" value="Page1">Weiter</button>
		</div>
	
	</form>
</body>
</html>


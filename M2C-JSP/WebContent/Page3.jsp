


<%@page import="dataobjects.*"%>
<%
	// Fetch content to be displayed !
	
	Person Person1 = (Person) DataStorage.INSTANCE.get("Person1");

	Adresse Adresse1 = (Adresse) DataStorage.INSTANCE.get("Adresse1");

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
			
			<div>
				<label>Name:</label>
				<%
					out.print(Person1.getName());
				%>
			</div>
			
		</div>
	
		<div class="object">
			
			<div>
				<label>Strasse:</label>
				<%
					out.print(Adresse1.getStrasse());
				%>
			</div>
			
		</div>
	
	
	
	
	</form>
</body>
</html>



<%@page import="dataobjects.*"%>
<%
	// Ausgabeobjekte aus Hash laden
		Person person = (Person) DataStorage.INSTANCE.get("Person");
	
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personendaten</title>
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
					<label>Vorname:</label>
					<%
						out.print(person.getVorname());
					%>
				</div>
			
				<div>
					<label>Nachname:</label>
					<%
						out.print(person.getNachname());
					%>
				</div>
			
				<div>
					<label>Alter:</label>
					<%
						out.print(person.getAlter());
					%>
				</div>
			
			</div>

		
			<div class="object">
			<label>Adresse</label>
			<hr>
		
		
			<div>
				<label>Strasse:</label> <input type="text" name="Strasse" />
			</div>
		
			<div>
				<label>Hausnummer:</label> <input type="number" name="Hausnummer" />
			</div>
		
			<div>
				<label>Stadt:</label> <input type="text" name="Stadt" />
			</div>
		
		</div>

		
		<div class="controlPanel">
			<button type="submit" name ="proceedAction" value="Page2">Weiter</button>
		</div>

	</form>
</body>
</html>



<%@page import="dataobjects.*"%>
<%
	// Ausgabeobjekte aus Hash laden
		Student student = (Student) DataStorage.INSTANCE.get("Student");
	
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Studentendaten</title>
<link rel="stylesheet" media="screen,projection"
	title="Standardstylesheet" href="stylesheets/default.css"
	type="text/css" />
</head>
<body>
	<form action="index.jsp" method="post">
		
			<div class="object">
				<label>Student</label>
				<hr>
			
			
				<div>
					<label>Name:</label>
					<%
						out.print(student.getName());
					%>
				</div>
			
				<div>
					<label>Matrikelnummer:</label>
					<%
						out.print(student.getMatrikelnummer());
					%>
				</div>
			
				<div>
					<label>Semester:</label>
					<%
						out.print(student.getSemester());
					%>
				</div>
			
			</div>

		
			<div class="object">
			<label>Pruefung1</label>
			<hr>
		
		
			<div>
				<label>Name:</label> <input type="text" name="Name" />
			</div>
		
			<div>
				<label>Note:</label> <input type="number" name="Note" />
			</div>
		
		</div>

		
		<div class="controlPanel">
			<button type="submit" name ="proceedAction" value="Pruefung1">Weiter</button>
		</div>

	</form>
</body>
</html>


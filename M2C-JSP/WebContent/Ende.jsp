


<%@page import="dataobjects.*"%>
<%
	// Fetch content to be displayed !
	
	Pruefung Pruefung1 = (Pruefung) DataStorage.INSTANCE.get("Pruefung1");

	Pruefung Pruefung2 = (Pruefung) DataStorage.INSTANCE.get("Pruefung2");

	Student Student = (Student) DataStorage.INSTANCE.get("Student");

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
	
		
			<label>Pruefung1</label>
			<div class="object">
				
				<div>
					<label>Name:</label>
					<%
						out.print(Pruefung1.getName());
					%>
				</div>
				
				<div>
					<label>Note:</label>
					<%
						out.print(Pruefung1.getNote());
					%>
				</div>
				
			</div>
		
			<label>Pruefung2</label>
			<div class="object">
				
				<div>
					<label>Name:</label>
					<%
						out.print(Pruefung2.getName());
					%>
				</div>
				
				<div>
					<label>Note:</label>
					<%
						out.print(Pruefung2.getNote());
					%>
				</div>
				
			</div>
		
			<label>Student</label>
			<div class="object">
				
				<div>
					<label>Name:</label>
					<%
						out.print(Student.getName());
					%>
				</div>
				
				<div>
					<label>Matrikelnummer:</label>
					<%
						out.print(Student.getMatrikelnummer());
					%>
				</div>
				
				<div>
					<label>Semester:</label>
					<%
						out.print(Student.getSemester());
					%>
				</div>
				
			</div>
		
	
	
	
	</form>
</body>
</html>


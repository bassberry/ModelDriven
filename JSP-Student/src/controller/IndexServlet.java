
package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataobjects.*;

public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String param = request.getParameter("proceedAction");
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Studentendaten.jsp");

		if (param != null) {
			DataStorage storage = DataStorage.INSTANCE;
			try {
				switch (param) {

					case "Studentendaten" :

					{
						Student student = (Student) storage.get("Student");
						if (student == null) {
							student = new Student();
						}
						student.setName(request.getParameter("Name"));

						storage.set("Student", student);
					}

					{
						Student student = (Student) storage.get("Student");
						if (student == null) {
							student = new Student();
						}
						student.setMatrikelnummer(request.getParameter("Matrikelnummer"));

						storage.set("Student", student);
					}

					{
						Student student = (Student) storage.get("Student");
						if (student == null) {
							student = new Student();
						}
						student.setSemester(Integer.parseInt(request.getParameter("Semester")));

						storage.set("Student", student);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Pruefung1.jsp");

						break;

					case "Pruefung1" :

					{
						Pruefung pruefung1 = (Pruefung) storage.get("Pruefung1");
						if (pruefung1 == null) {
							pruefung1 = new Pruefung();
						}
						pruefung1.setName(request.getParameter("Name"));

						storage.set("Pruefung1", pruefung1);
					}

					{
						Pruefung pruefung1 = (Pruefung) storage.get("Pruefung1");
						if (pruefung1 == null) {
							pruefung1 = new Pruefung();
						}
						pruefung1.setNote(Integer.parseInt(request.getParameter("Note")));

						storage.set("Pruefung1", pruefung1);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Pruefung2.jsp");

						break;

					case "Pruefung2" :

					{
						Pruefung pruefung2 = (Pruefung) storage.get("Pruefung2");
						if (pruefung2 == null) {
							pruefung2 = new Pruefung();
						}
						pruefung2.setName(request.getParameter("Name"));

						storage.set("Pruefung2", pruefung2);
					}

					{
						Pruefung pruefung2 = (Pruefung) storage.get("Pruefung2");
						if (pruefung2 == null) {
							pruefung2 = new Pruefung();
						}
						pruefung2.setNote(Integer.parseInt(request.getParameter("Note")));

						storage.set("Pruefung2", pruefung2);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Ende.jsp");

						break;

					case "Ende" :

						break;

					default :
						break;
				}
			} catch (NumberFormatException exception) {
				// dispatcher should be left to the old page.
			}
		}

		dispatcher.forward(request, response);

	}
}

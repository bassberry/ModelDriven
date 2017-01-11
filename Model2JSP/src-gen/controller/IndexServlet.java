
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
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Page1.jsp");

		if (param != null) {
			DataStorage storage = DataStorage.INSTANCE;
			try {
				switch (param) {

					case "Page1" :

					{
						Person Person = (Person) storage.get("Person");
						if (Person == null) {
							Person = new Person();
						}
						Person.setVorname(request.getParameter("Vorname"));

						storage.set("Person", Person);
					}

					{
						Person Person = (Person) storage.get("Person");
						if (Person == null) {
							Person = new Person();
						}
						Person.setNachname(request.getParameter("Nachname"));

						storage.set("Person", Person);
					}

					{
						Person Person = (Person) storage.get("Person");
						if (Person == null) {
							Person = new Person();
						}
						Person.setAlter(Integer.parseInt(request.getParameter("Alter")));

						storage.set("Person", Person);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Page2.jsp");

						break;

					case "Page2" :

					{
						Adresse Adresse = (Adresse) storage.get("Adresse");
						if (Adresse == null) {
							Adresse = new Adresse();
						}
						Adresse.setStrasse(request.getParameter("Strasse"));

						storage.set("Adresse", Adresse);
					}

					{
						Adresse Adresse = (Adresse) storage.get("Adresse");
						if (Adresse == null) {
							Adresse = new Adresse();
						}
						Adresse.setHausnummer(Integer.parseInt(request.getParameter("Hausnummer")));

						storage.set("Adresse", Adresse);
					}

					{
						Adresse Adresse = (Adresse) storage.get("Adresse");
						if (Adresse == null) {
							Adresse = new Adresse();
						}
						Adresse.setStadt(request.getParameter("Stadt"));

						storage.set("Adresse", Adresse);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Page3.jsp");

						break;

					case "Page3" :

						break;

				}
			} catch (NumberFormatException exception) {
				// dispatcher should be left to the old page.
			}
		}

		dispatcher.forward(request, response);

	}
}

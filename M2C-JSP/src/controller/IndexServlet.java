
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
						Person person = (Person) storage.get("Person");
						if (person == null) {
							person = new Person();
						}
						person.setVorname(request.getParameter("Vorname"));

						storage.set("Person", person);
					}

					{
						Person person = (Person) storage.get("Person");
						if (person == null) {
							person = new Person();
						}
						person.setNachname(request.getParameter("Nachname"));

						storage.set("Person", person);
					}

					{
						Person person = (Person) storage.get("Person");
						if (person == null) {
							person = new Person();
						}
						person.setAlter(Integer.parseInt(request.getParameter("Alter")));

						storage.set("Person", person);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Page2.jsp");

						break;

					case "Page2" :

					{
						Adresse adresse = (Adresse) storage.get("Adresse");
						if (adresse == null) {
							adresse = new Adresse();
						}
						adresse.setStrasse(request.getParameter("Strasse"));

						storage.set("Adresse", adresse);
					}

					{
						Adresse adresse = (Adresse) storage.get("Adresse");
						if (adresse == null) {
							adresse = new Adresse();
						}
						adresse.setHausnummer(Integer.parseInt(request.getParameter("Hausnummer")));

						storage.set("Adresse", adresse);
					}

					{
						Adresse adresse = (Adresse) storage.get("Adresse");
						if (adresse == null) {
							adresse = new Adresse();
						}
						adresse.setStadt(request.getParameter("Stadt"));

						storage.set("Adresse", adresse);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Page3.jsp");

						break;

					case "Page3" :

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

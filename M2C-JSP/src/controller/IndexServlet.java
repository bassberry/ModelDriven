
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
						Person Person1 = (Person) storage.get("Person1");
						if (Person1 == null) {
							Person1 = new Person();
						}
						Person1.setName(request.getParameter("Name"));

						storage.set("Person1", Person1);
					}

						dispatcher = getServletContext().getRequestDispatcher("/Page2.jsp");

						break;

					case "Page2" :

					{
						Adresse Adresse1 = (Adresse) storage.get("Adresse1");
						if (Adresse1 == null) {
							Adresse1 = new Adresse();
						}
						Adresse1.setStrasse(request.getParameter("Strasse"));

						storage.set("Adresse1", Adresse1);
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

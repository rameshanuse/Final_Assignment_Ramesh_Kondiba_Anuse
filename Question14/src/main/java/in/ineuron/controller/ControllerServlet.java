package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 14. Create a Java servlet that reads the name of the user from a form and displays a
	 welcome message on the web page. The servlet should use the GET method to read
 	 the input data from the user.

 */

@WebServlet("/welcome")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String name = request.getParameter("name");

			String msg = "Welcome :: " + name;
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("/display.jsp");
			rd.forward(request, response);
		
	}

}

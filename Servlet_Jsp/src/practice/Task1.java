package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Task1")
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public Task1() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'Shit_JIS'>");
		out.println("<title> Servlet_JSP </title> ");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>HelloServlet</h1>");

		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
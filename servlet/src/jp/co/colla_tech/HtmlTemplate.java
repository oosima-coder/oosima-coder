package jp.co.colla_tech;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;

@WebServlet("/HtmlTemplate")
public class HtmlTemplate {

	static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'Shit_JIS'>");
		out.println("<title> ServletTask </title> ");
		out.println("</head>");
		out.println("<body>");
	}
	static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
}

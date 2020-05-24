package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task2")
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Task2() {
		super();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = Shift_JIS");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.format(date);

		out.println("<meta charset = 'Shif_JIS'>");
		out.println("<title> ServletTask </title> ");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>今日の日付: " + sdf.format(date) + "</h1>" );
		out.println("</body>");
		out.println("</html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

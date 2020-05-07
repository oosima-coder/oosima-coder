package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Task4() {
		super();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = Shift_JIS");
		PrintWriter out = response.getWriter();

		HtmlTemplate.header(out);
		String [] text1 = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		int i = new java.util.Random().nextInt(6);
		out.println("<p>↓占い結果↓</p>" );
		out.println("<h1>"+ text1[i] + "</h1>" );


		HtmlTemplate.footer(out);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

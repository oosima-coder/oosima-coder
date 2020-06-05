
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Result() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>結果</title>");
		out.println("</head>");
		out.println("<body>");

		String textbox = request.getParameter("name");
		String checkbox = request.getParameter("radio01");
		String checkbox2 = request.getParameter("select01");
		String area = request.getParameter("textArea");



		out.print("以下の内容でお問い合わせしました。回答をお待ちください。" + "<br>");
		out.print("名前:" + textbox + "様" + "<br>");
		out.print("性別:" + checkbox + "<br>");

		if(checkbox2.equals("about")) {
			out.print("お問い合わせ種類: 製品について" + "<br>");
		}else if(checkbox2.equals("trouble")) {
			out.print("お問い合わせ種類: 不具合やクレーム" + "<br>");
		}else {
			out.print("お問い合わせ種類: アフターサポート" + "<br>");
		}

		out.print("お問い合わせ内容:" + area + "<br>");

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}

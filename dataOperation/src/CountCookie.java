
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CountCookie() {
		super();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>訪問回数テスト</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>訪問回数テスト(クッキー)</h1>");

		Cookie cookie[] = request.getCookies();
		Cookie visitedCookie = null;

		if(cookie != null) {
			for(int i = 0; i < cookie.length; i++) {
				if(cookie[i].getName().equals("visited")) {
					visitedCookie = cookie[i];
				}
			}
			if(visitedCookie != null) {
				int visited  = Integer.parseInt(visitedCookie.getValue()) + 1;
				out.println("<p>");
				out.println(visited);
				out.println("回目の訪問です。</p>");

				visitedCookie.setValue(Integer.toString(visited));
				visitedCookie.setMaxAge(300);
				response.addCookie(visitedCookie);
			}else{
				out.println("<p>初めての訪問です。</p>");

				Cookie newCookie = new Cookie("visited", "1");
				newCookie.setMaxAge(300);
				response.addCookie(newCookie);
			}
		}else{
			out.println("<p>初めての訪問です。</p>");

			Cookie newCookie = new Cookie("visited", "1");
			newCookie.setMaxAge(300);
			response.addCookie(newCookie);
		}
		out.print("<a href= \"/dataOperation/CountCookie\">画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}

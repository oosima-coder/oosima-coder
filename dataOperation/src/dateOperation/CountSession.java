package dateOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CountSession")
public class CountSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CountSession() {
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
		out.print("<h1>訪問回数テスト(セッション)</h1>");
		
		HttpSession session =  request.getSession(false);
		
		if(session == null) {
			out.print("<p>初めての訪問です。</p>");
			session = request.getSession(true);
			session.setAttribute("visited", "1");
		}else {
			String visitedCnt = (String)session.getAttribute("visited");
			int visited = Integer.parseInt(visitedCnt);
			visited++;
			out.print("<p>"+visited+ "回目の訪問です。</p>");
			session.setAttribute("visited",Integer.toString(visited));
		
		}
		
	
		out.print("<a href= \"/dateOperation/CountCookie\">画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

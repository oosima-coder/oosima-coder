package practice;

import java.io.IOException;
import java.util.Date;

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

		Date today = new Date();
		String [] text1 = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		int i = new java.util.Random().nextInt(6);

		FortuneBean fortuneBean = new FortuneBean();
		fortuneBean.setToday(today);
		fortuneBean.setFortune(text1[i]);
		request.setAttribute("result", fortuneBean);
		request.getRequestDispatcher("/fortune_result.jsp").forward(request,  response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

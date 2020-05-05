package practice;

import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/FortuneBean")
public class FortuneBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date today ;
	private String fortune;

	public FortuneBean() {
		super();

	}
	public Date getToday() {
		return this.today;
	}
	public void setToday(Date today) {
		this.today = today;
	}

	public String getFortune() {
		return this.fortune;
	}
	public void setFortune(String fortune) {
		this.fortune = fortune;
	}


}

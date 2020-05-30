
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateemployee")
public class updateemployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public updateemployee() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oosima_DB", "oosima","pass");
				System.out.println("DB接続が成功しました");
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			request.setCharacterEncoding("UTF-8");
			String sql = "UPDATE employee SET name = ? WHERE id = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			//name
			String name = request.getParameter("name");
			ps.setString(1,name);

			//Striing→ int id
			String id = request.getParameter("id");
			int i = Integer.parseInt(id);
			ps.setInt(2, i);

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			//データベースの切断
			if (con != null) {
				try {
					con.close();
				}
				catch (SQLException e) {
					//DB切断失敗時の処理
					e.printStackTrace();
				}
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


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

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteEmployee() {
		super();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oosima_DB", "oosima","pass");
			System.out.println("DB接続が成功しました");

			request.setCharacterEncoding("UTF-8");
			String sql = "DELETE FROM employee WHERE id = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			String id = request.getParameter("id");
			int i = Integer.parseInt(id);
			ps.setInt(1, i);

			ps.executeUpdate(); // executeQueryではない　これ重要　
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {

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

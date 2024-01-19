package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04selectAll {

	public static void main(String[] args) {

		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		// ======전체 회원 조회======
		// ID 이름 나이 점수
		// smhrd1 스마트 20 100
		// smhrd2 스마트2 22 80
		// smhrd3 스마트3 21 95

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			String sql = "select * from jdbctest.bigdatamember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("======전체회원 조회=======");
			System.out.println("ID\t이름\t나이\t점수");

				while (rs.next()) {
					String id = rs.getString("ID");
					String name = rs.getString("b_name");
					int age = rs.getInt("age");
					int score = rs.getInt("score");

					System.out.println(id + "\t" + name + "\t" + age + "\t" + score);
				} 
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(rs != null)
					rs.close();
					
					if(psmt != null)
					psmt.close();
					
					if(conn != null)
					conn.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
		}

	}

}

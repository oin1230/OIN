package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {

		PreparedStatement psmt = null;
		Connection conn = null;

		// 회원 탈퇴
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게서 id, pw 입력받기
		System.out.print("탈퇴할 iD 입력하세요. : ");
		String id = sc.next();
		System.out.print("탈퇴한 ID의 PW 입력하세요. : ");
		String pw = sc.next();

		// 2. 회원탈퇴에 성공 => 회원탈퇴 성공
		// 회원탈퇴에 실패 => 회원탈퇴 실패

		try {

			// 1) 드라이버 동적 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			// 2) 연결할 통로 만들기(DriverManager.getConnection)
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공....");
			} else {
				System.out.println("연결 실패!!!!");
			}

			String sql = "delete from jdbctest.bigdatamember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원탈퇴 성공....");

			} else {
				System.out.println("회원탈퇴 실패!!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}

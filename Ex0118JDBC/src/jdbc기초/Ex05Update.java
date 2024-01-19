package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Ex05Update {

	public static void main(String[] args) {

		PreparedStatement psmt = null;
		Connection conn = null;
		
		

		// id, pw, 수정할 점수
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원정보 수정 ======");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("수정할 점수 입력 : ");
		int nScore = sc.nextInt();

		try {
			// 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";
			
			// 통로 연결
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			
			// 3. sql 구문전송
			String sql = "update jdbctest.bigdatamember set score = ? where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, nScore);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			
			// 4. sql문 실행
			int row = psmt.executeUpdate();
			
			// 5. 결과를 이용한 작업처리
			if (row > 0) {
				System.out.println("정보수정 완료....");
			} else {
				System.out.println("정보수정 실패!");
				System.out.println("ID와 PW를 확인해주세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

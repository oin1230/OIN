package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.cj.protocol.Resultset;

public class Ex02Login {

	public static void main(String[] args) {

		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;

		// 로그인 기능
		// 1.사용자에게 어아당허 비밀번호 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB 연결 통로 열기(url,user,password)
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			// 3. SQL 문 준비
			// 로그인 기능 >> 테이블에 일치하는 데이터가 있는지 확인 >> select
			// id,pw 일치하는 데이터의 모든 컬럼을 가져오기
			String sql = "select*from jdbctest.BIGDATAMEMBER where ID=? and PW=?";

			psmt = conn.prepareStatement(sql);
			// ? 인자 채워주기

			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 4. sql문 실행

			rs = psmt.executeQuery();
			// ResultSet이란? (executeQuery 의 리턴타입)
			// : 조회된 데이터를 테이블과 가은 형태로 표현해주는 집합 자료구조
			// : cursor를 가지고 있다.(처음에는 column을 가리키고 있음)
			// : cursor가 가리키고 있는 데이터만 가져올 수 있음
			// : rs.next(); ==> cursor 하나 내리는 작업

			if (rs.next() == true) {
				// 로그인에 성공
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				System.out.println(name + "(" + age + ")" + "님 환영합니다.");
			} else {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("아이디와 비밀번호를 확인해주세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			try {
				if (rs != null) {
					rs.close();
				}
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

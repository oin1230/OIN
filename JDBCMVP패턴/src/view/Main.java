package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// 디자인 패턴 : 계쏙 같은 문제가 발생해서, 이 문제를 해결하고자
		//            형식, 규칙을 지정해 놓은것
		// MVC패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들읨 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분
		

		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		System.out.println("==== 빅데이터반 회원관리 프로그램 ====");

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]회원삭제 [4]회원정보조회 [5]회원정보수정 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("===== 회원가입 =====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("점수 입력 : ");
				int score = sc.nextInt();
				
				// 데이터베이스에 접근해서 데이터 추가하기!
				// --> 앞으로 데이터베이스에 접근과 관련된 모든 역활은
				// --> DAO 담당
				
				// 1) DAO 꺼내오기
				MemberDAO dao = new MemberDAO();
				
				// 2. DAO에게 보내줄 데이터 한번에 묶기
				MemberDTO dto = new MemberDTO(id, pw, name, age, score);
				
				// 3) 회원가입 기능 사용하기
				int row = dao.join(dto);
				
				if (row > 0) {
					System.out.println("회원가입 성공....");
				} else {
					System.out.println("회원가입 실패!");
				}

				

			} else if (choice == 2) {

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

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

					String sql = "select*from jdbctest.BIGDATAMEMBER where ID=? and PW=?";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, id);
					psmt.setString(2, pw);

					rs = psmt.executeQuery();

					if (rs.next() == true) {
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

			} else if (choice == 3) {

				System.out.print("탈퇴할 iD 입력하세요. : ");
				String id = sc.next();
				System.out.print("탈퇴한 ID의 PW 입력하세요. : ");
				String pw = sc.next();

				try {

					Class.forName("com.mysql.cj.jdbc.Driver");

					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String password = "12345";

					conn = DriverManager.getConnection(url, user, password);

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

			} else if (choice == 4) {

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost/jdbctest";
					String user = "root";
					String password = "12345";

					conn = DriverManager.getConnection(url, user, password);

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
						if (rs != null)
							rs.close();

						if (psmt != null)
							psmt.close();

						if (conn != null)
							conn.close();

					} catch (SQLException e) {
						e.printStackTrace();
					}

				}

			} else if (choice == 5) {

				System.out.println("====== 회원정보 수정 ======");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("수정할 점수 입력 : ");
				int nScore = sc.nextInt();

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

					String sql = "update jdbctest.bigdatamember set score = ? where id = ? and pw = ?";

					psmt = conn.prepareStatement(sql);

					psmt.setInt(1, nScore);
					psmt.setString(2, id);
					psmt.setString(3, pw);

					int row = psmt.executeUpdate();

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

			} else {
				System.out.println("종료오오오오오옹ㅇ!오오옹!");
				break;
			}

		}


	}

}

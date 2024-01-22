package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB 연결 insert, delete, update, select 하는 코드들의 모음(DML)
	// 메소드 형태로 코드 작성

	// 1. 회원가입 메소드
	private PreparedStatement psmt = null;
	private Connection conn = null;
	private ResultSet rs = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결하는 메솓,
	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/jdbctest";
			String user = "root";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 사용한 자원을 반납하는 메소드

	private void getClose() {

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

	public int join(MemberDTO dto) {

		int row = 0;

		try {
			getConn();

			String sql = "insert into jdbctest.bigdatamember(id,pw,b_name,age,score) values (?, ?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			getClose();
			
		}
		return row;
	}
//////////////////////////////////////////회원가입 메소드 끝

	// 로그인 메소드
	public MemberDTO login(String id, String pw) {

		MemberDTO dto = null;

		try {

			getConn();

			String sql = "select*from jdbctest.BIGDATAMEMBER where ID=? and PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				String name = rs.getString("b_name");
				int age = rs.getInt("age");
				// rs에 있는 데이터 DTO에 옮기기
				dto = new MemberDTO(null, null, name, age, 0);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			getClose();
			
		}

		return dto;

	}

////////////////////////////////////////로그인 메소드 끝

	// 회원탈퇴 메소드
	public int delete(String id, String pw) {

		int row = 0;
		try {

			getConn();

			String sql = "delete from jdbctest.bigdatamember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			getClose();
			
		}

		return row;

	}
////////////////////////////////회원탈퇴 끝

	// 회원전체조회 메소드
	public ArrayList<MemberDTO> selectAll() {

		ArrayList<MemberDTO> dto = new ArrayList<MemberDTO>();

		try {

			getConn();

			String sql = "select * from jdbctest.bigdatamember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			// rs(커서를 가지고있음)
			while (rs.next()) {
				// 조회 결과(rs)에 있는 데이터 DTO로 옮겨 담기
				dto.add(new MemberDTO(rs.getString("ID"), null, rs.getString("b_name"), rs.getInt("age"),
						rs.getInt("score")));
				// ArrayList 이용해서 담기
//				dto = new new MemberDTO(rs.getString("ID"), null, rs.getString("b_name"), rs.getInt("age"), rs.getInt("score"));
//				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			getClose();
			
		}
		return dto;
	}

	public int update(MemberDTO dto) {

		int row = 0;
		try {

			getConn();

			String sql = "update jdbctest.bigdatamember set score = ? where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, dto.getScore());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			getClose();
			
		}

		return row;

	}
}

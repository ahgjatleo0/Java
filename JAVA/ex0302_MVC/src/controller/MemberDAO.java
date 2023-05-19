package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDTO;

public class MemberDAO {
	/*
	 * Controller 역할 담당 Model ▷ Data Access Object : 데이터에 접근하는 것을 도와주는 객체 --> DB와
	 * 연결해서 insert, delete, update, select 하는 코드들의 모음 --> 메소드 형태로 코드 작성
	 * 
	 */

	// 필드
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결 메소드
	private void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void getClose() {

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

//=========================== [1] 회원가입 메소드============================
	public int join(MemberDTO dto) {

		int row = 0;

		try {
			getConn();

			String sql = "INSERT INTO BIGDATAMEMBER VALUES(?,?,?,?,? ) ";

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

//======================= [2] 로그인 ========================
	public String login(MemberDTO dto) {

		String uName = null;

		try {
			getConn();

			String sql = "SELECT * FROM BIGDATAMEMBER WHERE ID = ? AND PW = ?  ";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();
			if (rs.next() == true) {
				uName = rs.getString("name");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			getClose();
		}
		return uName;

	}

//====================== [3] 회원탈퇴 =========================

	public int delete(MemberDTO dto) {

		int row = 0;

		try {

			getConn();

			String sql = "DELETE FROM BIGDATAMEMBER WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			getClose();

		}
		return row;

	}

//========================= [4] 회원조회 =========================
	public ArrayList<MemberDTO> selectAll() {

		MemberDTO dto = null;
		
		ArrayList<MemberDTO> list = new ArrayList<>();
		

		try {

			getConn();

			String sql = "SELECT * FROM BIGDATAMEMBER ORDER BY ID";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int score = rs.getInt("score");
				dto = new MemberDTO(id, name, age, score);
				
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

//========================= [5] 회원정보수정 =====================	

	public int update(MemberDTO dto) {

		int row = 0;

		try

		{

			getConn();

			String sql = "UPDATE BIGDATAMEMBER SET SCORE = ? WHERE ID = ? AND PW = ?";

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

package kr.or.kosa.dao;
/*
1. DBCP 사용
2. insert 
2.1 insert into mvcregister(id,pwd,email) values(?,?,?)
*/

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.or.kosa.dto.RegisterDto;
import kr.or.kosa.utils.ConnectionHelper;

public class RegisterDao {
	public int writeOk(RegisterDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = ConnectionHelper.getConnection("oracle");
			String sql = "insert into mvcregister(id,pwd,email) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getEmail());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn); // 반환 
		}
		return result;
	}
}

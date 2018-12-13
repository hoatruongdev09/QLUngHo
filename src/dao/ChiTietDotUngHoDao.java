package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import config.Database;

public class ChiTietDotUngHoDao {
	
	public void themChiTietDotUngHo(String maDotUngHo, String hinhThucUngHo, int soLuongUngHo) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "INSERT INTO CHI_TIET_DOT_UNG_HO(MaDotUngHo,HinhThucUngHo,SoLuongUngHo) VALUES(?,?,?)";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, maDotUngHo);
		stmt.setString(2, hinhThucUngHo);
		stmt.setInt(3, soLuongUngHo);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
	
	
}

































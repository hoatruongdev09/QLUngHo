package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import config.Database;

public class ChiTietDotNhanUngHoDao {

	public void xoaChiTiet(String maDotNhanUngHo, String hinhThucNhanUngHo) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "DELETE FROM CHI_TIET_DOT_NHAN_UNG_HO WHERE MaDotNhanUngHo = ? AND HinhThucNhanUngHo = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, maDotNhanUngHo);
		stmt.setString(2, hinhThucNhanUngHo);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}

}









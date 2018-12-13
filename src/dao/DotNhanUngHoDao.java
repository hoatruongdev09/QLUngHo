package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.ChiTietDotNhanUngHo;
import bean.DotNhanUngHoBean;
import bean.DotNhan_ChiTietDotNhan;
import config.Database;

public class DotNhanUngHoDao {
	
	public ArrayList<DotNhan_ChiTietDotNhan> danhSachChiTiet() throws Exception{
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM DOT_NHAN_UNG_HO JOIN CHI_TIET_DOT_NHAN_UNG_HO ON DOT_NHAN_UNG_HO.MaDotNhanUngHo = CHI_TIET_DOT_NHAN_UNG_HO.MaDotNhanUngHo";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ArrayList<DotNhan_ChiTietDotNhan> list= new ArrayList<DotNhan_ChiTietDotNhan>();
		DotNhan_ChiTietDotNhan tmp = null;
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			DotNhanUngHoBean nhanUH = new DotNhanUngHoBean(rs.getString(1), rs.getString(2), rs.getDate(3));
			ChiTietDotNhanUngHo chitiet = new ChiTietDotNhanUngHo(rs.getString(4), rs.getString(5), rs.getInt(6));
			tmp = new DotNhan_ChiTietDotNhan(nhanUH, chitiet);
			list.add(tmp);
		}
		stmt.close();
		cn.close();
		return list;
	}
	
}

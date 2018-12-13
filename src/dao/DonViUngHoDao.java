package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.DonViUngHoBean;
import config.Database;

public class DonViUngHoDao {

	public ArrayList<DonViUngHoBean> danhSachDonViUngHo() throws Exception{
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM DON_VI_UNG_HO";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		ArrayList<DonViUngHoBean> dsach = new ArrayList<DonViUngHoBean>();
		DonViUngHoBean tmp = null;
		while(rs.next()) {
			tmp = new DonViUngHoBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
			dsach.add(tmp);
		}
		stmt.close();
		cn.close();
		return dsach;
	}
	
	
}






















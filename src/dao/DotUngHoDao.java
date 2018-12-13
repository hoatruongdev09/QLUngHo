package dao;

import java.sql.*;
import java.util.ArrayList;

import bean.DotUngHoBean;
import config.Database;

public class DotUngHoDao {
	
	public ArrayList<DotUngHoBean> danhSachDotUngHo() throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM DOT_UNG_HO";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		ArrayList<DotUngHoBean> list = new ArrayList<DotUngHoBean>();
		DotUngHoBean tmp = null;
		while(rs.next()) {
			tmp = new DotUngHoBean(rs.getString(1), rs.getString(2), rs.getDate(3));
			list.add(tmp);
		}
		stmt.close();
		cn.close();
		return list;
	}
	public DotUngHoBean layThongTin(String madot) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM DOT_UNG_HO WHERE MaDotUngHo = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, madot);
		ResultSet rs = stmt.executeQuery();
		DotUngHoBean tmp = null;
		if(rs.next()) {
			tmp = new DotUngHoBean(rs.getString(1), rs.getString(2), rs.getDate(3));
		}
		stmt.close();
		cn.close();
		return tmp;
	}
	public String themDotUngHo(String maDonViUngHo, Date ngayUngHo) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "INSERT INTO DOT_UNG_HO(MaDotUngHo, MaDVUH, NgayUngHo) VALUES(?,?,?)";
		int count = demDotUngHo() + 1;
		String maDotUngHo = "DUH" + String.format("%03d", count);
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, maDotUngHo);
		stmt.setString(2, maDonViUngHo);
		stmt.setDate(3, ngayUngHo);
		stmt.executeQuery();
		stmt.close();
		cn.close();
		return maDotUngHo;
	}
	public void suaDotUngHo(String maDot, String maDonViUngHo, Date ngayUngHo) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "UPDATE DOT_UNG_HO SET MaDVUH = ?, NgayUngHo = ? WHERE MaDotUngHo = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, maDonViUngHo);
		stmt.setDate(2, ngayUngHo);
		stmt.setString(3, maDot);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
	
	public int demDotUngHo() throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT COUNT(MaDotUngHo) as num FROM DOT_UNG_HO";
		PreparedStatement stmt = cn.prepareStatement(sql);
		int count = 0;
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			count = rs.getInt(1);
		}
		stmt.close();
		cn.close();
		return count;
	}
}


















































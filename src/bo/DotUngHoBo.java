package bo;

import java.sql.Date;
import java.util.ArrayList;

import bean.DotUngHoBean;
import dao.DotUngHoDao;

public class DotUngHoBo {
	
	private DotUngHoDao dotUngHoDao;
	
	public DotUngHoBo() {
		dotUngHoDao = new DotUngHoDao();
	}
	public void suaDotUngHo(String maDot, String maDonViUngHo, Date ngayUngHo) throws Exception {
		dotUngHoDao.suaDotUngHo(maDot, maDonViUngHo, ngayUngHo);
	}
	public DotUngHoBean layThongTin(String madot) throws Exception {
		return dotUngHoDao.layThongTin(madot);
	}
	public ArrayList<DotUngHoBean> danhSachDotUngHo() throws Exception {
		return dotUngHoDao.danhSachDotUngHo();
	}
	public String themDotUngHo(String maDonViUngHo, Date ngayUngHo) throws Exception {
		return dotUngHoDao.themDotUngHo(maDonViUngHo, ngayUngHo);
	}
	public int demDotUngHo() throws Exception {
		return dotUngHoDao.demDotUngHo();
	}
}





















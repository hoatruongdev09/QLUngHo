package bo;

import java.util.ArrayList;

import bean.DotNhan_ChiTietDotNhan;
import dao.DotNhanUngHoDao;

public class DotNhanUngHoBo {
	private DotNhanUngHoDao dotNhanUngHoDao;
	
	public DotNhanUngHoBo() {
		dotNhanUngHoDao = new DotNhanUngHoDao();
	}
	public ArrayList<DotNhan_ChiTietDotNhan> danhSachChiTiet() throws Exception{
		return dotNhanUngHoDao.danhSachChiTiet();
	}
}

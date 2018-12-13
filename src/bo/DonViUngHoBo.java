package bo;

import java.util.ArrayList;

import bean.DonViUngHoBean;
import dao.DonViUngHoDao;

public class DonViUngHoBo {
	
	private DonViUngHoDao donViUngHoDao;
	
	public DonViUngHoBo() {
		donViUngHoDao = new DonViUngHoDao();
	}
	public ArrayList<DonViUngHoBean> danhSachDonViUngHo() throws Exception{
		return donViUngHoDao.danhSachDonViUngHo();
	}

}
























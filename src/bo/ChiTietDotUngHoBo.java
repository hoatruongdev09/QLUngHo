package bo;

import dao.ChiTietDotUngHoDao;

public class ChiTietDotUngHoBo {
	
	private ChiTietDotUngHoDao chiTietDotUngHoDao;
	
	public ChiTietDotUngHoBo() {
		chiTietDotUngHoDao = new ChiTietDotUngHoDao();
	}
	public void themChiTietDotUngHo(String maDotUngHo, String hinhThucUngHo, int soLuongUngHo) throws Exception {
		chiTietDotUngHoDao.themChiTietDotUngHo(maDotUngHo, hinhThucUngHo, soLuongUngHo);
	}
}

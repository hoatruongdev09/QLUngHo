package bo;

import dao.ChiTietDotNhanUngHoDao;

public class ChiTietDotNhanUngHo {
	private ChiTietDotNhanUngHoDao ctDotNhanUngHoDao;
	
	public ChiTietDotNhanUngHo() {
		ctDotNhanUngHoDao = new ChiTietDotNhanUngHoDao();
	}
	public void xoaChiTiet(String maDotNhanUngHo, String hinhThucNhanUngHo) throws Exception {
		ctDotNhanUngHoDao.xoaChiTiet(maDotNhanUngHo, hinhThucNhanUngHo);
	}
}

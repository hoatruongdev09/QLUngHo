package bean;

import java.sql.Date;

public class DotNhanUngHoBean {
	public String maDotNhanUngHo;
	public String maHoDan;
	public Date ngayNhanUngHo;
	public DotNhanUngHoBean(String maDotNhanUngHo, String maHoDan, Date ngayNhanUngHo) {
		super();
		this.maDotNhanUngHo = maDotNhanUngHo;
		this.maHoDan = maHoDan;
		this.ngayNhanUngHo = ngayNhanUngHo;
	}
	public String getMaDotNhanUngHo() {
		return maDotNhanUngHo;
	}
	public void setMaDotNhanUngHo(String maDotNhanUngHo) {
		this.maDotNhanUngHo = maDotNhanUngHo;
	}
	public String getMaHoDan() {
		return maHoDan;
	}
	public void setMaHoDan(String maHoDan) {
		this.maHoDan = maHoDan;
	}
	public Date getNgayNhanUngHo() {
		return ngayNhanUngHo;
	}
	public void setNgayNhanUngHo(Date ngayNhanUngHo) {
		this.ngayNhanUngHo = ngayNhanUngHo;
	}
	
	
}

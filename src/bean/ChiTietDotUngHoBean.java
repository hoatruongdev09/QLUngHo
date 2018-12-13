package bean;

public class ChiTietDotUngHoBean {
	public String maDotUngHo;
	public String hinhThucUngHo;
	public int soLuongUngHo;
	public ChiTietDotUngHoBean(String maDotUngHo, String hinhThucUngHo, int soLuongUngHo) {
		super();
		this.maDotUngHo = maDotUngHo;
		this.hinhThucUngHo = hinhThucUngHo;
		this.soLuongUngHo = soLuongUngHo;
	}
	public String getMaDotUngHo() {
		return maDotUngHo;
	}
	public void setMaDotUngHo(String maDotUngHo) {
		this.maDotUngHo = maDotUngHo;
	}
	public String getHinhThucUngHo() {
		return hinhThucUngHo;
	}
	public void setHinhThucUngHo(String hinhThucUngHo) {
		this.hinhThucUngHo = hinhThucUngHo;
	}
	public int getSoLuongUngHo() {
		return soLuongUngHo;
	}
	public void setSoLuongUngHo(int soLuongUngHo) {
		this.soLuongUngHo = soLuongUngHo;
	}
	
	
}

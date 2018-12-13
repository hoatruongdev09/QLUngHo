package bean;

public class DotNhan_ChiTietDotNhan {
	public DotNhanUngHoBean dot;
	public ChiTietDotNhanUngHo chiTiet;
	public DotNhan_ChiTietDotNhan(DotNhanUngHoBean dot, ChiTietDotNhanUngHo chiTiet) {
		super();
		this.dot = dot;
		this.chiTiet = chiTiet;
	}
	public DotNhanUngHoBean getDot() {
		return dot;
	}
	public void setDot(DotNhanUngHoBean dot) {
		this.dot = dot;
	}
	public ChiTietDotNhanUngHo getChiTiet() {
		return chiTiet;
	}
	public void setChiTiet(ChiTietDotNhanUngHo chiTiet) {
		this.chiTiet = chiTiet;
	}
	
	
}

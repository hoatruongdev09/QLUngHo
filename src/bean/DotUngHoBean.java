package bean;
import java.sql.*;
public class DotUngHoBean {
	public String maDotUngHo;
	public String maDonViUngHo;
	public Date ngayUngHo;
	public DotUngHoBean(String maDotUngHo, String maDonViUngHo, Date ngayUngHo) {
		super();
		this.maDotUngHo = maDotUngHo;
		this.maDonViUngHo = maDonViUngHo;
		this.ngayUngHo = ngayUngHo;
	}
	public String getMaDotUngHo() {
		return maDotUngHo;
	}
	public void setMaDotUngHo(String maDotUngHo) {
		this.maDotUngHo = maDotUngHo;
	}
	public String getMaDonViUngHo() {
		return maDonViUngHo;
	}
	public void setMaDonViUngHo(String maDonViUngHo) {
		this.maDonViUngHo = maDonViUngHo;
	}
	public Date getNgayUngHo() {
		return ngayUngHo;
	}
	public void setNgayUngHo(Date ngayUngHo) {
		this.ngayUngHo = ngayUngHo;
	}
	
}

package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DonViUngHoBean;
import bean.DotUngHoBean;
import bo.ChiTietDotUngHoBo;
import bo.DonViUngHoBo;
import bo.DotUngHoBo;

/**
 * Servlet implementation class DotUngHoController
 */
@WebServlet("/DotUngHoController")
public class DotUngHoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChiTietDotUngHoBo chiTietDotUngHoBo;
	private DonViUngHoBo donViUngHoBo;
	private DotUngHoBo dotUngHoBo;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DotUngHoController() {
        super();
        chiTietDotUngHoBo = new ChiTietDotUngHoBo();
        donViUngHoBo = new DonViUngHoBo();
        dotUngHoBo = new DotUngHoBo();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ArrayList<DotUngHoBean> dsDot = dotUngHoBo.danhSachDotUngHo();
			request.setAttribute("dsDot", dsDot);
			request.getRequestDispatcher("DanhSachDot.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if(request.getParameter("edit")!=null) {
			String madot = request.getParameter("madot");
			try {
				DotUngHoBean dotUngHo = dotUngHoBo.layThongTin(madot);
				ArrayList<DonViUngHoBean> dsDonVi = donViUngHoBo.danhSachDonViUngHo();
				request.setAttribute("dsDonVi", dsDonVi);
				request.setAttribute("dotUngHo", dotUngHo);
				request.getRequestDispatcher("ChinhSuaDotUngHo.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(request.getParameter("apply-change") != null) {
			String maDot = request.getParameter("madot");
			String maDonVi = request.getParameter("madonvi");
			String ngay = request.getParameter("ngayungho");
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date d = dd.parse(ngay);
				java.sql.Date ngayUngHo = new java.sql.Date(d.getTime());
				dotUngHoBo.suaDotUngHo(maDot, maDonVi, ngayUngHo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doGet(request, response);
			//response.getWriter().append(maDot +"; " + maDonVi+"; " + ngay);
		}
		if(request.getParameter("add") != null) {
			try {
				ArrayList<DonViUngHoBean> dsDonVi = donViUngHoBo.danhSachDonViUngHo();
				request.setAttribute("dsDonVi", dsDonVi);
				request.getRequestDispatcher("ThemDotUngHo.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(request.getParameter("apply-add") != null) {
			String maDonVi = request.getParameter("madonvi");
			String ngay = request.getParameter("ngayungho");
			String hinhThuc = request.getParameter("hinhthucungho");
			int slUngHo = Integer.parseInt(request.getParameter("soluongungho"));
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			
			
			try {
				Date d = dd.parse(ngay);
				java.sql.Date ngayUngHo = new java.sql.Date(d.getTime());
				String madot = dotUngHoBo.themDotUngHo(maDonVi, ngayUngHo);
				chiTietDotUngHoBo.themChiTietDotUngHo(madot, hinhThuc, slUngHo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doGet(request, response);
		}
	}

}

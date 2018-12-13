package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DotNhan_ChiTietDotNhan;
import bo.ChiTietDotNhanUngHo;
import bo.DotNhanUngHoBo;

/**
 * Servlet implementation class DotNhanUngHoController
 */
@WebServlet("/DotNhanUngHoController")
public class DotNhanUngHoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	private DotNhanUngHoBo dotNhanUngHoBo;
   	private ChiTietDotNhanUngHo ctDotNhanUngHoBo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DotNhanUngHoController() {
        super();
        // TODO Auto-generated constructor stub
        dotNhanUngHoBo = new DotNhanUngHoBo();
        ctDotNhanUngHoBo = new ChiTietDotNhanUngHo();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ArrayList<DotNhan_ChiTietDotNhan> listChiTiet = dotNhanUngHoBo.danhSachChiTiet();
			request.setAttribute("listChiTiet", listChiTiet);
			request.getRequestDispatcher("DanhSachChiTiet.jsp").forward(request, response);
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
		if(request.getParameter("delete") != null) {
			String maDot = request.getParameter("madot");
			String hinhThuc = request.getParameter("hinhthuc");
			try {
				ctDotNhanUngHoBo.xoaChiTiet(maDot, hinhThuc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doGet(request, response);
		}
	}

}

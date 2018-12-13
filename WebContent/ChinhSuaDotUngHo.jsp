<%@page import="bean.DonViUngHoBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.DotUngHoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="content/css/bootstrap.min.css">
<script src="content/js/bootstrap.min.js"></script>
</head>
<%
	ArrayList<DonViUngHoBean> dsDonVi = (ArrayList<DonViUngHoBean>)request.getAttribute("dsDonVi");
	int dsDonViSize = dsDonVi.size();
	DotUngHoBean dotUngHo = (DotUngHoBean)request.getAttribute("dotUngHo");
	DonViUngHoBean dv = null;
	for(int i = 0;i<dsDonViSize;i++){
		if(dotUngHo.getMaDonViUngHo().equals(dsDonVi.get(i).getMaDonViUngHo())){
			dv = dsDonVi.get(i);
			break;
		}
	}
%>
<body>
	<div class="container">
	  <h2>Chỉnh sửa đợt</h2>
	  <form action="DotUngHoController" method="post">
	    <div class="form-group">
	      <label for="email">Đơn vị ủng hộ:</label>
	      <select class="form-control" id="sel1" name="madonvi">
	      <option selected value="<%=dv.getMaDonViUngHo() %>"><%=dv.getHoTenNguoiDaiDien() %></option>
	      <%for(int i=0;i<dsDonViSize;i++){ %>
		    <option value="<%=dsDonVi.get(i).getMaDonViUngHo()%>"><%=dsDonVi.get(i).getHoTenNguoiDaiDien() %></option>
		   <%} %>
		  </select>
	    </div>
	    <div class="form-group">
	      <label for="pwd">Ngày ủng hộ</label>
	      <input type="date" class="form-control" id="pwd"  name="ngayungho" value="<%=dotUngHo.getNgayUngHo()%>">
	    </div>
	    <div class="checkbox">
	    </div>
	    <input type="hidden" name="madot" value="<%=dotUngHo.getMaDotUngHo()%>"> 
	    <button type="submit" name="apply-change" value=" " class="btn btn-default">Thay đổi</button>
	  </form>
	</div>
</body>
</html>
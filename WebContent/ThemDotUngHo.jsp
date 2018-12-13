<%@page import="bean.DonViUngHoBean"%>
<%@page import="java.util.ArrayList"%>
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
%>
<body>
	<div class="container">
  <h2>Thêm đợt ủng hộ</h2>
  <form action="DotUngHoController" method="post">
    <div class="form-group">
      <label for="email">Tên đơn vị:</label>
       <select class="form-control" id="sel1" name="madonvi" required>
	      <%for(int i=0;i<dsDonViSize;i++){ %>
		    <option value="<%=dsDonVi.get(i).getMaDonViUngHo()%>"><%=dsDonVi.get(i).getHoTenNguoiDaiDien() %></option>
		   <%} %>
		  </select>
    </div>
    <div class="form-group">
      <label for="pwd">Ngày ủng hộ:</label>
      <input type="date" class="form-control" id="pwd" name="ngayungho" required>
    </div>
     <div class="form-group">
      <label for="pwd">Hình thức ủng hộ:</label>
      <input type="Text" class="form-control" id="pwd" name="hinhthucungho" required>
    </div> 
    <div class="form-group">
      <label for="pwd">Số lượng ủng hộ:</label>
      <input type="number" class="form-control" id="pwd" name="soluongungho" required>
    </div>
    <button type="submit" class="btn btn-default" name="apply-add" value=" ">Thêm</button>
  </form>
</div>
</body>
</html>
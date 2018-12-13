<%@page import="java.util.ArrayList"%>
<%@page import="bean.DotNhan_ChiTietDotNhan"%>
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
	ArrayList<DotNhan_ChiTietDotNhan> listChiTiet = (ArrayList<DotNhan_ChiTietDotNhan>)request.getAttribute("listChiTiet");
	int sizeList = listChiTiet.size();
%>
<body>
	<div class="container">
  <h2>Danh sách chi tiết</h2>          
  <table class="table">
    <thead>
      <tr>
        <th>Mã đợt nhận ủng hộ</th>
        <th>Mã hộ dân</th>
        <th>Ngày nhận ủng hộ</th>
        <th>Hình thức nhận ủng hộ</th>
        <th>Số lượng</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    <%for(int i=0;i<sizeList;i++){%>
     	<tr>
	        <td><%=listChiTiet.get(i).getDot().getMaDotNhanUngHo() %></td>
	        <td><%=listChiTiet.get(i).getDot().getMaHoDan() %></td>
	        <td><%=listChiTiet.get(i).getDot().getNgayNhanUngHo() %></td>
          	<td><%=listChiTiet.get(i).getChiTiet().getHinhThucNhanUngHo() %></td>
            <td><%=listChiTiet.get(i).getChiTiet().getSoLuongNhanUngHo() %></td>
            <form action="DotNhanUngHoController" method="post">
            <input type="hidden" name="madot" value="<%=listChiTiet.get(i).getChiTiet().getMaDotNhanUngHo() %>">
            <input type="hidden" name="hinhthuc" value="<%=listChiTiet.get(i).getChiTiet().getHinhThucNhanUngHo() %>">
           		<td><button type="submit" name="delete" value=" " class="btn btn-primary">Xóa</button></td>
            </form>
	      </tr>
    <%} %>
    </tbody>
  </table>
</div>
</body>
</html>
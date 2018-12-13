<%@page import="bean.DotUngHoBean"%>
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
	ArrayList<DotUngHoBean> dsDot = (ArrayList<DotUngHoBean>)request.getAttribute("dsDot");
	int dsDotSize = dsDot.size();
%>
<body>
	<div class="container">
  <h2>Danh sách đợt</h2>           
  <table class="table">
    <thead>
      <tr>
        <th>Mã đợt</th>
        <th>Mã đơn vị ủng họ</th>
        <th>Ngày ủng hộ</th>
        <form action="DotUngHoController" method="post""> 
        	<th><td><button type="submit" name="add" value=" " class="btn btn-primary">Thêm</button></td></th>
        </form>
      </tr>
    </thead>
    <tbody>
    <%for(int i = 0; i < dsDotSize; i++){ %>
       <tr>
        <td><%=dsDot.get(i).getMaDotUngHo() %></td>
        <td><%=dsDot.get(i).getMaDonViUngHo() %></td>
        <td><%=dsDot.get(i).getNgayUngHo() %></td>
        <form action="DotUngHoController" method="post">
       		<input type="hidden" name="madot" value="<%=dsDot.get(i).getMaDotUngHo()%>">
       		<td><button type="submit" name="edit" value=" " class="btn btn-primary">Sửa</button></td>
        </form>
      </tr>
    <%} %>
    </tbody>
  </table>
</div>
</body>
</html>
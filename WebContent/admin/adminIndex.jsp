<%@page import="com.jackie.bean.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="../frame/header.jsp"></jsp:include>
<body>
<%Admin admin=(Admin)session.getAttribute("admin"); %>
<h1>欢迎您，<%=admin.getUsername() %></h1>
</body>

	<jsp:include page="../frame/footer.jsp"></jsp:include>
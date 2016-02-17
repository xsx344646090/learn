<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%String basePath=request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<center>
		<h2>Hello World!</h2>
		<shiro:guest>
			<a href="<%=basePath%>/login">用户登录</a>
		</shiro:guest>
		<shiro:user>
			<a href="<%=basePath%>/admin">用户列表</a>
			<shiro:hasRole name="admin">后台管理</shiro:hasRole>
			<a href="<%=basePath%>/logout">注销</a>
		</shiro:user> 
	</center>
</body>
</html>

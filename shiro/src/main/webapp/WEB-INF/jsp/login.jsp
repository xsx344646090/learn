<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	<center>
		<h3>${msg}</h3>
		<form method="post">
			userName:<input type="text" name="userName" value=""><br>
			password:<input type="password" name="password" value=""><br>
			<input type="submit" value="登录">
		</form>
	</center>
</body>
</html>
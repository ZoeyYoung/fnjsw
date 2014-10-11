<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link href="${ctx}/static/lib/bootstrap/2.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${ctx}/static/lib/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">
function login(){
	var username = $("#username").val();
	var password = $("#password").val();
	if(null == username || "" == username){
		alert('请输入用户名');
		return false;
	}
	if(null == password || "" == password){
		alert('请输入密码');
		return false;
	}
	
	$.ajax({
		type: 'POST',
		async : true,
		cache : false,
		dataType : "text",
		data : {"username" : username, "password" : password},
		url : "${ctx}/user/login",
		success : function(data){
			if(data && null != data && "success" == data){
/* 				alert('成功'); */
 				window.location="${ctx}/detail/list"; 
			}else{
				alert('帐号或密码错误,请重新输入');
				return false;
			}
		},
		error : function(data){
			alert('帐号或密码错误,请重新输入');
		}
	});
	
}
</script>
</head>
<body>
	<br>
	<div class="row offset1">
		<input id="username" type="text" value="用户名" onfocus="if (value =='用户名'){value =''}" onblur="if (value ==''){value='用户名'}">
		<input id="password" type="password" value="" onfocus="if (value =='密码'){value =''}">
		<button type="button" class="btn btn-primary" onclick="login()" id="bnt">登录</button>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<%@ include file="basic/base.jsp"%>
<title>登陆</title>
</head>
<body>
	<br>
	<div>
		<b>插入一个用户</b> <input id="username" type="text" value="用户名"
			onfocus="if (value =='用户名'){value =''}"
			onblur="if (value ==''){value='用户名'}"> <input id="password"
			type="password" value="" onfocus="if (value =='密码'){value =''}">
		<button type="button" class="btn btn-primary" onclick="insert()"
			id="bnt">插入</button>
	</div>
	<br>
			
	<div>
		<form id="queryForm">
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span2">
						<span>id：
						<input id="id" name="id" type="text"/>
						</span>
					</div>
					<div class="span3">
						<span>用户名：
						<input id="uName" name="name" type="text"/>
						</span>
					</div>
					<div class="span3">
						<span>密码：
						<input id="uPwd" name="pwd" type="text"/>
						</span>
					</div> 
					<div class="span3">
						<button type="button" style="width:60px" class="btn btn-primary btn-small" onclick="f_search()">查询</button>
						<button type="button" style="width:60px" class="btn btn-small" onclick="f_reset()">重置</button>
					</div>  
				</div>
			</div>
		</form>
	</div>
	
	<div>
		<b>已经存在的用户如下：</b>
		<div>
			<table id="userListTable"></table>
		</div>
	</div>

	<br>
	<div>
		<input id="mid" name="id" readonly value="1" type="text"/>
		<input id="mname" name="name" type="text"/>
		<input id="mpwd" name="pwd" type="text"/>
		<button type="button" style="width:60px" class="btn btn-primary btn-small" onclick="f_modify()">修改</button>
	</div>

	<br>
	<br>
	<div>
		<input id="deleteId" name="id" type="text"/>
		<button type="button" style="width:60px" class="btn btn-primary btn-small" onclick="f_delete()">删除</button>
	</div>
	<script type="text/javascript">
	var defModel = [
//			{
//				header : '用户列表',
//				name : 'userList',
//				width : 300,
//				align : 'left',
//				sort : 'serverSide'
/*				,
 				renderer : function(colValue, rowData, rowIndex) {
					var str = '<a href="javascript:void(0)" onclick="viewProcessDefDetail('
							+ rowData.id
							+ ')">'
							+ colValue
							+ '</a><br/><span style="color:black;">由 '
							+ rowData.createUserUid
							+ ' 在 '
							+ rowData.createDate + ' 创建</span>';
					return str;
				} */
//			},
			//此处添加遗漏的缩略名
			{
				header : 'Id',
				name : 'id',
/* 				width : 200, */
				align : 'center',
				sort : 'serverSide'
			},
			{
				header : '用户名',
				name : 'name',
/* 				width : 200, */
				align : 'center',
				sort : 'serverSide'
			},
			{
				header : '密码',
				name : 'pwd',
/* 				width : 200, */
				align : 'center',
				sort : 'serverSide'
/* 				,
				renderer : function(colValue, rowData, rowIndex) {
					var str = '<span style="color:black;">由 '
							+ rowData.updateUserUid + '<br/>在 ' + colValue
							+ ' 修改</span>';
					return str;
				} */
			}
			];

	$(document).ready(function() {
		var queryParam = $("#queryForm").serialize();
		$('#userListTable').omGrid({
				autoFit : true,
				limit : 10,
				title : "已注册用户",
				height : 200,
				dataSource : '${ctx}/user/query?'+ encodeURI(queryParam),
				colModel : defModel,
			});
	});
	
	// 搜索
	function f_search() {
		var queryParam = $("#queryForm").serialize();
		$('#userListTable').omGrid("setData", '${ctx}/user/query?'+encodeURI(queryParam));
	};
	
	// 重置
	function f_reset() {
		$("#uName").val('');
		$("#uPwd").val('');
		f_search();
	};
	
	// 修改
	function f_modify() {
		var id = $("#mid").val();
		var name = $("#mname").val();
		var mpwd = $("#mpwd").val();
		$.ajax({
			type : 'POST',
			async : true,
			cache : false,
			dataType : "text",
			data : {
				"id":id,
				"username" : name,
				"password" : mpwd
			},
			url : "${ctx}/user/updateUser",
			success : function(data) {
				if (data && null != data && "success" == data) {
					alert("修改成功!");
				} else {
					alert('修改失败!');
					return false;
				}
			},
			error : function(data) {
				alert('修改失败!');
			}
		});
	};

	// 删除
	function f_delete() {
		debugger;
		var id = $("#deleteId").val();
		$.ajax({
			type : 'POST',
			async : true,
			cache : false,
			dataType : "text",
			data : {
				"id":id
			},
			url : "${ctx}/user/deleteUser",
			success : function(data) {
				if (data && null != data && "success" == data) {
					alert("删除成功!");
				} else {
					alert('删除失败!');
					return false;
				}
			},
			error : function(data) {
				alert('删除失败!');
			}
		});
	}
	
	function insert() {
		var username = $("#username").val();
		var password = $("#password").val();

		$.ajax({
			type : 'POST',
			async : true,
			cache : false,
			dataType : "text",
			data : {
				"username" : username,
				"password" : password
			},
			url : "${ctx}/user/newUser",
			success : function(data) {
				if (data && null != data && "success" == data) {
					alert("插入成功!");
				} else {
					alert('插入失败!');
					return false;
				}
			},
			error : function(data) {
				alert('插入失败!');
			}
		});

	}
	</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<%@ include file="basic/base.jsp"%>
<title>一孩模块 档案管理</title>
</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">阜宁县人口计生证件管理系统</a>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <aside class="col-sm-3 col-md-2 sidebar">
          <nav class="sidebar-nav">
            <ul id="menu">
              <li class="active">
                <a href="#">
                  <span class="sidebar-nav-item-icon"></span>
                  <span class="sidebar-nav-item">一孩模块</span>
                  <span class="glyphicon arrow"></span>
                </a>
                <ul class="collapse in">
                  <li>
                    <a href="${ctx}/oneChild/new">
                      <span class="sidebar-nav-item-icon"></span>
                      档案录入
                    </a>
                  </li>
                  <li class="active">
                    <a href="${ctx}/oneChild/list">
                      <span class="sidebar-nav-item-icon"></span>
                      档案管理
                    </a>
                  </li>
                  <li>
                    <a href="https://github.com/onokumus/metisMenu/issues">
                      <span class="sidebar-nav-item-icon"></span>
                      统计报表
                    </a>
                  </li>
                </ul>
              </li>
              <li class="">
                <a href="#">二孩模块 <span class="glyphicon arrow"></span></a>
                <ul class="collapse" style="height: 0px;">
                  <li><a href="#">档案录入</a></li>
                  <li><a href="#">档案管理</a></li>
                  <li><a href="#">统计报表</a></li>
                </ul>
              </li>
              <li class="">
                <a href="#">系统管理 <span class="glyphicon arrow"></span></a>
                <ul class="collapse" style="height: 0px;">
                  <li><a href="#">用户管理</a></li>
                  <li><a href="#">区域调整</a></li>
                </ul>
              </li>
            </ul>
          </nav>
        </aside>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form id="queryForm" class="form-inline well" modelAttribute="ocaQueryParam">
                <label for="fname">姓名：</label>
                <input type="text" id="fname" name="fname"/>
                <label for="fidcardno">身份证号：</label>
                <input type="text" id="fidcardno" name="fidcardno"/>
                <label for="serviceno">办证编号：</label>
                <input type="text" id="serviceno" name="serviceno"/>
                <select type="text" id="year" name="year">
                    <option value="">--年份--</option>
                    <option value="2013">2013</option>
                    <option value="2014">2014</option>
                </select> 年
                <select type="text" id="month" name="month">
                    <option value="">--月份--</option>
                    <option value="1">1</option><option value="2">2</option>
                    <option value="3">3</option><option value="4">4</option>
                    <option value="5">5</option><option value="6">6</option>
                    <option value="7">7</option><option value="8">8</option>
                    <option value="9">9</option><option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                </select> 月
                <button type="button" style="width:60px" class="btn btn-primary" onclick="queryOca()">查询</button>
                <button type="reset" style="width:60px" class="btn btn-default" onclick="resetQueryForm()">重置</button>
            </form>
            <table id="ocaListTable"></table>
        </div>
      </div>
      </div>
    </div>
<script type="text/javascript">
var defModel = [
{
    header : '用户名',
    name : 'fname',
    align : 'center',
    sort : 'serverSide'
},
{
    header : '身份证号',
    name : 'fidcardno',
    align : 'center',
    sort : 'serverSide'
},
{
    header : '办证编号',
    name : 'serviceno',
    align : 'center',
    sort : 'serverSide'
},
{
  header : '操作',
  name: "",
  align : 'left',
  renderer : function(colValue, rowData, rowIndex) {
    var str = '<a href="javascript:void(0)" onclick="updateOca('
        + rowData.id
        + ')">编辑</a>'
        + '<a href="javascript:void(0)" onclick="deleteOca('
        + rowData.id
        + ')">删除</a>';
    return str;
  }
}
];
// 搜索
var queryOca = function() {
    $('#ocaListTable').omGrid("setData", '${ctx}/oneChild/query?' + encodeURI($("#queryForm").serialize()));
};
var updateOca = function(id) {
    window.location = "${ctx}/oneChild/update?id="+id;
};
var deleteOca = function(id) {
  console.log(id);
  $.ajax({
    type: 'POST',
    async: true,
    cache: false,
    dataType: "text",
    data: {
      "id": id
    },
    url : "${ctx}/oneChild/delete",
    success : function(data) {
      if (data && null != data && "success" == data) {
        alert("删除成功!");
        $('#ocaListTable').omGrid("setData", '${ctx}/oneChild/query');
      } else {
        alert('删除失败!');
        return false;
      }
    },
    error : function(data) {
      alert('删除失败!');
    }
  });
};
$(document).ready(function() {
  $('#ocaListTable').omGrid({
    autoFit: true,
    limit: 2,
    title: "一孩档案",
    height: 500,
    dataSource: '${ctx}/oneChild/query',
    method:'POST',
    colModel: defModel
  });
});
</script>
</body>
</html>

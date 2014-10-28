<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!doctype html>
<html>
<head>
<%@ include file="basic/base.jsp"%>
<title>一孩模块 档案录入</title>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed"
          data-toggle="collapse" data-target="#navbar"
          aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">toggle navigation</span>
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
              <li class="active">
                <a href="${ctx}/oneChild/new">
                  <span class="sidebar-nav-item-icon"></span>档案录入
                </a>
              </li>
              <li>
                <a href="${ctx}/oneChild/list">
                  <span class="sidebar-nav-item-icon"></span>档案管理
                </a>
              </li>
              <li>
                <a href="https://github.com/onokumus/metisMenu/issues">
                  <span class="sidebar-nav-item-icon"></span>统计报表
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
      <!-- 一孩录入标签 -->
      <ul class="nav nav-tabs" role="tablist">
        <li class="active"><a href="#tab0" role="tab" data-toggle="tab">基本信息</a></li>
        <c:if test="${action == 'update'}">
          <li><a href="#tab1" role="tab" data-toggle="tab">妊娠</a></li>
          <li><a href="#tab2" role="tab" data-toggle="tab">计生证件扫描</a></li>
          <li><a href="#tab3" role="tab" data-toggle="tab">准生证扫描</a></li>
          <li><a href="#tab4" role="tab" data-toggle="tab">备注</a></li>
        </c:if>
      </ul>
      <!-- Tab panes -->
      <div class="tab-content">
        <div class="tab-pane fade in active" id="tab0">
          <br>
          <sf:form action="${ctx}/oneChild/${action}"
              modelAttribute="oca" method="post">
            <input type="hidden" id="id" name="id" value="${oca.id}" />
            <!-- 育龄妇女基本信息 -->
            <fieldset>
              <legend>育龄妇女基本信息(*必填)</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label"><label for="fname">姓名：</label></td>
                    <td><sf:input id="fname" path="fname" size="16" /></td>
                    <td class="label"><label for="fidcardno">身份证号：</label></td>
                    <td><sf:input id="fidcardno" path="fidcardno" size="18" /></td>
                    <td class="label"><label for="fphone">联系电话：</label></td>
                    <td><sf:input id="fphone" path="fphone" size="16" /></td>
                    <td class="label"><label for="marriageidno">婚育证明号码：</label>
                    </td>
                    <td><sf:input id="marriageidno" path="marriageidno" size="16" /></td>
                  </tr>
                  <tr>
                    <td class="label"><label for="fpermanentaddr">户籍地址：</label></td>
                    <td colspan="8">
                      <select id="f1Pr" name="f1Pr" next="f1Ci">
                      </select> 省
                      <select id="f1Ci" name="f1Ci" next="f1Co">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 市
                      <select id="f1Co" name="f1Co" next="f1To">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 县
                      <select id="f1To" name="f1To" next="f1Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (镇)
                      <select id="f1Vi" name="f1Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (村)
                      <label for="fphouseno">门牌号</label>
                      <sf:input id="fphouseno" path="fphouseno" size="8" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label"><label for="faddress">现居住地址：</label></td>
                    <td colspan="8">
                      <select id="f2Pr" name="f2Pr" next="f2Ci">
                      </select> 省
                      <select id="f2Ci" name="f2Ci" next="f2Co">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 市
                      <select id="f2Co" name="f2Co" next="f2To">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 县
                      <select id="f2To" name="f2To" next="f2Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (镇)
                      <select id="f2Vi" name="f2Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (村)
                      <label for="fahouseno">门牌号</label>
                      <sf:input id="fahouseno" path="fahouseno" size="8" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label"><label for="fcompanyname">工作单位名称：</label></td>
                    <td colspan="8">
                      <sf:input id="fcompanyname" path="fcompanyname" size="100" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label"><label for="fcompanyaddr">工作单位地址：</label></td>
                    <td colspan="8">
                      <sf:input id="fcompanyaddr" path="fcompanyaddr" size="100" />
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <!-- 丈夫信息 -->
            <fieldset>
              <legend>丈夫信息(*必填)</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label"><label for="mname">姓名：</label></td>
                    <td><sf:input id="mname" path="mname" size="16" /></td>
                    <td class="label"><label for="midcardno">身份证号：</label></td>
                    <td><sf:input id="midcardno" path="midcardno" size="18" /></td>
                    <td class="label"><label for="mphone">联系电话：</label></td>
                    <td><sf:input id="mphone" path="mphone" size="16" /></td>
                    <td width="320">&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="label"><label for="mpermanentaddr">户籍地址：</label></td>
                    <td colspan="8">
                      <select id="m1Pr" name="m1Pr" next="m1Ci">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 省
                      <select id="m1Ci" name="m1Ci" next="m1Co">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 市
                      <select id="m1Co" name="m1Co" next="m1To">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 县
                      <select id="m1To" name="m1To" next="m1Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (镇)
                      <select id="m1Vi" name="m1Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (村)
                      <label for="mphouseno">门牌号</label>
                      <sf:input id="mphouseno" path="mphouseno" size="8" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label"><label for="maddress">现居住地址：</label></td>
                    <td colspan="8">
                      <select id="m2Pr" name="m2Pr" next="m2Ci">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 省
                      <select id="m2Ci" name="m2Ci" next="m2Co">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 市
                      <select id="m2Co" name="m2Co" next="m2To">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 县
                      <select id="m2To" name="m2To" next="m2Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (镇)
                      <select id="m2Vi" name="m2Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> (村)
                      <label for="mahouseno">门牌号</label>
                      <sf:input id="mahouseno" path="mahouseno" size="8" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label"><label for="mcompanyname">工作单位名称：</label></td>
                    <td colspan="8">
                      <sf:input id="mcompanyname" path="mcompanyname" size="100" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label"><label for="mcompanyaddr">工作单位地址：</label></td>
                    <td colspan="8">
                      <sf:input id="mcompanyaddr" path="mcompanyaddr" size="100" />
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <!-- 婚育情况 -->
            <fieldset>
              <legend>婚育情况(*必填)</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label"><label for="maritalstatus">婚姻状况：</label></td>
                    <td>
                      <sf:select id="maritalstatus" path="maritalstatus">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="初婚">初婚</sf:option>
                        <sf:option value="再婚">再婚</sf:option>
                      </sf:select>
                    </td>
                    <td class="label"><label for="marriageno">结婚证号：</label></td>
                    <td><sf:input id="marriageno" path="marriageno" size="16" /></td>
                    <td class="label"><label for="marriagedate">结婚时间：</label></td>
                    <td><sf:input id="marriagedate" path="marriagedate" size="16" /></td>
                  </tr>
                  <tr>
                    <td class="label"><label for="haschild">生育子女状况：</label></td>
                    <td><sf:input id="haschild" path="haschild" size="16" /></td>
                    <td class="label"><label for="isadopted">是否领养：</label></td>
                    <td>
                      <sf:select id="isadopted" path="isadopted">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="是">是</sf:option>
                        <sf:option value="否">否</sf:option>
                      </sf:select>
                    </td>
                    <td class="label"><label for="residenceno">居住证号：</label></td>
                    <td><sf:input id="residenceno" path="residenceno" size="16" /></td>
                    <td class="label"><label for="getresidencedate">领取居住证时间：</label></td>
                    <td><sf:input id="getresidencedate" path="getresidencedate" size="16" /></td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <!-- 办证情况 -->
            <fieldset>
              <legend>办证情况</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label"><label for="registrationaddr">办证地点：</label></td>
                    <td>
                      <select id="r1To" name="r1To" next="r1Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 镇
                      <select id="r1Vi" name="r1Vi">
                        <option value="-1" selected="">-----请选择-----</option>
                      </select> 村
                    </td>
                    <td class="label"><label for="serviceno">服务证号：</label></td>
                    <td><sf:input id="serviceno" path="serviceno" size="16" /></td>
                    <td class="label"><label for="registrationdate">办证时间：</label></td>
                    <td><sf:input id="registrationdate"
                        path="registrationdate" size="16" /></td>
                    <td width="320">&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="label"><label for="operator">经办人：</label></td>
                    <td><sf:input id="operator" path="operator" size="16" /></td>
                    <td class="label"><label for="opphone">联系电话：</label></td>
                    <td><sf:input id="opphone" path="opphone" size="16" /></td>
                    <td class="label"><label for="status">状态：</label></td>
                    <td width="400" colspan="2">
                      <sf:select id="status" path="status">
                        <sf:option value="正常">正常</sf:option>
                        <sf:option value="注销">注销</sf:option>
                      </sf:select>
                      <lable id="logoutreasonLabel" style="display:none;" for="logoutreason">注销原因</lable>
                      <sf:input id="logoutreason" path="logoutreason" style="display:none;" size="16"/>
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <div>
              <input type="submit" class="btn btn-primary" size="16" value="确　定" />
              <input type="reset" class="btn btn-default" size="16" value="重　置" />
            </div>
          </sf:form>
        </div>
        <div class="tab-pane" id="tab1"><br>
          <table class="table table-bordered">
            <thead>
              <th>序号</th>
              <th>服务时间</th>
              <th>服务结果</th>
              <th>服务人</th>
              <th>操作</th>
            </thead>
            <tbody>
              <c:forEach items= "${gis}" var="gi" varStatus="status">
              <tr id="giTr${gi.id}">
                <td>${status.count}</td>
                <td><fmt:formatDate value="${gi.servicetime}" pattern="yyyy-MM-dd"/></td>
                <td>
                  <span id="serviceResultSpan${gi.id}">${gi.serviceresult}</span>
                  <div id="serviceResult${gi.id}" style="display:none;"></div>
                </td>
                <td>
                  <span id="servicePersonSpan${gi.id}">${gi.serviceperson}</span>
                  <input type="text" id="servicePerson${gi.id}" name="updateServicePerson" style="display:none;"/>
                </td>
                <td>
                  <div id="btnGroup1${gi.id}">
                    <button type="button" onclick="updateGiInit(${gi.id})">修改</button>
                    <button type="button" onclick="deleteGi(${gi.id})">删除</button>
                  </div>
                  <div id="btnGroup2${gi.id}" style="display:none;">
                    <button type="button" onclick="updateGi(${gi.id})">确认</button>
                    <button type="button" onclick="cancelGi(${gi.id})">取消</button>
                  </div>
                </td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
          <br>
          <form name="addGiForm" action="${ctx}/oneChild/newGi/${oca.id}" method="POST">
            <input type="hidden" id="serviceResult" name="serviceResult" />
            <table>
              <tr>
                <td class="label"><label for="serviceResult">服务结果：</label></td>
                <td id="serviceResultSel"></td>
                <td class="label"><label for="servicePerson">服务人：</label></td>
                <td><input type="text" name="servicePerson" /></td>
                <td><button id="addGiBtn" type="button">添加</button></td>
              <tr>
            </table>
          </form>
        </div>
        <div class="tab-pane" id="tab2"><br>
          <div id="fpcPreviews row">
          <c:forEach items= "${fpcs}" var="fpc" varStatus="status">
            <div id="fpcImg${fpc.id}" class="col-sm-4 col-md-3">
              <div class="thumbnail">
                <img src="${ctx}/oneChild/preview/${fpc.id}" class="upload-image img-responsive" title="${fpc.filename}"/>
                <div class="caption">
                  <a href="javascript:;" class="upload-delete" title="删除" data-index="${fpc.id}" onclick="deleteFPC(${fpc.id})">删除</a>
                </div>
              </div>
            </div>
          </c:forEach>
          </div>
          <form id="uploadForm" name="uploadForm" style="clear:both;"
              action="${ctx}/oneChild/uploadFPC/${oca.id}"
              enctype="multipart/form-data" method="post">
            <div class="upload-box">
              <div class="upload-main">
                <div class="upload-choose">
                  <input id="fileImage" type="file" size="30" name="fileselect[]" multiple />
                  <span id="fileDragArea" class="upload-drag-area">或者将图片拖到此处</span>
                </div>
                <div id="preview" class="upload-preview"></div>
              </div>
              <div class="upload-submit">
                <button type="button" id="fileSubmit" class="upload-submit-btn">确认上传图片</button>
              </div>
              <div id="uploadInf" class="upload-inf"></div>
            </div>
          </form>
        </div>
        <div class="tab-pane" id="tab3"><br>
          <c:if test="${oca.zhunshengzheng != null && oca.zhunshengzheng != ''}">
          <div id="zszImg" class="col-sm-4 col-md-3">
            <div class="thumbnail">
              <img src="${ctx}/oneChild/previewZSZ/${oca.id}" class="upload-image img-responsive" title="${fpc.filename}"/>
              <div class="caption">
                <a href="javascript:;" class="upload-delete" title="删除" data-index="${oca.id}" onclick="deleteZSZ(${oca.id})">删除</a>
              </div>
            </div>
          </div>
          </c:if>
          <form id="uploadZSZForm" name="uploadForm" class="form-inline" style="clear:both;"
                action="${ctx}/oneChild/uploadZSZ/${oca.id}"
                enctype="multipart/form-data" method="post">
            <div class="form-group">
              <input type="file" name="zsz" />
            </div>
            <button type="submit" id="zszSubmit">确认上传图片</button>
          </form>
        </div>
        <div class="tab-pane" id="tab4"><br>
          <sf:form action="${ctx}/oneChild/updateComment"
              modelAttribute="oca" method="post">
            <input type="hidden" id="id" name="id" value="${oca.id}" />
            <sf:textarea id="comment" path="comment" class="form-control" rows="10"></sf:textarea><hr>
            <div>
              <input type="submit" class="btn btn-primary" size="16" value="确　定" />
              <input type="reset" class="btn btn-default" size="16" value="重　置" />
            </div>
          </sf:form>
        </div>
      </div>
    </div>
  </div>
</div>
<script src="${ctx}/static/lib/jquery/jquery.myplugin.js"></script>
<script src="${ctx}/static/script/zxxFile.js"></script>
<script>
//设定日期选择器的相关属性
var calOpts = {
  dateFormat: "yy/mm/dd"
};
$("#marriagedate").omCalendar(calOpts);
$("#getresidencedate").omCalendar(calOpts);
$("#registrationdate").omCalendar(calOpts);
$("#status").on('change', function() {
  if ($("#status").val() === "注销") {
    $("#logoutreason").show();
    $("#logoutreasonLabel").show();
  } else {
    $("#logoutreason").hide();
    $("#logoutreasonLabel").hide();
  }
});
if ($("#status").val() === "注销") {
  $("#logoutreason").show();
  $("#logoutreasonLabel").show();
}
var fiPr = [{
    code: "11",
    name: "北京市"
}, {
    code: "12",
    name: "天津市"
}, {
    code: "13",
    name: "河北省"
}];
$("#f1Pr, #f2Pr, #m1Pr, #m2Pr").empty();
$("#f1Pr, #f2Pr, #m1Pr, #m2Pr").append($("<option/>").text("-----请选择-----").attr("value",""));
for (var i = 0, l = fiPr.length; i < l; i++) {
    $("#f1Pr, #f2Pr, #m1Pr, #m2Pr").append($("<option/>").text(fiPr[i].name).attr("value", fiPr[i].code));
}
var appendNextOps = function(code, next) {
    $.getJSON("${ctx}/oneChild/queryDivision", {
        code: code
    }).always(function(data) {
        $("#" + next).empty();
        $("#" + next).append($("<option/>").text("-----请选择-----").attr("value",""));
        var nextOpts = data.divisions;
        for (var i = 0, l = nextOpts.length; i < l; i++) {
          $("#" + next).append($("<option/>").text(nextOpts[i].name).attr("value", nextOpts[i].code));
        }
    });
};
$("#f1Pr, #f1Ci, #f1Co, #f1To, #f2Pr, #f2Ci, #f2Co, #f2To, #m1Pr, #m1Ci, #m1Co, #m1To, #m2Pr, #m2Ci, #m2Co, #m2To").on('change', function() {
    appendNextOps($(this).has(":selected").val(), $(this).attr("next"));
});
////////////////////////////////////////////////////////////
// 妊娠增删改查
////////////////////////////////////////////////////////////
var selJson = {
    next: {
        id: "s2",
        opts: {
            "未孕": {
                name: "未孕"
            },
            "怀孕": {
                name: "怀孕",
                next: {
                    opts:  {
                        "1个月": { name: "1个月" },
                        "2个月": { name: "2个月" },
                        "3个月": { name: "3个月" },
                        "4个月": { name: "4个月" },
                        "5个月": { name: "5个月" },
                        "6个月": { name: "6个月" },
                        "7个月": { name: "7个月" },
                        "8个月": { name: "8个月" },
                        "9个月": { name: "9个月" }
                    }
                }
            },
            "生育": {
                name: "生育",
                next: {
                    opts: {
                        "男": { name: "男" },
                        "女": { name: "女" },
                        "双胞胎男": { name: "双胞胎男" },
                        "双胞胎女": { name: "双胞胎女" },
                        "龙凤胎": { name: "龙凤胎" },
                        "多胞胎": { name: "多胞胎" }
                    }
                }
            },
            "孕情消失": {
                name: "孕情消失",
                next: {
                    opts: {
                        "人工引流产": { name: "人工引流产" },
                        "意外": { name: "意外" },
                        "非法引流产": { name: "非法引流产" }
                    }
                }
            }
        }
    }
};
$("#serviceResultSel").MultipleLevelSelector({
    id: "s1",
    splitStr: " ",
    selJson: selJson
});
$("#addGiBtn").on('click', function() {
    $("#serviceResult").val($("#serviceResultSel").MultipleLevelSelector('getValue'));
    addGiForm.submit();
});
function updateGiInit(giId) {
    var selJson = {
        next: {
            id: "giSel2" + giId,
            opts: {
                "未孕": {
                    name: "未孕"
                },
                "怀孕": {
                    name: "怀孕",
                    next: {
                        opts:  {
                            "1个月": { name: "1个月" },
                            "2个月": { name: "2个月" },
                            "3个月": { name: "3个月" },
                            "4个月": { name: "4个月" },
                            "5个月": { name: "5个月" },
                            "6个月": { name: "6个月" },
                            "7个月": { name: "7个月" },
                            "8个月": { name: "8个月" },
                            "9个月": { name: "9个月" }
                        }
                    }
                },
                "生育": {
                    name: "生育",
                    next: {
                        opts: {
                            "男": { name: "男" },
                            "女": { name: "女" },
                            "双胞胎男": { name: "双胞胎男" },
                            "双胞胎女": { name: "双胞胎女" },
                            "龙凤胎": { name: "龙凤胎" },
                            "多胞胎": { name: "多胞胎" }
                        }
                    }
                },
                "孕情消失": {
                    name: "孕情消失",
                    next: {
                        opts: {
                            "人工引流产": { name: "人工引流产" },
                            "意外": { name: "意外" },
                            "非法引流产": { name: "非法引流产" }
                        }
                    }
                }
            }
        }
    };
    $("#giTr" + giId + " span").hide();
    $("#serviceResult" + giId).MultipleLevelSelector({
        id: "giSel1" + giId,
        splitStr: " ",
        selJson: selJson
    });
    $("#serviceResult" + giId).MultipleLevelSelector('setValue', $("#serviceResultSpan" + giId).text());
    $("#serviceResult" + giId).show();
    $("#servicePerson" + giId).show().val($("#servicePersonSpan" + giId).text());
    $("#btnGroup1" + giId).hide();
    $("#btnGroup2" + giId).show();
}
function updateGi(giId){
    $.post("${ctx}/oneChild/updateGi/" + giId, {
      "serviceResult": $("#serviceResult" + giId).MultipleLevelSelector('getValue'),
      "servicePerson": $("#servicePerson" + giId).val()
    }, function() {
      $("#serviceResultSpan" + giId).text($("#serviceResult" + giId).MultipleLevelSelector('getValue'));
      $("#servicePersonSpan" + giId).text($("#servicePerson" + giId).val());
      $("#giTr" + giId + " span").show();
      $("#btnGroup1" + giId).show();
      $("#btnGroup2" + giId).hide();
      $("#serviceResult" + giId).hide();
      $("#servicePerson" + giId).hide();
    });
}
function cancelGi(giId){
    $.post("${ctx}/oneChild/deleteGi/" + giId, function() {
        $("#giTr" + giId).remove();
    });
}
function deleteGi(giId){
    $.post("${ctx}/oneChild/deleteGi/" + giId, function() {
        $("#giTr" + giId).remove();
    });
}
////////////////////////////////////////////////////////////
// 计生证件扫描 图片上传预览
////////////////////////////////////////////////////////////
var params = {
    fileInput: $("#fileImage").get(0),
    dragDrop: $("#fileDragArea").get(0),
    upButton: $("#fileSubmit").get(0),
    url: $("#uploadForm").attr("action"),
    filter: function(files) {
        var arrFiles = [];
        for (var i = 0, file; file = files[i]; i++) {
            if (file.type.indexOf("image") == 0) {
                arrFiles.push(file);
            } else {
                alert('文件"' + file.name + '"不是图片。');
            }
        }
        return arrFiles;
    },
    onSelect: function(files) {
        var html = '', i = 0;
        $("#preview").html('<div class="upload-loading"></div>');
        var funAppendImage = function() {
            file = files[i];
            if (file) {
                var url = window.URL.createObjectURL(file);
                html += '<div id="uploadList' + i + '" class="upload-append-list">'
                        + '<img id="uploadImage' + i + '" src="' + url + '" class="upload-image" title="' + file.name + '"/>'
                        + '<p><a href="javascript:" class="upload-delete" title="删除" data-index="'+ i +'">删除</a><br/>'
                        + '</p><span id="uploadProgress' + i + '" class="upload-progress"></span></div>';
                i++;
                funAppendImage();
            } else {
                $("#preview").html(html);
                if (html) {
                    // 删除方法
                    $(".upload-delete").click(function() {
                        ZXXFILE.funDeleteFile(files[parseInt($(this).attr("data-index"))]);
                        return false;
                    });
                    // 提交按钮显示
                    $("#fileSubmit").show();
                } else {
                    // 提交按钮隐藏
                    $("#fileSubmit").hide();
                }
            }
        };
        funAppendImage();
    },
    onDelete: function(file) {
        $("#uploadList" + file.index).fadeOut();
    },
    onDragOver: function() {
        $(this).addClass("upload-drag-hover");
    },
    onDragLeave: function() {
        $(this).removeClass("upload-drag-hover");
    },
    onProgress: function(file, loaded, total) {
        var eleProgress = $("#uploadProgress" + file.index), percent = (loaded / total * 100).toFixed(2) + '%';
        eleProgress.show().html(percent);
    },
    onSuccess: function(file, response) {
        $("#uploadInf").append("<p>上传成功</p>");
    },
    onFailure: function(file) {
        $("#uploadInf").append("<p>图片" + file.name + "上传失败！</p>");
        $("#uploadImage" + file.index).css("opacity", 0.2);
    },
    onComplete: function() {
        // 提交按钮隐藏
        $("#fileSubmit").hide();
        // file控件value置空
        $("#fileImage").val("");
        $("#uploadInf").append("<p>当前图片全部上传完毕，可继续添加上传。</p>");
    }
};
ZXXFILE = $.extend(ZXXFILE, params);
ZXXFILE.init();
var deleteFPC = function(id) {
  $.ajax({
    type: 'POST',
    async: true,
    cache: false,
    url : "${ctx}/oneChild/deleteFPC/" + id,
    success : function(data) {
      if (data && null != data && "success" == data) {
        $("#fpcImg" + id).remove();
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
var deleteZSZ = function(id) {
  $.ajax({
    type: 'POST',
    async: true,
    cache: false,
    url : "${ctx}/oneChild/deleteZSZ/" + id,
    success : function(data) {
      if (data && null != data && "success" == data) {
        $("#zszImg").remove();
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
</script>
</body>
</html>

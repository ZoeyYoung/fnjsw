<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
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
        <div class="col-sm-3 col-md-2 sidebar">
          <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title">
                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseone" aria-expanded="true" aria-controls="collapseone">
                    一孩模块
                  </a>
                </h4>
              </div>
              <div id="collapseone" class="panel-collapse collapse in" role="tabpanel">
                <div class="panel-body">
                  <ul class="nav nav-sidebar">
                      <li><a href="#">档案录入</a></li>
                      <li><a href="list">档案管理</a></li>
                      <li><a href="#">统计报表</a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title">
                  <a data-toggle="collapse" data-parent="#accordion" href="#collapsetwo" aria-expanded="false" aria-controls="collapsetwo">
                    二孩模块
                  </a>
                </h4>
              </div>
              <div id="collapsetwo" class="panel-collapse collapse" role="tabpanel">
                <div class="panel-body">
                  <ul class="nav nav-sidebar">
                    <li><a href="#">档案录入</a></li>
                    <li><a href="#">档案管理</a></li>
                    <li><a href="#">统计报表</a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title">
                  <a data-toggle="collapse" data-parent="#accordion" href="#collapsethree" aria-expanded="false" aria-controls="collapsethree">
                    系统管理
                  </a>
                </h4>
              </div>
              <div id="collapsethree" class="panel-collapse collapse" role="tabpanel">
                <div class="panel-body">
                  <ul class="nav nav-sidebar">
                    <li><a href="">用户管理</a></li>
                    <li><a href="">区域调整</a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <sf:form method="post" action="${ctx}/oneChild/${action}" modelAttribute="oca">
            <input type="hidden" id="id" name="id" value="${oca.id}" />
            <fieldset>
              <legend>育龄妇女基本信息(*必填)</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label">
                      <label for="fname">姓名：</label>
                    </td>
                    <td>
                      <sf:input id="fname" path="fname" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="fidcardno">身份证号：</label>
                    </td>
                    <td>
                      <sf:input id="fidcardno" path="fidcardno" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="fphone">联系电话：</label>
                    </td>
                    <td>
                      <sf:input id="fphone" path="fphone" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="marriageidno">婚育证明号码：</label>
                    </td>
                    <td>
                      <sf:input id="marriageidno" path="marriageidno" size="16" />
                      <span class="require">*</span>
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="fpermanentaddr">户籍地址：</label>
                    </td>
                    <td colspan="8">
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 省
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 市
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 县
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 镇
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 村
                      <label for="fphouseno">门牌号</label>
                      <sf:input id="fphouseno" path="fphouseno" size="8" />
                      <span class="require">*</span>
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="faddress">现居住地址：</label>
                    </td>
                    <td colspan="8">
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 省
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 市
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 县
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 镇
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 村
                      <label for="fahouseno">门牌号</label>
                      <sf:input id="fahouseno" path="fahouseno" size="8" />
                      <span class="require">*</span>
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="fcompanyname">工作单位名称：</label>
                    </td>
                    <td colspan="8">
                      <sf:input id="fcompanyname" path="fcompanyname" size="100" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="fcompanyaddr">工作单位地址：</label>
                    </td>
                    <td colspan="8">
                      <sf:input id="fcompanyaddr" path="fcompanyaddr" size="100" />
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <fieldset>
              <legend>丈夫信息(*必填)</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label">
                      <label for="mname">姓名：</label>
                    </td>
                    <td>
                      <sf:input id="mname" path="mname" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="midcardno">身份证号：</label>
                    </td>
                    <td>
                      <sf:input id="midcardno" path="midcardno" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="mphone">联系电话：</label>
                    </td>
                    <td>
                      <sf:input id="mphone" path="mphone" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td width="280">&nbsp;</td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="mpermanentaddr">户籍地址：</label>
                    </td>
                    <td colspan="8">
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 省
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 市
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 县
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 镇
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 村
                      <label for="mphouseno">门牌号</label>
                      <sf:input id="mphouseno" path="mphouseno" size="8" />
                      <span class="require">*</span>
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="maddress">现居住地址：</label>
                    </td>
                    <td colspan="8">
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 省
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 市
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 县
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 镇
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 村
                      <label for="mahouseno">门牌号</label>
                      <sf:input id="mahouseno" path="mahouseno" size="8" />
                      <span class="require">*</span>
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="mcompanyname">工作单位名称：</label>
                    </td>
                    <td colspan="8">
                      <sf:input id="mcompanyname" path="mcompanyname" size="16" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="mcompanyaddr">工作单位地址：</label>
                    </td>
                    <td colspan="8">
                      <sf:input id="mcompanyaddr" path="mcompanyaddr" size="16" />
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <fieldset>
              <legend>婚育情况(*必填)</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label">
                      <label for="maritalstatus">婚姻状况：</label>
                    </td>
                    <td>
                      <sf:select id="maritalstatus" path="maritalstatus">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">已婚</sf:option>
                        <sf:option value="2">未婚</sf:option>
                      </sf:select>
                    </td>
                    <td class="label">
                      <label for="marriageno">结婚证号：</label>
                    </td>
                    <td>
                      <sf:input id="marriageno" path="marriageno" size="16"/>
                    </td>
                    <td class="label">
                      <label for="marriagedate">结婚时间：</label>
                    </td>
                    <td>
                      <sf:input id="marriagedate" path="marriagedate" size="16" />
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="haschild">生育子女状况：</label>
                    </td>
                    <td>
                      <sf:select id="haschild" path="haschild">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">有</sf:option>
                        <sf:option value="2">无</sf:option>
                      </sf:select>
                    </td>
                    <td class="label">
                      <label for="isadopted">是否领养：</div>
                    </td>
                    <td>
                      <sf:select id="isadopted" path="isadopted">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">是</sf:option>
                        <sf:option value="2">否</sf:option>
                      </sf:select>
                    </td>
                    <td class="label">
                      <label for="residenceno">居住证号：</label>
                    </td>
                    <td>
                      <sf:input id="residenceno" path="residenceno" size="16" />
                    </td>
                    <td class="label">
                      <label for="getresidencedate">领取居住证时间：</label>
                    </td>
                    <td>
                      <sf:input id="getresidencedate" path="getresidencedate" size="16" />
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <fieldset>
              <legend>办证情况</legend>
              <table class="table table-condensed">
                <tbody>
                  <tr>
                    <td class="label">
                      <label for="registrationaddr">办证地点：</label>
                    </td>
                    <td>
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 镇
                      <sf:select id="" path="">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">男</sf:option>
                        <sf:option value="2">女</sf:option>
                      </sf:select> 村
                    </td>
                    <td class="label">
                      <label for="serviceno">服务证号：</label>
                    </td>
                    <td>
                      <sf:input id="serviceno" path="serviceno" size="16" />
                      <span class="require">*</span>
                    </td>
                  </tr>
                  <tr>
                    <td class="label">
                      <label for="registrationdate">办证时间：</label>
                    </td>
                    <td>
                      <sf:input id="registrationdate" path="registrationdate" size="16" />
                    </td>
                    <td class="label">
                      <label for="operator">经办人：</label>
                    </td>
                    <td>
                      <sf:input id="operator" path="operator" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="opphone">联系电话：</label>
                    </td>
                    <td>
                      <sf:input id="opphone" path="opphone" size="16" />
                      <span class="require">*</span>
                    </td>
                    <td class="label">
                      <label for="status">状态：</div>
                    </td>
                    <td>
                      <sf:select id="status" path="status">
                        <sf:option value="-1" selected="">-----请选择-----</sf:option>
                        <sf:option value="1">正常</sf:option>
                        <sf:option value="2">注销</sf:option>
                      </sf:select>
                    </td>
                  </tr>
                </tbody>
              </table>
            </fieldset>
            <fieldset>
              <table class="table table-condensed">
                <tr>
                  <td class="label"><label for="">妊娠：</label></td>
                  <td><sf:input path="" id="" /></td>
                  <td class="label"><label for="">计生证件扫描：</label></td>
                  <td><input type="file" /></td>
                  <td class="label"><label for="">准生证扫描：</label></td>
                  <td><input type="file" /></td>
                </tr>
                <tr>
                  <td class="label"><label for="remark">备注：</label></td>
                  <td colspan="5"><textarea rol="4" col="100"></textarea></td>
                </tr>
              </table>
            </fieldset>
            <div>
              <input type="submit" class="btn btn-primary" size="16" path="submit" value="确　定">
              <input type="reset" class="btn btn-default" size="16" path="reset" value="重　置">
            </div>
            </sf:form>
        </div>
      </div>
      </div>
    </div>
    <script>
    //设定日期选择器的相关属性
    var calOpts = {
        dateFormat: "yy/mm/dd"
    };
    $("#marriagedate").omCalendar(calOpts);
    $("#getresidencedate").omCalendar(calOpts);
    $("#registrationdate").omCalendar(calOpts);
    </script>
</body>
</html>

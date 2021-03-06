<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html><html>
<%@include file="../../jsp/common/common.jsp"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>代理商列表</title>

</head>
<body class="body">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>代理商列表</legend>
</fieldset>
<div class="my-btn-box">
    <span class="fl">
        <a class="layui-btn btn-add btn-default" id="btn-add" onclick="entryAgent();"><i class="layui-icon">&#xe654;</i>添加</a>
        <a class="layui-btn btn-add btn-default" id="btn-refresh" onclick="formAgentList.submit();"><i class="layui-icon">&#x1002;</i>刷新</a>
    </span>
    <span class="fr">
        <form id="formRoleList" method="post" action="${ctx}/backRole/list">
        <span class="layui-form-label">搜索条件：</span>
        <div class="layui-input-inline">
            <input type="text" autocomplete="off" placeholder="请输入名称" value="${agentName}" id="agentName" name="agentName" class="layui-input">
        </div>
        <button class="layui-btn mgl-20" onclick="formAgentList.submit();">查询</button>
        </form>
    </span>
</div>
<table class="layui-table" lay-even="" lay-skin="row">
    <colgroup>
        <col width="150">
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>代理商名称</th>
        <th>状态</th>
        <th>代理商级别</th>
        <th>法人姓名</th>
        <th>法人电话</th>
        <th>营业期限至</th>
        <th>统一社会信用代码/注册号/组织机构代码</th>
        <th>行业类型</th>
        <th>位置</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${pt.data}" var="agent" varStatus="status">
            <tr >
                <td>${agent.agentName}</td>
                <td>${agent.state}</td>
                <td>${agent.level}</td>
                <td>${agent.legalPersonName}</td>
                <td>${agent.legalPersonPhone}</td>
                <td><date:date value="${agent.operateEnd}" format="yyyy-MM-dd" /></td>
                <td>${agent.bizLicenseNo}</td>
                <td>${agent.industryTypeName}-${agent.industryTypeTwoName}</td>
                <td>${agent.provinceName}-${agent.cityName}-${agent.districtName}</td>
                <td>
                    <div class="layui-btn-group">
                        <c:if test="${loginUser.userType < 3 and loginUser.agentId != agent.agentId}"><button class="layui-btn layui-btn-sm" onclick="javascript:editAgent(${agent.agentId});"><i class="layui-icon">&#xe642;</i>编辑</button></c:if>
                        <c:if test="${loginUser.userType < 3 and loginUser.agentId != agent.agentId}"><button class="layui-btn layui-btn-sm" onclick="javascript:delAgent(${agent.agentId});"><i class="layui-icon">&#xe640;</i>删除</button></c:if>
                        <c:if test="${loginUser.userType < 4 }"><button class="layui-btn layui-btn-sm" onclick="javascript:detailAgent(${agent.agentId});"><i class="layui-icon">&#xe63c;</i>详情</button></c:if>
                    </div>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<div class="clear"></div>
<div class="layui-box layui-laypage layui-laypage-default">
    <!-- 分页标签 -->
    <page4top:page4top pageSize="${pt.pageSize }" pageNo="${pt.pageNo }"
                       url="${ctx}/agent/list"
                       total="${pt.total }" formName="top" />
</div>

<script src="${ctx}/js/agent/agent.js"></script>
</body>
</html>
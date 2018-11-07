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
        <a class="layui-btn btn-add btn-default" id="btn-add" onclick="entryBackRole();"><i class="layui-icon">&#xe654;</i>添加</a>
        <a class="layui-btn btn-add btn-default" id="btn-refresh" onclick="formRoleList.submit();"><i class="layui-icon">&#x1002;</i>刷新</a>
    </span>
    <span class="fr">
        <form id="formRoleList" method="post" action="${ctx}/backRole/list">
        <span class="layui-form-label">搜索条件：</span>
        <div class="layui-input-inline">
            <input type="text" autocomplete="off" placeholder="请输入名称" value="${name}" id="name" name="name" class="layui-input">
        </div>
        <button class="layui-btn mgl-20" onclick="formMenuList.submit();">查询</button>
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
        <th>ID</th>
        <th>代理商名称</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${pt.data}" var="agent" varStatus="status">
            <tr >
                <td>${agent.agentId}</td>
                <td>${agent.agentName}</td>

                <td>

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

<script src="${ctx}/js/backUser/backRole.js"></script>
</body>
</html>
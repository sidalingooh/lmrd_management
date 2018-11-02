<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html><html>
<%@include file="../../jsp/common/common.jsp"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>角色列表</title>

</head>
<body class="body">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>角色列表</legend>
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
        <th>角色名称</th>
        <th>描述</th>
        <th>角色类别</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${pt.data}" var="backRole" varStatus="status">
            <tr >
                <td>${backRole.backRoleId}</td>
                <td>${backRole.name}</td>
                <td>${backRole.description}</td>
                <td>
                    <c:if test="${backRole.roleSet eq '0'}">超级管理员</c:if>
                    <c:if test="${backRole.roleSet eq '1'}">管理员</c:if>
                    <c:if test="${backRole.roleSet eq '2'}">普通用户</c:if>
                    <c:if test="${backRole.roleSet eq '3'}">代理商</c:if>
                </td>
                <td>
                    <%--<a href="javascript:void(0);" onclick="javascript:editBackUser(${user.backUserId});" title="编辑">编辑</a>
                    <c:if test="${user.userType ne '0'}"><a href="javascript:void(0);" class="tab-a-right" onclick="javascript:delBackUser(${user.backUserId});" title="删除">删除</c:if>--%>
                    <div class="layui-btn-group">
                        <%--<button class="layui-btn layui-btn-sm"><i class="layui-icon"></i></button>--%>
                        <button class="layui-btn layui-btn-sm" onclick="javascript:editBackRole(${backRole.backRoleId});"><i class="layui-icon">&#xe642;</i>编辑</button>
                        <button class="layui-btn layui-btn-sm" onclick="javascript:delBackRole(${backRole.backRoleId});"><i class="layui-icon">&#xe640;</i>删除</button>
                        <c:if test="${backRole.roleSet ne '0' and loginUser.userType ne '0'}">
                            <button class="layui-btn layui-btn-sm" onclick="empowerment(${backRole.backRoleId});"><i class="layui-icon-auz">&#xe672;</i>赋权</button>
                        </c:if>
                        <c:if test="${loginUser.userType eq '0'}">
                            <button class="layui-btn layui-btn-sm" onclick="empowerment(${backRole.backRoleId});">赋权</button>
                        </c:if>
                        <%--<button class="layui-btn layui-btn-sm"><i class="layui-icon"></i></button>--%>
                        <%--<button class="layui-btn layui-btn-sm" onclick="javascript:editBackUser(${user.backUserId});"><i class="layui-icon">&#xe63c;</i>详情</button>--%>
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
                       url="${ctx}/backRole/list"
                       total="${pt.total }" formName="top" />
</div>

<script src="${ctx}/js/backUser/backRole.js"></script>
</body>
</html>
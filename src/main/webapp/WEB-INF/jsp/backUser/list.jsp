<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html><html>
<%@include file="../../jsp/common/common.jsp"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>用户列表</title>

</head>
<body class="body">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>列边框表格</legend>
</fieldset>
<div class="my-btn-box">
    <span class="fl">
        <a class="layui-btn btn-add btn-default" id="btn-add" onclick="entryBackUser();"><i class="layui-icon"></i>添加</a>
        <a class="layui-btn btn-add btn-default" id="btn-refresh"><i class="layui-icon">&#x1002;</i>刷新</a>
    </span>
    <span class="fr">
        <span class="layui-form-label">搜索条件：</span>
        <div class="layui-input-inline">
            <input type="text" autocomplete="off" placeholder="请输入搜索条件" class="layui-input">
        </div>
        <button class="layui-btn mgl-20">查询</button>
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
        <th>用户名</th>
        <th>姓名</th>
        <th>类型</th>
        <th>启用</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${pt.data}" var="user" varStatus="status">
            <tr >
                <td>${user.userName}</td>
                <td>${user.realName}</td>
                <td>
                    <c:choose>
                        <c:when test="${user.userType eq '2'}">普通用户</c:when>
                        <c:when test="${user.userType eq '1'}">管理员</c:when>
                        <c:when test="${user.userType eq '0'}">超级管理员</c:when>
                        <c:otherwise>暂无</c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:if test="${user.enable ne 1}">启用</c:if><c:if test="${user.enable eq 1}">未启用</c:if>
                </td>
                <td>

                    <%--<a href="javascript:void(0);" onclick="javascript:editBackUser(${user.backUserId});" title="编辑">编辑</a>
                    <c:if test="${user.userType ne '0'}"><a href="javascript:void(0);" class="tab-a-right" onclick="javascript:delBackUser(${user.backUserId});" title="删除">删除</c:if>--%>
                    <div class="layui-btn-group">
                        <%--<button class="layui-btn layui-btn-sm"><i class="layui-icon"></i></button>--%>
                        <button class="layui-btn layui-btn-sm" onclick="javascript:editBackUser(${user.backUserId});"><i class="layui-icon"></i>编辑</button>
                        <c:if test="${user.userType ne '0'}"><button class="layui-btn layui-btn-sm" onclick="javascript:delBackUser(${user.backUserId});"><i class="layui-icon"></i>删除</button></c:if>
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
                       url="${ctx}/backUser/list"
                       total="${pt.total }" formName="top" />
</div>

<script src="${ctx}/js/backUser/backUser.js"></script>
</body>
</html>
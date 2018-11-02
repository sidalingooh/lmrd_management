<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head>
<%@include file="../../jsp/common/common.jsp" %>
<title>添加角色</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">角色名称</label>
        <div class="layui-input-block">
            <input type="text" name="backRoleName" id="backRoleName" lay-verify="title" autocomplete="off" placeholder="请输入角色名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色分类</label>
        <div class="layui-input-inline">
            <select name="roleSet" id="roleSet" lay-filter="selectBackMenuByLevel">
                <option value="">请选择角色分类</option>
                <option value="1">管理员</option>
                <option value="2">普通用户</option>
                <option value="3">代理商</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">描述</label>
        <div class="layui-input-block">
            <input type="text" name="description" id="description" lay-verify="title" autocomplete="off" placeholder="请输入描述" class="layui-input">
        </div>
    </div>
</form>
</body>
<script src="${ctx}/js/backUser/backRole.js"></script>
<script>
    layui.use(['form'], function(){
        var form = layui.form;


        //$(".layui-fixbar").remove();
        //创建一个编辑器
    });
</script>
</html>
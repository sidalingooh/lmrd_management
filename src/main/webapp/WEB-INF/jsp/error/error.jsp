<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head>
<%@include file="../../jsp/common/common.jsp" %>
<title>添加角色</title>
</head><body class="body">
<div class="my-page-box">
    <h3>ERRER</h3>
    <p class="msg">${exception.getClass().getName()}</p>
    <p class="text">${exception.getMessage()}</p>
    ${exception.printStackTrace()}
    <div class="my-btn-box">
        <a class="layui-btn layui-btn-small" href="javascript:;">返回首页</a>
        <a class="layui-btn layui-btn-danger layui-btn-small " href="javascript:;">返回上页</a>
    </div>
</div>
</body>
<script>
    layui.use(['form'], function(){
        var form = layui.form;


        //$(".layui-fixbar").remove();
        //创建一个编辑器
    });
</script>
</html>
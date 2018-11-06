<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head>
<%@include file="../../jsp/common/common.jsp" %>
<title>添加行业</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">

    <div class="layui-form-item">
        <label class="layui-form-label">行业名称</label>
        <div class="layui-input-block">
            <input type="text" name="industryClassificationName" id="industryClassificationName" lay-verify="title" autocomplete="off" placeholder="请输入行业名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">行业代码</label>
        <div class="layui-input-block">
            <input type="text" name="industryClassificationCode" id="industryClassificationCode" lay-verify="title" autocomplete="off" placeholder="请输入行业代码" class="layui-input">
        </div>
    </div>
    <%--<div class="layui-form-item">
        <label class="layui-form-label">级别</label>
        <div class="layui-input-block">
            <input type="text" name="level" id="level" lay-verify="title" autocomplete="off" placeholder="请输入行业代码" class="layui-input">
        </div>
    </div>--%>
    <div class="layui-form-item">
        <label class="layui-form-label">行业级别</label>
        <div class="layui-input-inline">
            <select name="level" id="level" lay-filter="selectIndustryClassificationLevel">
                <option value="1">一级</option>
                <option value="2">二级</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">父级</label>
        <div class="layui-input-inline">
            <select name="parentId" id="parentId" lay-filter="selectBackMenuByLevel">
                <option value="0">无</option>
                <%--<c:forEach items="${list}" var="industryClassification" varStatus="status">
                    <option value="${industryClassification.industryClassificationId}">${industryClassification.industryClassificationName}</option>
                </c:forEach>--%>
            </select>
        </div>
    </div>


</form>
</body>
<script src="${ctx}/js/industryClassification/industryClassification.js"></script>
<script>
    layui.use(['form'], function(){
        var form = layui.form;


        //$(".layui-fixbar").remove();
        //创建一个编辑器
        form.on('select(selectIndustryClassificationLevel)', function(data){
            //layer.msg(data.value);
            selectIndustryClassificationLevel();
            form.render();
            /*layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });*/
            //layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });
    });
</script>
</html>
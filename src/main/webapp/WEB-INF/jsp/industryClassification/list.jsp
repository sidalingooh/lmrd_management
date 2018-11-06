<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html><html>
<%@include file="../../jsp/common/common.jsp"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>行业类型列表</title>

</head>
<body class="body">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>行业类型列表</legend>
</fieldset>
<div class="my-btn-box">
    <span class="fl">
        <a class="layui-btn btn-add btn-default" id="btn-add" onclick="entryIndustryClassification();"><i class="layui-icon">&#xe654;</i>添加</a>
        <a class="layui-btn btn-add btn-default" id="btn-refresh" onclick="formIndustryClassificationList.submit();"><i class="layui-icon">&#x1002;</i>刷新</a>
    </span>
    <span class="fr">
        <form id="formIndustryClassificationList" class="layui-form" method="post" action="${ctx}/industryClassification/list">

            <span class="layui-form-label">搜索条件：</span>
        <div class="layui-input-inline">
            <input type="text" autocomplete="off" placeholder="请输入行业名称" value="${industryClassificationName}" id="industryClassificationName" name="industryClassificationName" class="layui-input">
        </div>
            <button class="layui-btn mgl-20" onclick="formIndustryClassificationList.submit();">查询</button>

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
        <th>行业名称</th>
        <th>行业代码</th>
        <th>级别</th>
        <th>父级ID</th>
        <th>创建时间</th>
        <th>修改时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${pt.data}" var="industryClassification" varStatus="status">
            <tr >
                <td>${industryClassification.industryClassificationId}</td>
                <td>${industryClassification.industryClassificationName}</td>
                <td>${industryClassification.industryClassificationCode}</td>
                <td>${industryClassification.level}</td>
                <td>${industryClassification.parentId}</td>
                <td><date:date value="${industryClassification.createTime}" format="yyyy-MM-dd HH:mm:ss" /></td>
                <td><date:date value="${industryClassification.updateTime}" format="yyyy-MM-dd HH:mm:ss" /></td>
                <td>

                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-sm" onclick="javascript:editIndustryClassification(${industryClassification.industryClassificationId});"><i class="layui-icon">&#xe642;</i>编辑</button>
                        <button class="layui-btn layui-btn-sm" onclick="javascript:delIndustryClassification(${industryClassification.industryClassificationId});"><i class="layui-icon">&#xe640;</i>删除</button>

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
                       url="${ctx}/industryClassification/list"
                       total="${pt.total }" formName="top" />
</div>
<script src="${ctx}/js/industryClassification/industryClassification.js"></script>
<script>
    layui.use(['form'], function(){
        var form = layui.form;


        //$(".layui-fixbar").remove();
        //创建一个编辑器
    });
</script>
</body>
</html>
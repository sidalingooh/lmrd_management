<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html><html>
<%@include file="../../jsp/common/common.jsp"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>敏感词列表</title>

</head>
<body class="body">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>敏感词列表</legend>
</fieldset>
<div class="my-btn-box">
    <span class="fl">
        <a class="layui-btn btn-add btn-default" id="btn-add" onclick="entrySensitiveWord();"><i class="layui-icon">&#xe654;</i>添加</a>
        <a class="layui-btn btn-add btn-default" id="btn-refresh" onclick="formSensitiveWordList.submit();"><i class="layui-icon">&#x1002;</i>刷新</a>
    </span>
    <span class="fr">
        <form id="formSensitiveWordList" class="layui-form" method="post" action="${ctx}/sensitiveWord/list">

        <div class="layui-form-item">
            <label class="layui-form-label">搜索条件：</label>
            <div class="layui-input-inline">
            <select name="sensitiveType" id="sensitiveType" >
                        <option value="">请选择敏感词类型</option>
                        <option value="色情" <c:if test="${sensitiveType eq '色情'}">selected</c:if>>色情</option>
                        <option value="反动" <c:if test="${sensitiveType eq '反动'}">selected</c:if>>反动</option>
                        <option value="暴恐" <c:if test="${sensitiveType eq '暴恐'}">selected</c:if>>暴恐</option>
                        <option value="民生" <c:if test="${sensitiveType eq '民生'}">selected</c:if>>民生</option>
                        <option value="贪腐" <c:if test="${sensitiveType eq '贪腐'}">selected</c:if>>贪腐</option>
                        <option value="其他" <c:if test="${sensitiveType eq '其他'}">selected</c:if>>其他</option>
                  </select>
            </div>
            <button class="layui-btn mgl-20" onclick="formSensitiveWordList.submit();">查询</button>
        </div>

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
        <th>类型</th>
        <th>主题</th>
        <th>文本</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${pt.data}" var="sensitiveWord" varStatus="status">
            <tr >
                <td>${sensitiveWord.sensitiveWordId}</td>
                <td>
                        ${sensitiveWord.sensitiveType}
                </td>
                <td>${sensitiveWord.sensitiveTopic}</td>
                <td>${sensitiveWord.sensitiveWord}</td>

                <td>

                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-sm" onclick="javascript:editSensitiveWord(${sensitiveWord.sensitiveWordId});"><i class="layui-icon">&#xe642;</i>编辑</button>
                        <button class="layui-btn layui-btn-sm" onclick="javascript:delSensitiveWord(${sensitiveWord.sensitiveWordId});"><i class="layui-icon">&#xe640;</i>删除</button>

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
                       url="${ctx}/sensitiveWord/list"
                       total="${pt.total }" formName="top" />
</div>
<script src="${ctx}/js/sensitiveWord/sensitiveWord.js"></script>
<script>
    layui.use(['form'], function(){
        var form = layui.form;


        //$(".layui-fixbar").remove();
        //创建一个编辑器
    });
</script>
</body>
</html>
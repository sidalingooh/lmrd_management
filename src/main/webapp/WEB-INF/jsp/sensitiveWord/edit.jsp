<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head>
      <%@include file="../../jsp/common/common.jsp" %>
      <title>编辑关键词</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
      <input type="hidden" name="sensitiveWordId" id="sensitiveWordId" value="${sensitiveWord.sensitiveWordId}">

      <div class="layui-form-item">
            <label class="layui-form-label">敏感词类型</label>
            <div class="layui-input-inline">
                  <select name="sensitiveType" id="sensitiveType" lay-filter="selectBackMenuByLevel">
                        <option value="">请选择敏感词类型</option>
                        <option value="色情" <c:if test="${sensitiveWord.sensitiveType eq '色情'}">selected</c:if>>色情</option>
                        <option value="反动" <c:if test="${sensitiveWord.sensitiveType eq '反动'}">selected</c:if>>反动</option>
                        <option value="暴恐" <c:if test="${sensitiveWord.sensitiveType eq '暴恐'}">selected</c:if>>暴恐</option>
                        <option value="民生" <c:if test="${sensitiveWord.sensitiveType eq '民生'}">selected</c:if>>民生</option>
                        <option value="贪腐" <c:if test="${sensitiveWord.sensitiveType eq '贪腐'}">selected</c:if>>贪腐</option>
                        <option value="其他" <c:if test="${sensitiveWord.sensitiveType eq '其他'}">selected</c:if>>其他</option>
                  </select>
            </div>
      </div>
      <div class="layui-form-item">
            <label class="layui-form-label">主题</label>
            <div class="layui-input-block">
                  <input type="text" name="sensitiveTopic" id="sensitiveTopic" lay-verify="title" autocomplete="off" placeholder="请输入主题" class="layui-input" value="${sensitiveWord.sensitiveTopic}">
            </div>
      </div>
      <div class="layui-form-item">
            <label class="layui-form-label">敏感词内容</label>
            <div class="layui-input-block">
                  <input type="text" name="sensitiveWord" id="sensitiveWord" lay-verify="title" autocomplete="off" placeholder="请输入敏感词内容" class="layui-input" value="${sensitiveWord.sensitiveWord}">
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
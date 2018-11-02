<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html><html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@include file="../../jsp/common/common.jsp" %>
<title>编辑角色</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
      <input id="backRoleId" name="backRoleId" type="hidden" value="${backRole.backRoleId}"/>
      <div class="layui-form-item">
            <label class="layui-form-label">角色名称</label>
            <div class="layui-input-block">
                  <input type="text" name="backRoleName" id="backRoleName" lay-verify="title" autocomplete="off" placeholder="请输入角色名称" class="layui-input" value="${backRole.name}">
            </div>
      </div>
      <div class="layui-form-item">
            <label class="layui-form-label">角色分类</label>
            <div class="layui-input-inline">
                  <select name="roleSet" id="roleSet" lay-filter="selectBackMenuByLevel">
                        <option value="">请选择角色分类</option>
                        <option value="1" <c:if test="${backRole.roleSet eq '1'}">selected="selected"</c:if>>管理员</option>
                        <option value="2" <c:if test="${backRole.roleSet eq '2'}">selected="selected"</c:if>>普通用户</option>
                        <option value="3" <c:if test="${backRole.roleSet eq '3'}">selected="selected"</c:if>>代理商</option>
                  </select>
            </div>
      </div>
      <div class="layui-form-item">
            <label class="layui-form-label">描述</label>
            <div class="layui-input-block">
                  <input type="text" name="description" id="description" lay-verify="title" autocomplete="off" placeholder="请输入描述" class="layui-input" value="${backRole.description}">
            </div>
      </div>
</form>
</body>
<script src="${ctx}/js/backUser/backRole.js"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit;


        $(".layui-fixbar").remove();
        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');
    });
</script>
</html>
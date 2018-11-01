<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html><html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@include file="../../jsp/common/common.jsp" %>
<title>用户列表</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="addUaerName" id="addUaerName" lay-verify="title" autocomplete="off" placeholder="请输用户名" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-block">
            <input type="text" name="realName" id="realName" lay-verify="title" autocomplete="off" placeholder="请输姓名" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-block">
            <input type="password" name="password" id="password" lay-verify="title" autocomplete="off" placeholder="请输密码" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">启用</label>
        <div class="layui-input-block">
            <input type="checkbox" checked="" name="enable" id="enable" lay-skin="switch" lay-filter="switchTest" lay-text="是|否">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户类型</label>
        <div class="layui-input-inline">
            <select name="addUserType" id="addUserType" lay-filter="selectBackRoleByUserType">
                <option value="">请选择用户类型</option>
                <option value="2">普通用户</option>
                <option value="1">管理员</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">手机号码</label>
        <div class="layui-input-block">
            <input type="text" id="mobile" name="mobile" lay-verify="required" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">Email</label>
        <div class="layui-input-block">
            <input type="text" id="email" name="email" lay-verify="required" placeholder="请输入Email" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">单选框</label>
        <div class="layui-input-block" id="roleTd">
            <%--<input type="radio" name="roleId" id="roleId0" value="15" title="运营">--%>
        </div>
    </div>
    <%--<div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="form1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>--%>
</form>
</body>
<script src="${ctx}/js/backUser/backUser.js"></script>
<script>
    selectBackRoleByUserType();
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit;


        $(".layui-fixbar").remove();
        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            /*layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });*/
            //layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //
        form.on('select(selectBackRoleByUserType)', function(data){
            //layer.msg(data.value);
            selectBackRoleByUserType();
            form.render();
            /*layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });*/
            //layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(form1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            return false;
        });


    });
</script>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html><html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@include file="../../jsp/common/common.jsp" %>
<title>添加菜单</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">名称</label>
        <div class="layui-input-block">
            <input type="text" name="backMenuName" id="backMenuName" lay-verify="title" autocomplete="off" placeholder="请输入名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">菜单级别</label>
        <div class="layui-input-inline">
            <select name="level" id="level" lay-filter="selectBackMenuByLevel">
                <option value="1">一级菜单</option>
                <option value="2">二级菜单</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">父级菜单</label>
        <div class="layui-input-inline">
            <select name="parentId" id="parentId" >
                <option value="0">无</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">链接</label>
        <div class="layui-input-block">
            <input type="text" name="url" id="url" lay-verify="title" autocomplete="off" placeholder="请输入链接" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">序号</label>
        <div class="layui-input-block">
            <input type="text" name="orderNum" id="orderNum" lay-verify="title" autocomplete="off" placeholder="请输入序号" class="layui-input">（从小到大排序）
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">描述</label>
        <div class="layui-input-block">
            <input type="text" name="description" id="description" lay-verify="title" autocomplete="off" placeholder="请输入描述" class="layui-input">
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
<script src="${ctx}/js/backUser/backMenu.js"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit;


        $(".layui-fixbar").remove();
        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        /*form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });*/

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            /*layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });*/
            //layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //
        form.on('select(selectBackMenuByLevel)', function(data){
            //layer.msg(data.value);
            selectBackMenuByLevel();
            form.render();
            /*layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });*/
            //layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });



    });
</script>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head>
<%@include file="../../jsp/common/common.jsp" %>
<title>修改密码</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">原始密码</label>
        <div class="layui-input-block">
            <input type="password" name="oldPwd" id="oldPwd" lay-verify="title" autocomplete="off" placeholder="请输入原始密码" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">新密码</label>
        <div class="layui-input-block">
            <input type="password" name="newPwd" id="newPwd" lay-verify="title" autocomplete="off" placeholder="请输入新密码" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">确认密码</label>
        <div class="layui-input-block">
            <input type="password" name="confirmPwd" id="confirmPwd" lay-verify="title" autocomplete="off" placeholder="请输入确认密码" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <button type="reset" class="layui-btn layui-btn-danger btn-reset">重置</button>
        <button type="button" class="layui-btn btn-submit" lay-submit="" lay-filter="sub" onclick="updatePwd();">确认修改</button>
    </div>
</form>
</body>

<script>
    layui.use(['form'], function(){
        var form = layui.form;


        //$(".layui-fixbar").remove();
        //创建一个编辑器
    });

    function updatePwd() {
        var oldPwd = $("#oldPwd").val();
        var newPwd = $("#newPwd").val();
        var confirmPwd = $("#confirmPwd").val();
        if(oldPwd == "") {
            layer.msg("请输入原始密码!");
            return;
        }
        if(newPwd == "") {
            layer.msg("请输入新密码!");
            return;
        }
        if(confirmPwd == "") {
            layer.msg("请输入确认密码!");
            return;
        }
        if(newPwd != confirmPwd) {
            layer.msg("新密码与确认密码不一致请重新输入!");
            return;
        }
        $.ajax({
            url : rootPath+"/updatePwd",
            type : "post",
            data : {
                "oldPwd" : oldPwd,
                "newPwd" : newPwd,
                "confirmPwd" : confirmPwd
            },
            cache : false,
            async : false,
            success : function(data) {
                if(data!=""){
                    var json = eval('(' + data + ')');
                    var result=json.result;
                    if(result =="1") {
                        layer.msg(json.type);
                        setTimeout("refreshPage('/editPwd');",1000);
                    } else{
                        layer.msg(json.type);
                    }
                }
            }
        });
    }
</script>
</html>
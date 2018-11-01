<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html><html>
<%@include file="../../jsp/common/common.jsp"%>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>

</head>
<body class="login-body body">

<div class="login-box">
    <form class="layui-form layui-form-pane" method="get" action="">
        <div class="layui-form-item">
            <h3>朗明润达后台登录系统</h3>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">账号：</label>

            <div class="layui-input-inline">
                <input type="text" name="account" class="layui-input" lay-verify="account" placeholder="账号"
                       autocomplete="on" maxlength="20"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>

            <div class="layui-input-inline">
                <input type="password" name="password" class="layui-input" lay-verify="password" placeholder="密码"
                       maxlength="20"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">验证码：</label>

            <div class="layui-input-inline">
                <input type="number" name="code" class="layui-input" lay-verify="code" placeholder="验证码" maxlength="4"/><img
                    src="${ctx}/frame/static/image/v.png" alt="">
            </div>
        </div>
        <div class="layui-form-item">
            <button type="reset" class="layui-btn layui-btn-danger btn-reset">重置</button>
            <button type="button" class="layui-btn btn-submit" lay-submit="" lay-filter="sub">立即登录</button>
        </div>
    </form>
</div>

<script type="text/javascript">
    layui.use(['form', 'layer'], function () {

        // 操作对象
        var form = layui.form
            , layer = layui.layer
            , $ = layui.jquery;

        // 验证
        form.verify({
            account: function (value) {
                if (value == "") {
                    return "请输入用户名";
                }
            },
            password: function (value) {
                if (value == "") {
                    return "请输入密码";
                }
            },
            code: function (value) {
                if (value == "") {
                    return "请输入验证码";
                }
            }
        });

        // 提交监听
        form.on('submit(sub)', function (data) {
            /*layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });*/
            $.ajax({
                url : rootPath+"/login",
                type : "post",
                data : {
                    "userName" : data.field.account,
                    "password" : data.field.password
                },
                cache : false,
                async : false,
                success : function(data) {
                    if(data!=""){
                        var json = eval('(' + data + ')');
                        var result=json.result;
                        if(result =="0") {
                            window.location.href = rootPath + "/main";
                        } else if(result == "1"){
                            layer.msg(json.type);
                        } else if(result == "2"){
                            layer.msg(json.type);
                        }else{
                            layer.msg(json.type);
                        }
                    }
                }
            });
            //return false;
        });
        return;
        //var username = JSON.stringify(data.field).account;
        //var password = JSON.stringify(data.field).password;


        // you code ...
    })

</script>
</body>
</html>
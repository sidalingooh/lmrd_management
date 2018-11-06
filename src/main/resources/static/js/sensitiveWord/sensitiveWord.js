function entrySensitiveWord() {
    parent.layer.open({
        type: 2,
        title: '添加行业',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['700px', '50%'], //宽高
        content: rootPath+'/sensitiveWord/entry',
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容

            var sensitiveType = body.find("#sensitiveType").val();
            var sensitiveTopic = body.find("#sensitiveTopic").val();
            var sensitiveWord = body.find("#sensitiveWord").val();
            if(sensitiveType == "") {
                parent.layer.msg("请选择敏感词类型!");
                return;
            }
            if(sensitiveWord == "") {
                parent.layer.msg("请输入敏感词内容!");
                return;
            }
            $.ajax({
                url : rootPath+"/sensitiveWord/saveSensitiveWord",
                type : "post",
                data : {
                    "sensitiveType" : sensitiveType,
                    "sensitiveWord" : sensitiveWord,
                    "sensitiveTopic" : sensitiveTopic
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/sensitiveWord/list');",1000);
                    }else{
                        parent.layer.msg("操作失败!");
                    }
                }
            });
        },
        end: function () {
            location.reload();
        }
    });
}


function delSensitiveWord(sensitiveWordId) {
    parent.layer.confirm('确认删除？', {
        btn: ['确认','取消'] //按钮
    }, function(){
        //layer.msg('的确很重要', {icon: 1});
        $.ajax({
            url : rootPath+"/sensitiveWord/delSensitiveWord",
            type : "post",
            data : {
                "sensitiveWordId" : sensitiveWordId,
            },
            cache : false,
            async : false,
            success : function(data) {
                if (data=="succ") {
                    parent.layer.closeAll();
                    parent.layer.msg("操作成功!");
                    setTimeout("refreshPage('/sensitiveWord/list');",1000);
                } else {
                    parent.layer.msg("操作失败!");
                }
            }
        });
    }, function(){
        //
        parent.layer.closeAll();
    });
}


function editSensitiveWord(sensitiveWordId) {
    parent.layer.open({
        type: 2,
        title: '编辑角色',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['700px', '50%'], //宽高
        content: rootPath+'/sensitiveWord/edit?sensitiveWordId='+sensitiveWordId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容
            var sensitiveWordId = body.find("#sensitiveWordId").val();
            var sensitiveType = body.find("#sensitiveType").val();
            var sensitiveTopic = body.find("#sensitiveTopic").val();
            var sensitiveWord = body.find("#sensitiveWord").val();
            if(sensitiveType == "") {
                parent.layer.msg("请选择敏感词类型!");
                return;
            }
            if(sensitiveWord == "") {
                parent.layer.msg("请输入敏感词内容!");
                return;
            }
            $.ajax({
                url : rootPath+"/sensitiveWord/updateSensitiveWord",
                type : "post",
                data : {
                    "sensitiveWordId" : sensitiveWordId,
                    "sensitiveType" : sensitiveType,
                    "sensitiveWord" : sensitiveWord,
                    "sensitiveTopic" : sensitiveTopic
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                    }else{
                        parent.layer.msg("操作失败!");
                    }
                }
            });
        },
        end: function () {
            location.reload();
        }
    });
}

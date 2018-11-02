function entryBackMenu() {
    parent.layer.open({
        type: 2,
        title: '添加菜单',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['700px', '70%'], //宽高
        content: rootPath+'/backMenu/entry',
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            console.log(body.html()); //得到iframe页的body内容
            var backMenuName =  body.find("#backMenuName").val();
            var level =  body.find("#level").val();
            var parentId =  body.find("#parentId").val();
            var backUrl =  body.find("#url").val();
            var orderNum =  body.find("#orderNum").val();
            var description =  body.find("#description").val();
            if(backMenuName == "") {
                parent.layer.msg("请输入菜单名称!");
                return;
            }
            if(level == 2 && parentId == "") {
                parent.layer.msg("请选择父级菜单!");
                return;
            }
            if("" != orderNum) {
                var regu = /^[1-9]\d*$/;
                if (!regu.test(orderNum)) {
                    parent.layer.msg("序号只能为数字!");
                    return;
                }
            }
            if(description != "") {
                if(description.length > 15) {
                    parent.layer.msg("描述字符请小于15个字符!");
                    return;
                }
            }
            $.ajax({
                url : rootPath+"/backMenu/saveBackMenu",
                type : "post",
                data : {
                    "name" : backMenuName,
                    "level" : level,
                    "parentId" : parentId,
                    "url" : backUrl,
                    "orderNum" : orderNum,
                    "description" : description
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/backMenu/list');",1000);
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

function selectBackMenuByLevel() {
    var level = $("#level").val();
    $("#parentId").empty();
    if(level=="1") {
        $("#parentId").append("<option value='0'>无</option>");
        //$("#level").append("<option value='"+k+"'>"+ss+"</option>");
    } else {
        $.ajax({
            url : rootPath+"/backMenu/selectBackMenuByLevel",
            type : "post",
            data : {
                "level" : 1
            },
            cache : false,
            async : false,
            success : function(data) {
                $("#parentId").append("<option value=''>请选择父级菜单</option>");
                for(var i =0;i<data.length;i++){
                    $("#parentId").append("<option value='"+data[i].backMenuId+"'>"+data[i].name+"</option>");
                }
            }
        });
    }

}

function delBackMenu(backMenuId) {
    parent.layer.confirm('<div class="modal_info icon_warn">确定要删除此条数据？一经删除将无法修复！</div>', {
        btn: ['确认','取消'] //按钮
    }, function(){
        //layer.msg('的确很重要', {icon: 1});
        $.ajax({
            url : rootPath+"/backMenu/delBackMenu",
            type : "post",
            data : {
                "backMenuId" : backMenuId,
            },
            cache : false,
            async : false,
            success : function(data) {
                if (data=="succ") {
                    parent.layer.closeAll();
                    parent.layer.msg("操作成功!");
                    setTimeout("refreshPage('/backMenu/list');",1000);
                } else if(data=="backMenuHaveASon"){
                    parent.layer.msg("该父级菜单下有子级,请先删除子级!");
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

function editBackMenu(backMenuId) {
    parent.layer.open({
        type: 2,
        title: '编辑菜单',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        area: ['600px', '550px'], //宽高
        //content: '//'+rootPath+'/backRole/roleMenu.action?backRoleId='+backRoleId+'/'
        content: rootPath+'/backMenu/edit?backMenuId='+backMenuId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            console.log(body.html()); //得到iframe页的body内容
            //var backMenuName =  body.find("#backMenuName").val();
            var backMenuId = body.find("#backMenuId").val();
            var backMenuName =body.find("#backMenuName").val();
            var level =body.find("#level").val();
            var parentId = body.find("#parentId").val();
            var backUrl = body.find("#url").val();
            var orderNum = body.find("#orderNum").val();
            var description = body.find("#description").val();
            if(backMenuName == "") {
                parent.layer.msg("请输入菜单名称!");
                return;
            }
            if(level == 2 && parentId == "") {
                parent.layer.msg("请选择父级菜单!");
                return;
            }
            if("" != orderNum) {
                var regu = /^[1-9]\d*$/;
                if (!regu.test(orderNum)) {
                    parent.layer.msg("序号只能为数字!");
                    return;
                }
            }
            if(description != "") {
                if(description.length > 15) {
                    parent.layer.msg("描述字符请小于15个字符!");
                    return;
                }
            }
            $.ajax({
                url : rootPath+"/backMenu/updateBackMenu",
                type : "post",
                data : {
                    "name" : backMenuName,
                    "level" : level,
                    "parentId" : parentId,
                    "url" : backUrl,
                    "orderNum" : orderNum,
                    "description" : description,
                    "backMenuId" : backMenuId
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        //setTimeout("parent.layer.closeAll();",1000);
                        //setTimeout("refreshPage('/backMenu/list.action');",1000);
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
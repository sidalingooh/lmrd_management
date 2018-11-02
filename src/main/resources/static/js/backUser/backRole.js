function entryBackRole() {
    parent.layer.open({
        type: 2,
        title: '添加角色',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['700px', '50%'], //宽高
        content: rootPath+'/backRole/entry',
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容

            var backRoleName = body.find("#backRoleName").val();
            var roleSet = body.find("#roleSet").val();
            var description = body.find("#description").val();
            if(backRoleName == "") {
                parent.layer.msg("角色名称不能为空!");
                return;
            }
            if(roleSet == "") {
                parent.layer.msg("请选择角色分类!");
                return;
            }
            if(description != "") {
                if(description.length > 15) {
                    parent.layer.msg("描述字符请小于15个字符!");
                    return;
                }
            }
            $.ajax({
                url : rootPath+"/backRole/saveBackRole",
                type : "post",
                data : {
                    "name" : backRoleName,
                    "roleSet" : roleSet,
                    "description" : description
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/backRole/list');",1000);
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





function empowerment(backRoleId) {
    //iframe窗
    parent.layer.open({
        type: 2,
        title: '角色权限',
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        area: ['893px', '600px'],
        //content: '//'+rootPath+'/backRole/roleMenu.action?backRoleId='+backRoleId+'/'
        content: rootPath+'/backRole/roleMenu?backRoleId='+backRoleId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容
            var backRoleId = body.find("#backRoleId").val();//$("#backRoleId").val();
            var menuIdList ="";
            //body.find("input[name='roleId']:checked")
            body.find("input[name='parentBackMenuId']").each(
            //$("input[name='parentBackMenuId']").each(
                function(){
                    if(null != $(this).val() && "" != $(this).val()) {
                        menuIdList+=$(this).val()+",";
                    }

                }
            )
            body.find("input[name='menuId']").each(
            //$("input[name='menuId']").each(
                function(){
                    if(null != $(this).val() && "" != $(this).val()) {
                        menuIdList+=$(this).val()+",";
                    }

                }
            )
            /* if(menuIdList == "") {
                layer.msg("该角色下将没有任何权限");
                return;
            } */
            $.ajax({
                url : rootPath+"/backRole/saveRoleMenu",
                type : "post",
                data : {
                    "menuIdList" : menuIdList,
                    "backRoleId" : backRoleId
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        //setTimeout("refreshPage('/backRole/list.action');",1000);
                    }else{
                        parent.layer.msg("操作失败!");
                    }
                }
            });

        }
    });
}

function menuSeleted(obj,backMenuId,parentMenuId) {
    if(obj.checked) {
        // do something
        $("#menuId"+backMenuId).val(backMenuId);

    } else {
        $("#menuId"+backMenuId).val("");
    }
    var flag = 0;
    $("input[name='checkMenu"+parentMenuId+"']").each(
        function(){
            //alert($(this).val());
            if($(this).is(':checked')) {
                //menuIdList+=$(this).val()+",";
                flag=1;
            }

        }
    )
    if(flag==0) {
        $("#parentBackMenuId"+parentMenuId).val("");
        $("#parentBackMenuIdCheckbox"+parentMenuId).removeProp('checked');

    } else {
        $("#parentBackMenuId"+parentMenuId).val(parentMenuId);
        $("#parentBackMenuIdCheckbox"+parentMenuId).prop('checked', true);
    }
    //id="menuId${backMenu.backMenuId}"
}

function delBackRole(backRoleId) {
    parent.layer.confirm('确认删除？', {
        btn: ['确认','取消'] //按钮
    }, function(){
        //layer.msg('的确很重要', {icon: 1});
        $.ajax({
            url : rootPath+"/backRole/delBackRole",
            type : "post",
            data : {
                "backRoleId" : backRoleId,
            },
            cache : false,
            async : false,
            success : function(data) {
                if (data=="succ") {
                    parent.layer.closeAll();
                    parent.layer.msg("操作成功!");
                    setTimeout("refreshPage('/backRole/list');",1000);
                } else if(data=="backRoleIsUsing"){
                    parent.layer.msg("该角色正被使用无法删除!");
                } else if(data=="backRoleHaveMenu"){
                    parent.layer.msg("该角色下绑定菜单无法删除!");
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

function editBackRole(backRoleId) {
    parent.layer.open({
        type: 2,
        title: '编辑角色',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['700px', '50%'], //宽高
        content: rootPath+'/backRole/edit?backRoleId='+backRoleId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容
            var backRoleId = body.find("#backRoleId").val();
            var backRoleName = body.find("#backRoleName").val();
            var roleSet = body.find("#roleSet").val();
            var description = body.find("#description").val();
            if(backRoleName == "") {
                parent.layer.msg("角色名称不能为空!");
                return;
            }
            if(roleSet == "") {
                parent.layer.msg("请选择角色分类!");
                return;
            }
            if(description != "") {
                if(description.length > 15) {
                    parent.layer.msg("描述字符请小于15个字符!");
                    return;
                }
            }
            $.ajax({
                url : rootPath+"/backRole/updateBackRole",
                type : "post",
                data : {
                    "backRoleId" : backRoleId,
                    "name" : backRoleName,
                    "roleSet" : roleSet,
                    "description" : description
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

function updateBackRole() {
    var backRoleId = $("#backRoleId").val();
    var backRoleName = $("#backRoleName").val();
    var roleSet = $("#roleSet").val();
    var description = $("#description").val();
    $.ajax({
        url : rootPath+"/backRole/updateBackRole",
        type : "post",
        data : {
            "name" : backRoleName,
            "roleSet" : roleSet,
            "description" : description,
            "backRoleId" : backRoleId
        },
        cache : false,
        async : false,
        success : function(data) {
            if (data=="succ") {
                parent.layer.closeAll();
                //parent.layer.closeAll()
                parent.layer.msg("操作成功!");
                setTimeout("refreshPage('/backRole/list');",1000);
            }else{
                parent.layer.msg("操作失败!");
            }
        }
    });
}


function checkboxParentBackMenu(obj) {
    if($(obj).is(':checked')) {
        $("#parentBackMenuId"+$(obj).val()).val($(obj).val());
    } else {
        $("#parentBackMenuId"+$(obj).val()).val("");
    }

}
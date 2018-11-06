function entryIndustryClassification() {
    parent.layer.open({
        type: 2,
        title: '添加行业类型',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['700px', '50%'], //宽高
        content: rootPath+'/industryClassification/entry',
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容

            var industryClassificationName = body.find("#industryClassificationName").val();
            var industryClassificationCode = body.find("#industryClassificationCode").val();
            var parentId = body.find("#parentId").val();
            var level = body.find("#level").val();
            if(industryClassificationName == "") {
                parent.layer.msg("请输入行业名称!");
                return;
            }
            if(level == 2) {
                if(parentId == "" || parentId == 0) {
                    parent.layer.msg("请选择父级行业!");
                    return;
                }
            }
            $.ajax({
                url : rootPath+"/industryClassification/saveIndustryClassification",
                type : "post",
                data : {
                    "industryClassificationName" : industryClassificationName,
                    "industryClassificationCode" : industryClassificationCode,
                    "parentId" : parentId,
                    "level" : level
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/industryClassification/list');",1000);
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


function selectIndustryClassificationLevel() {
    var level = $("#level").val();
    $("#parentId").empty();
    var industryClassificationParentId = $("#industryClassificationParentId").val();
    if(level=="1") {
        $("#parentId").append("<option value='0'>无</option>");
        //$("#level").append("<option value='"+k+"'>"+ss+"</option>");
    } else {
        $.ajax({
            url : rootPath+"/industryClassification/selectByParentId",
            type : "post",
            data : {
                "level" : 1
            },
            cache : false,
            async : false,
            success : function(data) {
                $("#parentId").append("<option value=''>请选择父级行业</option>");
                for(var i =0;i<data.length;i++){
                    if(industryClassificationParentId==data[i].industryClassificationId) {
                        $("#parentId").append("<option value='"+data[i].industryClassificationId+"' selected='selected'>"+data[i].industryClassificationName+"</option>");
                    } else {
                        $("#parentId").append("<option value='"+data[i].industryClassificationId+"'>"+data[i].industryClassificationName+"</option>");
                    }

                }
            }
        });
    }
    layui.use(['form'], function(){
        layui.form.render();
    });
}


function editIndustryClassification(industryClassificationId) {
    parent.layer.open({
        type: 2,
        title: '编辑行业类型',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        area: ['600px', '550px'], //宽高
        //content: '//'+rootPath+'/backRole/roleMenu.action?backRoleId='+backRoleId+'/'
        content: rootPath+'/industryClassification/edit?industryClassificationId='+industryClassificationId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            var industryClassificationName = body.find("#industryClassificationName").val();
            var industryClassificationCode = body.find("#industryClassificationCode").val();
            var parentId = body.find("#parentId").val();
            var level = body.find("#level").val();
            if(industryClassificationName == "") {
                parent.layer.msg("请输入行业名称!");
                return;
            }
            if(level == 2) {
                if(parentId == "" || parentId == 0) {
                    parent.layer.msg("请选择父级行业!");
                    return;
                }
            }
            $.ajax({
                url : rootPath+"/industryClassification/updateIndustryClassification",
                type : "post",
                data : {
                    "industryClassificationName" : industryClassificationName,
                    "industryClassificationCode" : industryClassificationCode,
                    "parentId" : parentId,
                    "level" : level,
                    "industryClassificationId" : industryClassificationId
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


function delIndustryClassification(industryClassificationId) {
    parent.layer.confirm('<div class="modal_info icon_warn">确定要删除此条数据？</div>', {
        btn: ['确认','取消'] //按钮
    }, function(){
        //layer.msg('的确很重要', {icon: 1});
        $.ajax({
            url : rootPath+"/industryClassification/delIndustryClassification",
            type : "post",
            data : {
                "industryClassificationId" : industryClassificationId,
            },
            cache : false,
            async : false,
            success : function(data) {
                if (data=="succ") {
                    parent.layer.closeAll();
                    parent.layer.msg("操作成功!");
                    setTimeout("refreshPage('/industryClassification/list');",1000);
                } else if(data=="industryClassificationHaveASon"){
                    parent.layer.msg("该父级行业下有子级,请先删除子级!");
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
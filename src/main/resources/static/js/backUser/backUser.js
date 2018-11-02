function entryBackUser() {
    parent.layer.open({
        type: 2,
        title: '添加用户',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['500px', '60%'], //宽高
        content: rootPath+'/backUser/entry',
        btn: ['确认', '取消'],
        yes: function(index,layero){
            //var addUaerName = $("#addUaerName").val();
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            console.log(body.html()) //得到iframe页的body内容

            var addUaerName = body.find("#addUaerName").val();
            var realName = body.find("#realName").val();
            var password = body.find("#password").val();
            //var enable = $("#enable").is(':checked');
            var enable = body.find("#enable").is(':checked') ? 0:1;
            var userType = body.find("#addUserType").val();
            var mobile = body.find("#mobile").val();
            var email = body.find("#email").val();

            /*var provinceId = body.find("#provinceId").val();
            var provinceName = body.find("#provinceId option:selected").text();
            var cityId = body.find("#cityId").val();
            var cityName = body.find("#cityId option:selected").text();
            var districtId = body.find("#districtId").val();
            var districtName = body.find("#districtId option:selected").text();*/
            //var userType = $("#addUserType").val();
            var roleId = body.find("input[name='roleId']:checked").val();

            if(addUaerName == "") {
                parent.layer.msg("用户名不能为空!");
                return;
            }
            if(password == "") {
                parent.layer.msg("密码不能为空!");
                return;
            }
            if(realName == "") {
                parent.layer.msg("真实姓名不能为空!");
                return;
            }
            if(userType == "") {
                parent.layer.msg("请选择用户类型!");
                return;
            }
            if(mobile == "") {
                parent.layer.msg("手机号码不能为空!");
                return;
            }
            if(!(/^1(3|4|5|7|8|9)\d{9}$/.test(mobile))){
                parent.layer.msg("请输入正确的手机号码!");
                return false;
            }
            if(roleId == "" || roleId == undefined) {
                parent.layer.msg("请选择角色!");
                return;
            }
            $.ajax({
                url : rootPath+"/backUser/saveBackUser",
                type : "post",
                data : {
                    "userName" : addUaerName,
                    "realName" : realName,
                    "password" : password,
                    "enable" : enable,
                    "userType" : userType,
                    "mobile" : mobile,
                    "email" : email,
                    "roleId" : roleId
                    /*"provinceId" : provinceId,
                    "provinceName" : provinceName,
                    "cityId" : cityId,
                    "cityName" : cityName,
                    "districtId" : districtId,
                    "districtName" : districtName*/
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/backUser/list');",1000);
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

function selectBackRoleByUserType() {

    var userType = $("#addUserType").val();
    //alert(userType);
    var html = "";
    if(userType=="") {
        $("#roleTd").html("");
    } else {
        $.ajax({
            url : rootPath+"/backRole/selectBackRoleByUserType",
            type : "post",
            data : {
                "userType" : userType
            },
            cache : false,
            async : false,
            success : function(data) {
                for(var i =0;i<data.length;i++){
                    html+="<input type='radio' name='roleId' id='roleId"+i+"' value='"+data[i].backRoleId+"' title='"+data[i].name+"'/>";
                    if((i+1)%4==0) {
                        html+="<br/>";
                    }
                    //$("#parentId").append("<option value='"+data[i].backMenuId+"'>"+data[i].name+"</option>");
                }
            }
        });
    }
    $("#roleTd").html(html);
}



function editBackUser(backUserId) {
    parent.layer.open({
        type: 2,
        title: '编辑用户',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        area: ['500px', '70%'], //宽高
        //content: '//'+rootPath+'/backRole/roleMenu.action?backRoleId='+backRoleId+'/'
        content: rootPath+'/backUser/edit?backUserId='+backUserId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容

            //var addUaerName = body.find("#addUaerName").val();
            var backUserId = body.find("#backUserId").val();
            var addUaerName =body.find("#addUaerName").val();
            var realName = body.find("#realName").val();
            var password = body.find("#password").val();
            //var enable = $("#enable").is(':checked');
            var enable = body.find("#enable").is(':checked') ? 0:1;
            var userType = body.find("#addUserType").val();
            var mobile = body.find("#mobile").val();
            var email = body.find("#email").val();
            var backRoleId = body.find("#backRoleId").val();
            var backUserRoleId = body.find("#backUserRoleId").val();
           /* var provinceId = body.find("#provinceId").val();
            var provinceName = body.find("#provinceId option:selected").text();
            var cityId = body.find("#cityId").val();
            var cityName = body.find("#cityId option:selected").text();
            var districtId = body.find("#districtId").val();
            var districtName = body.find("#districtId option:selected").text();*/
            //var userType = $("#addUserType").val();
            //var roleId = $("input[name='roleId']:checked").val();
            var roleId = body.find("input[name='roleId']:checked").val();
            if(addUaerName == "") {
                parent.layer.msg("用户名不能为空!");
                return;
            }
            if(realName == "") {
                parent.layer.msg("真实姓名不能为空!");
                return;
            }
            if(userType == "") {
                parent.layer.msg("请选择用户类型!");
                return;
            }
            if(mobile == "") {
                parent.layer.msg("手机号码不能为空!");
                return;
            }
            if(!(/^1(3|4|5|7|8|9)\d{9}$/.test(mobile))){
                parent.layer.msg("请输入正确的手机号码!");
                return false;
            }
            if(roleId == "" || roleId == undefined) {
                parent.layer.msg("请选择角色!");
                return;
            }
            $.ajax({
                url : rootPath+"/backUser/updateBackUser",
                type : "post",
                data : {
                    "userName" : addUaerName,
                    "realName" : realName,
                    "password" : password,
                    "enable" : enable,
                    "userType" : userType,
                    "mobile" : mobile,
                    "email" : email,
                    "roleId" : roleId,
                    "backUserId" : backUserId,
                    "backRoleId" : backRoleId,
                    "backUserRoleId" : backUserRoleId
                    /*"provinceId" : provinceId,
                    "provinceName" : provinceName,
                    "cityId" : cityId,
                    "cityName" : cityName,
                    "districtId" : districtId,
                    "districtName" : districtName*/
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("parent.layer.closeAll();",1000);
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

function delBackUser(backUserId) {
    parent.layer.confirm('<div class="modal_info icon_warn">确定要删除此条数据？一经删除将无法修复！</div>', {
        btn: ['确认','取消'] //按钮
    }, function(){
        //layer.msg('的确很重要', {icon: 1});
        $.ajax({
            url : rootPath+"/backUser/delBackUser",
            type : "post",
            data : {
                "backUserId" : backUserId,
            },
            cache : false,
            async : false,
            success : function(data) {
                if (data=="succ") {
                    parent.layer.closeAll();
                    parent.layer.msg("操作成功!");
                    setTimeout("refreshPage('/backUser/list');",1000);
                }else{
                    parent.layer.msg("操作失败!");
                }
            }
        });
    }, function(){
        //
        parent.layer.closeAll();
    });
}
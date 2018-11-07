function entryAgent() {
    parent.layer.open({
        type: 2,
        title: '添加代理商',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['55%', '80%'], //宽高
        content: rootPath+'/agent/entry',
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容

            var agentName = body.find("#agentName").val();
            var level = body.find("#level").val();
            var parentId1 = body.find("#parentId1").val();
            var parentId2 = body.find("#parentId2").val();
            var parentId3 = body.find("#parentId3").val();
            var legalPersonName = body.find("#legalPersonName").val();
            var legalPersonPhone = body.find("#legalPersonPhone").val();
            var legalPersonCertificateType = body.find("#legalPersonCertificateType").val();
            var legalPersonIdcard = body.find("#legalPersonIdcard").val();
            var contactName = body.find("#contactName").val();
            var contactPhone = body.find("#contactPhone").val();
            var email = body.find("#email").val();
            var operateEndStr = body.find("#operateEnd").val();
            var bizLicenseNo = body.find("#bizLicenseNo").val();
            var industryTypeId = body.find("#industryTypeId").val();
            var industryTypeName = body.find("#industryTypeId").find("option:selected").text();
            var industryTypeTwoId = body.find("#industryTypeTwoId").val();
            var industryTypeTwoName = body.find("#industryTypeTwoId").find("option:selected").text();
            var provinceId = body.find("#provinceId").val();
            var provinceName = body.find("#provinceId").find("option:selected").text();
            var cityId = body.find("#cityId").val();
            var cityName = body.find("#cityId").find("option:selected").text();
            var districtId = body.find("#districtId").val();
            var districtName = body.find("#districtId").find("option:selected").text();
            var address = body.find("#address").val();
            if(agentName == "") {
                parent.layer.msg("请输入公司名称!");
                return;
            }
            var parentId = 0;
            if(level == 2) {
                if(parentId1 == "") {
                    parent.layer.msg("请选择一级代理!");
                    return;
                }
                parentId = parentId1;
            }
            if(level == 3) {
                if(parentId1 == "") {
                    parent.layer.msg("请选择一级代理!");
                    return;
                }
                if(parentId2 == "") {
                    parent.layer.msg("请选择二级代理!");
                    return;
                }
                parentId = parentId2;
            }
            if(legalPersonName == "") {
                parent.layer.msg("请输入法人姓名!");
                return;
            }
            if(legalPersonPhone == "") {
                parent.layer.msg("请输入法人电话!");
                return;
            }
            if(industryTypeId == "") {
                parent.layer.msg("请选择行业大类!");
                return;
            }
            if(industryTypeTwoId == "") {
                parent.layer.msg("请选择行业小类!");
                return;
            }
            if(provinceId == "" || cityId == "" || districtId == "") {
                parent.layer.msg("省市县请选择完善!");
                return;
            }
            $.ajax({
                url : rootPath+"/agent/saveAgent",
                type : "post",
                data : {
                    "agentName" : agentName,
                    "level" : level,
                    "parentId" : parentId,
                    "legalPersonName" : legalPersonName,
                    "legalPersonPhone" : legalPersonPhone,
                    "legalPersonCertificateType" : legalPersonCertificateType,
                    "legalPersonIdcard" : legalPersonIdcard,
                    "contactName" : contactName,
                    "contactPhone" : contactPhone,
                    "email" : email,
                    "operateEndStr" : operateEndStr,
                    "bizLicenseNo" : bizLicenseNo,
                    "industryTypeId" : industryTypeId,
                    "industryTypeName" : industryTypeName,
                    "industryTypeTwoId" : industryTypeTwoId,
                    "industryTypeTwoName" : industryTypeTwoName,
                    "provinceId" : provinceId,
                    "provinceName" : provinceName,
                    "cityId" : cityId,
                    "cityName" : cityName,
                    "districtId" : districtId,
                    "districtName" : districtName,
                    "address" : address
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/agent/list');",1000);
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

function getAgentByParentId(selectId,agentId) {
    if(agentId == "") {
        $("#"+selectId).html("<option value=''>请选择</option>");
        return;
    }
    //var parentId=$("#parentId").find("option:selected").val();
    $.ajax({
        url : "/agent/getAgentByParentId",
        type : "post",
        data : {
            "agentId" : agentId
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#"+selectId).html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(agentId != "" && agentId != null && agentId==data[k].agentId) {
                        $("#"+selectId).append("<option value='"+data[k].agentId+"' selected='selected'>"+data[k].agentName+"</option>");
                    } else {
                        $("#"+selectId).append("<option value='"+data[k].agentId+"'>"+data[k].agentName+"</option>");
                    }

                }
            } else {
                $("#"+selectId).html("<option value=''>请选择</option>");
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}


function getEditAgentByParentId(agentId,parentId) {
    $.ajax({
        url : "/agent/getAgentByParentId",
        type : "post",
        data : {
            "agentId" : parentId
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#parentId2").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(agentId != "" && agentId != null && agentId==data[k].agentId) {
                        $("#parentId2").append("<option value='"+data[k].agentId+"' selected='selected'>"+data[k].agentName+"</option>");
                    } else {
                        $("#parentId2").append("<option value='"+data[k].agentId+"'>"+data[k].agentName+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}


function getAllAgentByParentId0(agentId) {
    $.ajax({
        url : "/agent/getAllAgentByParentId0",
        type : "post",
        data : {

        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#parentId1").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(agentId != "" && agentId != null && agentId==data[k].agentId) {
                        $("#parentId1").append("<option value='"+data[k].agentId+"' selected='selected'>"+data[k].agentName+"</option>");
                    } else {
                        $("#parentId1").append("<option value='"+data[k].agentId+"'>"+data[k].agentName+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}


function delAgent(agentId) {
    parent.layer.confirm('删除后所归属账户将被冻结,请确认您的操作？', {
        btn: ['确认','取消'] //按钮
    }, function(){
        //layer.msg('的确很重要', {icon: 1});
        $.ajax({
            url : rootPath+"/agent/delAgent",
            type : "post",
            data : {
                "agentId" : agentId,
            },
            cache : false,
            async : false,
            success : function(data) {
                if (data=="succ") {
                    parent.layer.closeAll();
                    parent.layer.msg("操作成功!");
                    setTimeout("refreshPage('/agent/list');",1000);
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


function editAgent(agentId) {
    parent.layer.open({
        type: 2,
        title: '编辑代理商',
        //shadeClose: true,
        shade: 0.2,
        skin: 'layui-layer-rim', //加上边框
        //maxmin: true, //开启最大化最小化按钮
        area: ['55%', '80%'], //宽高
        content: rootPath+'/agent/edit?agentId='+agentId,
        btn: ['确认', '取消'],
        yes: function(index,layero){
            var body = parent.layer.getChildFrame('body', index);
            //var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：
            //console.log(body.html()) //得到iframe页的body内容
            var agentId = body.find("#agentId").val();
            var agentName = body.find("#agentName").val();
            var level = body.find("#level").val();
            var parentId1 = body.find("#parentId1").val();
            var parentId2 = body.find("#parentId2").val();
            var parentId3 = body.find("#parentId3").val();
            var legalPersonName = body.find("#legalPersonName").val();
            var legalPersonPhone = body.find("#legalPersonPhone").val();
            var legalPersonCertificateType = body.find("#legalPersonCertificateType").val();
            var legalPersonIdcard = body.find("#legalPersonIdcard").val();
            var contactName = body.find("#contactName").val();
            var contactPhone = body.find("#contactPhone").val();
            var email = body.find("#email").val();
            var operateEndStr = body.find("#operateEnd").val();
            var bizLicenseNo = body.find("#bizLicenseNo").val();
            var industryTypeId = body.find("#industryTypeId").val();
            var industryTypeName = body.find("#industryTypeId").find("option:selected").text();
            var industryTypeTwoId = body.find("#industryTypeTwoId").val();
            var industryTypeTwoName = body.find("#industryTypeTwoId").find("option:selected").text();
            var provinceId = body.find("#provinceId").val();
            var provinceName = body.find("#provinceId").find("option:selected").text();
            var cityId = body.find("#cityId").val();
            var cityName = body.find("#cityId").find("option:selected").text();
            var districtId = body.find("#districtId").val();
            var districtName = body.find("#districtId").find("option:selected").text();
            var address = body.find("#address").val();
            if(agentName == "") {
                parent.layer.msg("请输入公司名称!");
                return;
            }
            var parentId = 0;
            if(level == 2) {
                if(parentId1 == "") {
                    parent.layer.msg("请选择一级代理!");
                    return;
                }
                parentId = parentId1;
            }
            if(level == 3) {
                if(parentId1 == "") {
                    parent.layer.msg("请选择一级代理!");
                    return;
                }
                if(parentId2 == "") {
                    parent.layer.msg("请选择二级代理!");
                    return;
                }
                parentId = parentId2;
            }
            if(legalPersonName == "") {
                parent.layer.msg("请输入法人姓名!");
                return;
            }
            if(legalPersonPhone == "") {
                parent.layer.msg("请输入法人电话!");
                return;
            }
            if(industryTypeId == "") {
                parent.layer.msg("请选择行业大类!");
                return;
            }
            if(industryTypeTwoId == "") {
                parent.layer.msg("请选择行业小类!");
                return;
            }
            if(provinceId == "" || cityId == "" || districtId == "") {
                parent.layer.msg("省市县请选择完善!");
                return;
            }
            $.ajax({
                url : rootPath+"/agent/updateAgent",
                type : "post",
                data : {
                    "agentId" : agentId,
                    "agentName" : agentName,
                    "level" : level,
                    "parentId" : parentId,
                    "legalPersonName" : legalPersonName,
                    "legalPersonPhone" : legalPersonPhone,
                    "legalPersonCertificateType" : legalPersonCertificateType,
                    "legalPersonIdcard" : legalPersonIdcard,
                    "contactName" : contactName,
                    "contactPhone" : contactPhone,
                    "email" : email,
                    "operateEndStr" : operateEndStr,
                    "bizLicenseNo" : bizLicenseNo,
                    "industryTypeId" : industryTypeId,
                    "industryTypeName" : industryTypeName,
                    "industryTypeTwoId" : industryTypeTwoId,
                    "industryTypeTwoName" : industryTypeTwoName,
                    "provinceId" : provinceId,
                    "provinceName" : provinceName,
                    "cityId" : cityId,
                    "cityName" : cityName,
                    "districtId" : districtId,
                    "districtName" : districtName,
                    "address" : address
                },
                cache : false,
                async : false,
                success : function(data) {
                    if (data=="succ") {
                        parent.layer.closeAll();
                        parent.layer.msg("操作成功!");
                        setTimeout("refreshPage('/agent/list');",1000);
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
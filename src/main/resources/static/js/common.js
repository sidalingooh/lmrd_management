/**
 * 初始化市级
 * @returns
 */
function getAllProvince(provinceId) {
    //var provinceId=$("#provinceId").find("option:selected").val();
    $.ajax({
        url : "/region/selectProvince",
        type : "post",
        data : {
            //"type" : addtype
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#provinceId").html("<option value=''>请选择</option>");
                $("#cityId").html("<option value=''>请选择</option>");
                $("#districtId").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(provinceId != "" && provinceId != null && provinceId==data[k].regionId) {
                        $("#provinceId").append("<option value='"+data[k].regionId+"' selected='selected'>"+data[k].name+"</option>");
                    } else {
                        $("#provinceId").append("<option value='"+data[k].regionId+"'>"+data[k].name+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}


function getDistrictByCity(districtId) {
    var cityId=$("#cityId").find("option:selected").val();
    $.ajax({
        url : "/region/getByRegionCode",
        type : "post",
        data : {
            "regionId" : cityId
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#districtId").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(districtId != "" && districtId != null && districtId==data[k].regionId) {
                        $("#districtId").append("<option value='"+data[k].regionId+"' selected='selected'>"+data[k].name+"</option>");
                    } else {
                        $("#districtId").append("<option value='"+data[k].regionId+"'>"+data[k].name+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}

function getCityByProvince(cityId) {
    var provinceId=$("#provinceId").find("option:selected").val();
    $.ajax({
        url : "/region/getByRegionCode",
        type : "post",
        data : {
            "regionId" : provinceId
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#cityId").html("<option value=''>请选择</option>");
                $("#districtId").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(cityId != "" && cityId != null && cityId==data[k].regionId) {
                        $("#cityId").append("<option value='"+data[k].regionId+"' selected='selected'>"+data[k].name+"</option>");
                    } else {
                        $("#cityId").append("<option value='"+data[k].regionId+"'>"+data[k].name+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}


/**
 * 初始化行业主类
 * @returns
 */
function getAllIndustryClassificationLeve1(industryClassificationId) {
    //var provinceId=$("#provinceId").find("option:selected").val();
    $.ajax({
        url : "/industryClassification/getAllIndustryClassificationListLevel1",
        type : "post",
        data : {
            //"type" : addtype
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#industryTypeId").html("<option value=''>请选择</option>");
                $("#industryTypeTwoId").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(industryClassificationId != "" && industryClassificationId != null && industryClassificationId==data[k].industryClassificationId) {
                        $("#industryTypeId").append("<option value='"+data[k].industryClassificationId+"' selected='selected'>"+data[k].industryClassificationName+"</option>");
                    } else {
                        $("#industryTypeId").append("<option value='"+data[k].industryClassificationId+"'>"+data[k].industryClassificationName+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}

function getIndustryClassificationListByParentId(industryClassificationId) {
    var parentId=$("#industryTypeId").find("option:selected").val();

    $.ajax({
        url : "/industryClassification/getIndustryClassificationListByParentId",
        type : "post",
        data : {
            "parentId" : parentId
        },
        cache : false,
        async : false,
        success : function(data) {
            if(data!=null) {
                $("#industryTypeTwoId").html("<option value=''>请选择</option>");
                for (k in data) {
                    //var ss = data[k];
                    if(industryClassificationId != "" && industryClassificationId != null && industryClassificationId==data[k].industryClassificationId) {
                        $("#industryTypeTwoId").append("<option value='"+data[k].industryClassificationId+"' selected='selected'>"+data[k].industryClassificationName+"</option>");
                    } else {
                        $("#industryTypeTwoId").append("<option value='"+data[k].industryClassificationId+"'>"+data[k].industryClassificationName+"</option>");
                    }

                }
            }
        }
    });
    layui.use(['form'], function(){
        layui.form.render();
    });
}
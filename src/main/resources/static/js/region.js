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
                $("#provinceId").html("<option value=''>-请选择-</option>");
                $("#cityId").html("<option value=''>-请选择-</option>");
                $("#districtId").html("<option value=''>-请选择-</option>");
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
                $("#districtId").html("<option value=''>-请选择-</option>");
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
                $("#cityId").html("<option value=''>-请选择-</option>");
                $("#districtId").html("<option value=''>-请选择-</option>");
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
}
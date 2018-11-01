<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ include file="../../jsp/common/common.jsp"%>
<html lang="en">

<body>
<div>
    <select id="provinceId" name="provinceId" onclick="getCityByProvince();">
        <option value=''>-请选择-</option>
    </select>
    <select id="cityId" name="cityId" onclick="getDistrictByCity();">
        <option value=''>-请选择-</option>
    </select>
    <select id="districtId" name="districtId">
        <option value=''>-请选择-</option>
    </select>
</div>

<div>

    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>name</th>
        </tr>
        </thead>
        <tfoot>
        <tr>
            <td colspan="9" >
                <div class="paging" style="display:block;">
                    <div class="pagination fr">
                        <div id="kkpager"></div>
                    </div>
                    <input type="hidden" name="pageSize" id="pageSize"
                           value="${pt.pageSize}" /> <input type="hidden" name="pageNo"
                                                            id="pageNo" value="${pt.pageNo}" /> <input type="hidden"
                                                                                                       name="total" id="total" value="${pt.total}" />
                </div>
            </td>
        </tr>
        </tfoot>
        <tbody>
        <c:forEach items="${pt.data}" var="region" varStatus="status">
            <tr>
                <td>
                        ${region.regionId}
                </td>
                <td>
                        ${region.name}
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</div>


<script>

    $(function() {
        //生成分页
        $("#kkpager").html("");
        //有些参数是可选的，比如lang，若不传有默认值
        kkpager.generPageHtml({
            pno : $("#pageNo").val(),
            //总页码
            total : Math.ceil($("#total").val()
                / parseInt($("#pageSize").val())),
            //总数据条数
            totalRecords : $("#total").val(),
            //链接前部
            hrefFormer : 'javascript:',
            //链接尾部
            hrefLatter : 'go_page',
            getLink : function(n) {
                return this.hrefFormer + this.hrefLatter + "(" + n + ")";
            }
        }, true);
    });

    function go_page(pageNo) {
        var parms = "&pageNo=" + pageNo;
        window.location.href = "/region/index?pageSize=10"+ parms;
    }

    getAllProvince();
    /**
     * 初始化市级
     * @returns
     */
    function getAllProvince() {
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
</script>

</body>
</html>
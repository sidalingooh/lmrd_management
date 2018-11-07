<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head>
<%@include file="../../jsp/common/common.jsp" %>
<title>编辑代理商</title>
</head><body class="body">
<form id="form1" class="layui-form" method="post">
    <input type="hidden" name="agentId" id="agentId" value="${agent.agentId}">
    <div class="layui-form-item">
        <label class="layui-form-label">公司名称</label>
        <div class="layui-input-block">
            <input type="text" name="agentName" id="agentName" lay-verify="title" autocomplete="off" placeholder="请输入公司名称" class="layui-input" value="${agent.agentName}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">代理级别</label>
        <div class="layui-input-inline">
            <select name="level" id="level" lay-filter="selectAgentLevel">
                <option value="">请选择代理级别</option>
                <option value="1" <c:if test="${agent.level eq 1}">selected</c:if>>一级代理</option>
                <option value="2" <c:if test="${agent.level eq 2}">selected</c:if>>二级代理</option>
                <option value="3" <c:if test="${agent.level eq 3}">selected</c:if>>三级代理</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item" id="parentDiv1" style="display: none;">
        <label class="layui-form-label">一级代理</label>
        <div class="layui-input-inline">
            <select name="parentId1" id="parentId1" lay-filter="getAgentByParentId">
                <option value="0">无</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item" id="parentDiv2" style="display: none;">
        <label class="layui-form-label">二级代理</label>
        <div class="layui-input-inline">
            <select name="parentId2" id="parentId2" lay-filter="getAgentByParentIdLevel2">
                <option value="0">无</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">法人姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="legalPersonName" id="legalPersonName" lay-verify="title" autocomplete="off" placeholder="请输入法人姓名" class="layui-input" value="${agent.legalPersonName}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">法人电话</label>
        <div class="layui-input-inline">
            <input type="text" name="legalPersonPhone" id="legalPersonPhone" lay-verify="title" autocomplete="off" placeholder="请输入法人电话" class="layui-input" value="${agent.legalPersonPhone}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">法人证件类型</label>
        <div class="layui-input-inline">
            <select name="legalPersonCertificateType" id="legalPersonCertificateType" >
                <option value="">请选择证件类型</option>
                <option value="1" <c:if test="${agent.legalPersonCertificateType eq 1}">selected</c:if>>身份证</option>
                <option value="2" <c:if test="${agent.legalPersonCertificateType eq 2}">selected</c:if>>护照</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">法人证件号码</label>
        <div class="layui-input-inline">
            <input type="text" name="legalPersonIdcard" id="legalPersonIdcard" lay-verify="title" autocomplete="off" placeholder="请输入法人证件号码" class="layui-input" value="${agent.legalPersonIdcard}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">联系人姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="contactName" id="contactName" lay-verify="title" autocomplete="off" placeholder="请输入联系人姓名" class="layui-input" value="${agent.contactName}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">联系人电话</label>
        <div class="layui-input-inline">
            <input type="text" name="contactPhone" id="contactPhone" lay-verify="title" autocomplete="off" placeholder="请输入联系人电话" class="layui-input" value="${agent.contactPhone}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">联系人邮箱</label>
        <div class="layui-input-inline">
            <input type="text" name="email" id="email" lay-verify="title" autocomplete="off" placeholder="请输入联系人邮箱" class="layui-input" value="${agent.email}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">营业期限</label>
        <div class="layui-input-inline">
            <input type="text" name="operateEnd" id="operateEnd" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" >
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">统一社会信用代码/注册号/组织机构代码</label>
        <div class="layui-input-block">
            <input type="text" name="bizLicenseNo" id="bizLicenseNo" lay-verify="title" autocomplete="off" placeholder="请输入统一社会信用代码/注册号/组织机构代码" class="layui-input" value="${agent.bizLicenseNo}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">行业大类</label>
        <div class="layui-input-inline">
            <select name="industryTypeId" id="industryTypeId" lay-filter="getIndustryClassificationListByParentId">
                <option value="">请选择行业大类</option>
            </select>
        </div>
        <label class="layui-form-label">行业小类</label>
        <div class="layui-input-inline">
            <select name="industryTypeTwoId" id="industryTypeTwoId" >
                <option value="0">无</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">省市县</label>
        <div class="layui-input-inline" >
            <select id="provinceId" name="provinceId" onclick="getCityByProvince();" lay-filter="getCityByProvince">
                <option value=''>请选择</option>
            </select>
        </div>
        <div class="layui-input-inline" >
            <select id="cityId" name="cityId" onclick="getDistrictByCity();" lay-filter="getDistrictByCity">
                <option value=''>请选择</option>
            </select>
        </div>
        <div class="layui-input-inline" >
            <select id="districtId" name="districtId">
                <option value=''>请选择</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">详细地址</label>
        <div class="layui-input-block">
            <input type="text" name="address" id="address" lay-verify="title" autocomplete="off" placeholder="请输入详细地址" class="layui-input">
        </div>
    </div>
</form>
</body>
<script src="${ctx}/js/agent/agent.js"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#operateEnd'
        });
        form.on('select(getCityByProvince)', function(data){
            getCityByProvince();
            form.render();
        });
        form.on('select(getDistrictByCity)', function(data){
            getDistrictByCity(data.value);
            form.render();
        });
        form.on('select(getIndustryClassificationListByParentId)', function(data){
            getIndustryClassificationListByParentId();
            form.render();
        });
        form.on('select(getAgentByParentId)', function(data){
            getAgentByParentId("parentId2",data.value);
            form.render();
        });
        form.on('select(getAgentByParentIdLevel2)', function(data){
            /*alert(data.value)
            getAgentByParentId("parentId2",data.value);*/
            form.render();
        })

        form.on('select(selectAgentLevel)', function(data){
            if(data.value == 1) {
                $("#parentDiv1").hide();
                $("#parentDiv2").hide();
                $("#parentId1").html("<option value=''>无</option>");
                $("#parentId2").html("<option value=''>无</option>");
            }
            if(data.value == 2) {
                $("#parentDiv1").show();
                $("#parentDiv2").hide();
                $("#parentId1").html("<option value=''>请选择</option>");
                $("#parentId2").html("<option value=''>无</option>");
                getAllAgentByParentId0();
            }
            if(data.value == 3) {
                $("#parentId1").html("<option value=''>请选择</option>");
                $("#parentId2").html("<option value=''>请选择</option>");
                $("#parentDiv1").show();
                $("#parentDiv2").show();
                getAllAgentByParentId0();
            }

            form.render();
        });


    });
    function showParent() {
        var level=$("#level").find("option:selected").val();
        if(level == 1) {
            $("#parentDiv1").hide();
            $("#parentDiv2").hide();
            $("#parentId1").html("<option value=''>无</option>");
            $("#parentId2").html("<option value=''>无</option>");
        }
        if(level == 2) {
            $("#parentDiv1").show();
            $("#parentDiv2").hide();
            $("#parentId1").html("<option value=''>请选择</option>");
            $("#parentId2").html("<option value=''>无</option>");
            getAllAgentByParentId0(${agent.parentId});
        }
        if(level == 3) {
            $("#parentId1").html("<option value=''>请选择</option>");
            $("#parentId2").html("<option value=''>请选择</option>");
            $("#parentDiv1").show();
            $("#parentDiv2").show();
            getAllAgentByParentId0(${parentId1});
            //getAgentByParentId("parentId2",${parentId2});
            getEditAgentByParentId(${parentId2},${parentId1})
            //getEditAgentByParentId(${agent.agentId},${agent.parentId})


        }
    }
    showParent();
    getAllIndustryClassificationLeve1(${agent.industryTypeId});
    getIndustryClassificationListByParentId(${agent.industryTypeTwoId});
    getAllProvince(${agent.provinceId});
    getCityByProvince(${agent.cityId});
    getDistrictByCity(${agent.districtId});
</script>
</html>
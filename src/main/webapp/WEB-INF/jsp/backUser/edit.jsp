<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../jsp/common/common.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>编辑用户</title>

<body>
<form id="form1" class="modal_x" method="post">
        <input class="layui-input" id="backUserId" name="backUserId" value="${backUser.backUserId}" type="hidden" />
        <input class="layui-input" id="backRoleId" name="backRoleId" value="${backUserRole.backRoleId}" type="hidden" />
        <input class="layui-input" id="backUserRoleId" name="backUserRoleId" value="${backUserRole.backUserRoleId}" type="hidden" />
      <table class="modal_table">
      <tbody>
      <tr >
      <td >用户名</td>
      <td ><input class="layui-input" id="addUaerName" name="addUaerName" value="${backUser.userName}" type="text" disabled="disabled"/></td>
      </tr>
      <tr >
      <td >姓名</td>
      <td ><input class="layui-input" id="realName" name="realName" value="${backUser.realName}" type="text" /></td>
      </tr>
      <%-- <tr >
      <td >密码</td>
      <td ><input class="layui-input" id="password" name="password" value="${backUser.password}" type="password" /></td>
      </tr> --%>
      <tr >
      <td >启用</td>
      <td ><input name="enable" id="enable" title="启用" style="display: block;" <c:if test="${backUser.enable ne 1}">checked="checked"</c:if>  type="checkbox"></td>
      </tr>
      <tr >
      <td >用户类型</td>
      <td >
      <select name="addUserType" id="addUserType"  class="layui-input layui-unselect"  onchange="selectBackRoleByUserTypeEdit();">
      <c:if test="${loginUser.userType eq '0' and loginUser.backUserId eq backUser.backUserId}">
      	<option value="0" <c:if test="${backUser.userType eq '0'}">selected="selected"</c:if>>超级管理员</option>
      </c:if>
      <c:if test="${loginUser.backUserId ne backUser.backUserId}">
      	<option value="1" <c:if test="${backUser.userType eq '1'}">selected="selected"</c:if>>管理员</option>
      	<option value="2" <c:if test="${backUser.userType eq '2'}">selected="selected"</c:if>>普通用户</option>
      </c:if>


      </select>
      </td>
      </tr>
      <tr >
            <td >所属组织机构</td>
            <td >
                  <select id="provinceId" name="provinceId" onclick="getCityByProvince();" class="layui-input layui-unselect" >
                        <option value=''>-请选择-</option>
                  </select>
                  <select id="cityId" name="cityId" onclick="getDistrictByCity();" class="layui-input layui-unselect" >
                        <option value=''>-请选择-</option>
                  </select>
                  <select id="districtId" name="districtId" class="layui-input layui-unselect" >
                        <option value=''>-请选择-</option>
                  </select>
            </td>
      </tr>
      <tr >
      <td >手机号码</td>
      <td ><input class="layui-input" id="mobile" name="mobile" value="${backUser.mobile}" type="text" /></td>
      </tr>
      <tr >
      <td >Email</td>
      <td ><input class="layui-input" id="email" name="email" value="${backUser.email}" type="text" /></td>
      </tr>
      <tr >
      <td >对应岗位</td>
      <td  id="roleTd">
      
      </td>
      </tr>
      </tbody>
      </table>
      </form>
        <!-- End #tab2 -->
      
</body>
<script src="${ctx}/js/backUser/backUser.js"></script>
<script type="text/javascript">
selectBackRoleByUserTypeEdit();

function selectBackRoleByUserTypeEdit() {
	var userType = $("#addUserType").val();
	var backRoleId = $("#backRoleId").val();
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
					if("" != backRoleId &&  backRoleId == data[i].backRoleId) {
						html+="<span class='roleSpan' style='margin-left:10px;'><label><input type='radio' checked='checked' name='roleId' id='roleId"+i+"' value='"+data[i].backRoleId+"' />"+data[i].name+"</label></span>";
					} else {
						html+="<span class='roleSpan' style='margin-left:10px;'><label><input type='radio' name='roleId' id='roleId"+i+"' value='"+data[i].backRoleId+"' />"+data[i].name+"</label></span>";
					}

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
getAllProvince(${backUser.provinceId});
getCityByProvince(${backUser.cityId})
getDistrictByCity(${backUser.districtId});


</script>
</html>

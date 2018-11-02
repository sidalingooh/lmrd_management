<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@include file="../../jsp/common/common.jsp" %>
<title>赋权</title>
<style>

      .modal_x {
            padding: 8px;
      }
      .modal_table {
            width: 100%;
            font-size: 14px;
      }
      .modal_table, .modal_table th, .modal_table td {
            border-spacing: 0;
            border-collapse: collapse;
            border: 1px solid #ddd;
      }
      .modal_table th, .modal_table td {
            padding: 6px;
      }
      .modal_table th {
            width: 25%;
            font-weight: normal;
            white-space: nowrap;
      }


      /* 复选框 */
      /* 外部空袭 */
      .modal_wrap {
            padding-left: 12px;
      }

      /* 特殊单选 */
      /* 选中 */
      .modal_rd {
            padding-left: 20%;
            text-align: left;
      }





</style>

</head><body>
<form class="modal_x">
      <input type="hidden" name="backRoleId" id="backRoleId" value="${backRoleId}"/>
      <table class="modal_table">
            <tbody>
            <c:forEach items="${parentBackMenuList}" var="parentBackMenu" varStatus="status">
                  <tr>
                        <th>
                              <label>
                                    <c:set var="flag" value="${false}"/>
                                    <c:forEach items="${backRoleMenuList}" var="roleMenu" >
                                          <c:if test="${roleMenu.backMenuId eq parentBackMenu.backMenuId}">
                                                <c:set var="flag" value="${true}"/>
                                          </c:if>
                                    </c:forEach>
                                    <c:choose>
                                          <c:when test="${flag == true}">
                                                <input type="hidden" name="parentBackMenuId" id="parentBackMenuId${parentBackMenu.backMenuId}" value="${parentBackMenu.backMenuId}"/>

                                                <input type="checkbox" title="${parentBackMenu.name}" checked="checked" name="parentBackMenuIdCheckbox" id="parentBackMenuIdCheckbox${parentBackMenu.backMenuId}" value="${parentBackMenu.backMenuId}" onclick="checkboxParentBackMenu(this);"/>
                                                <%--<input type="checkbox" checked="checked" name="parentBackMenuIdCheckbox" id="parentBackMenuIdCheckbox${parentBackMenu.backMenuId}" value="${parentBackMenu.backMenuId}" onclick="checkboxParentBackMenu(this);"/>--%>
                                          </c:when>
                                          <c:otherwise>
                                                <input type="hidden" name="parentBackMenuId" id="parentBackMenuId${parentBackMenu.backMenuId}" value=""/>
                                                <input type="checkbox" title="${parentBackMenu.name}"  name="parentBackMenuIdCheckbox" id="parentBackMenuIdCheckbox${parentBackMenu.backMenuId}" value="${parentBackMenu.backMenuId}" onclick="checkboxParentBackMenu(this);"/>
                                          </c:otherwise>
                                    </c:choose>
                                          ${parentBackMenu.name}

                              </label>
                        </th>
                        <td>
                              <c:forEach items="${backMenuList}" var="backMenu" varStatus="status">
                                    <label>
                                          <c:if test="${backMenu.parentId eq parentBackMenu.backMenuId }">
                                                <c:set var="flag" value="${false}"/>
                                                <c:forEach items="${backRoleMenuList}" var="roleMenu" >
                                                      <c:if test="${roleMenu.backMenuId eq backMenu.backMenuId}">
                                                            <c:set var="flag" value="${true}"/>
                                                      </c:if>
                                                </c:forEach>
                                                <c:choose>
                                                      <c:when test="${flag == true}">
                                                            <input style="margin-left: 15px;" title="${backMenu.name}" checked type="checkbox" name="checkMenu${parentBackMenu.backMenuId}" id="check${backMenu.backMenuId}" onclick="menuSeleted(this,'${backMenu.backMenuId}','${parentBackMenu.backMenuId}');"/>${backMenu.name}
                                                            <input type="hidden" name="menuId" id="menuId${backMenu.backMenuId}" value="${backMenu.backMenuId}"/>
                                                      </c:when>
                                                      <c:otherwise>
                                                            <input style="margin-left: 15px;" title="${backMenu.name}" type="checkbox" name="checkMenu${parentBackMenu.backMenuId}" id="check${backMenu.backMenuId}" onclick="menuSeleted(this,'${backMenu.backMenuId}','${parentBackMenu.backMenuId}');"/>${backMenu.name}
                                                            <input type="hidden" name="menuId" id="menuId${backMenu.backMenuId}" value=""/>
                                                      </c:otherwise>
                                                </c:choose>
                                          </c:if>
                                    </label>
                              </c:forEach>
                        </td>
                  </tr>
            </c:forEach>
            </tbody>
      </table>
</form>



<script src="${ctx}/js/backUser/backRole.js"></script>
<script>


    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit;


        $(".layui-fixbar").remove();
        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');




    });
</script>
</body></html>
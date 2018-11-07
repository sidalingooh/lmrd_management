<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://lmrd.cn/tags/pager" prefix="page"%>
<%@ taglib uri="http://lmrd.cn/tags/pager4top" prefix="page4top"%>
<%@ taglib uri="http://lmrd.cn/tags/date" prefix="date"%>
<%@ taglib uri="http://lmrd.cn/tags/ip" prefix="ip"%>
<%@ taglib uri="http://lmrd.cn/tags/telphone" prefix="telphone"%>

<%--<link rel="stylesheet" href="${ctx}/css/common.css" >
<link rel="stylesheet" href="${ctx}/css/style.css" >
<link rel="stylesheet" href="${ctx}/common/layui/css/layui.css">
<link rel="stylesheet" href="${ctx}/css/tax/company-list.css" >
<link rel="stylesheet" href="${ctx}/css/tax/company-details.css" >--%>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    ctx = "${ctx}";
</script>
<link rel="stylesheet" href="${ctx}/frame/layui/css/layui.css">
<link rel="stylesheet" href="${ctx}/frame/static/css/style.css">
<link rel="icon" href="${ctx}/frame/static/image/code.png">

<script type="text/javascript" src="${ctx}/js/jquery-1.7.2.js"></script>
<%--<script type="text/javascript" src="${ctx}/js/layer/layer.js"></script>
<script type="text/javascript" src="${ctx}/js/layer/layer.ext.js"></script>
<script type="text/javascript" src="${ctx}/js/layer_common.js"></script>
<script type="text/javascript" src="${ctx}/js/layer/laydate.js"></script>--%>
<script type="text/javascript" src="${ctx}/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${ctx}/js/kkpager.js"></script>
<script type="text/javascript" src="${ctx}/js/page.js"></script>
<script type="text/javascript" src="${ctx}/frame/layui/layui.js"></script>
<script type="text/javascript" src="${ctx}/frame/static/js/vip_comm.js"></script>
<script type="text/javascript" src="${ctx}/js/common.js"></script>

<script type="text/javascript">
	var rootPath = '${pageContext.request.contextPath}';
	function isEmpty(value) {
		if(value != "" && value != null && value != "undefined") {
			return value;
		} else {
			return "";
		}
	}
	function refreshPage(url) {
		window.location.href=rootPath+url;
	}
	function CurentTime() {   
        var now = new Date();  
          
        var year = now.getFullYear();       //年  
        var month = now.getMonth() + 1;     //月  
        var day = now.getDate();            //日  
          
        var hh = now.getHours();            //时  
        var mm = now.getMinutes();          //分  
        var ss = now.getSeconds();           //秒  
          
        var clock = year + "-";  
          
        if(month < 10)  
            clock += "0";  
          
        clock += month + "-";  
          
        if(day < 10)  
            clock += "0";  
              
        clock += day + " ";  
          
        if(hh < 10)  
            clock += "0";  
              
        clock += hh + ":";  
        if (mm < 10) clock += '0';   
        clock += mm + ":";   
           
        if (ss < 10) clock += '0';   
        clock += ss;   
        return(clock);   
	}  
	
	function compareDateTime(beginTime,endTime) {
		var a = Date.UTC(beginTime);
		var b = Date.UTC(endTime);
		alert(a+"__"+b)
		if(a>b) {
			return false;
		}
		return true;
	}
</script>






<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ include file="../../jsp/common/common.jsp"%>
    <select id="provinceId" name="provinceId" onclick="getCityByProvince();">
        <option value=''>请选择</option>
    </select>
    <select id="cityId" name="cityId" onclick="getDistrictByCity();">
        <option value=''>请选择</option>
    </select>
    <select id="districtId" name="districtId">
        <option value=''>请选择</option>
    </select>
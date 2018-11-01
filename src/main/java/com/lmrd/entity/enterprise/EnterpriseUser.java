/*
*
* EnterpriseUser.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.enterprise;

public class EnterpriseUser {
    /**
     * enterprise_
     * 表字段 : enterprise_user.enterprise_id
     */
    private Long enterpriseId;

    /**
     * 企业名称
     * 表字段 : enterprise_user.enterprise_name
     */
    private String enterpriseName;

    /**
     * 状态
     * 表字段 : enterprise_user.state
     */
    private Integer state;

    /**
     * 级别
     * 表字段 : enterprise_user.level
     */
    private Integer level;

    /**
     * 账户
     * 表字段 : enterprise_user.account
     */
    private String account;

    /**
     * 登陆账号
     * 表字段 : enterprise_user.login_account
     */
    private String loginAccount;

    /**
     * 登录密码Not null(MD5加密)
     * 表字段 : enterprise_user.login_pwd
     */
    private String loginPwd;

    /**
     * 联系人名称
     * 表字段 : enterprise_user.contact_name
     */
    private String contactName;

    /**
     * 联系人电话
     * 表字段 : enterprise_user.contact_phone
     */
    private String contactPhone;

    /**
     * 邮箱
     * 表字段 : enterprise_user.email
     */
    private String email;

    /**
     * 机器人数量
     * 表字段 : enterprise_user.robot_num
     */
    private Integer robotNum;

    /**
     * 营业执照图片地址
     * 表字段 : enterprise_user.business_license_url
     */
    private String businessLicenseUrl;

    /**
     * 行业类别1
     * 表字段 : enterprise_user.industry_type
     */
    private String industryType;

    /**
     * 行业分类2
     * 表字段 : enterprise_user.industry_type_two
     */
    private String industryTypeTwo;

    /**
     * 邮政编码
     * 表字段 : enterprise_user.zip_code
     */
    private String zipCode;

    /**
     * 创建时间
     * 表字段 : enterprise_user.create_time
     */
    private Long createTime;

    /**
     * 修改时间
     * 表字段 : enterprise_user.update_time
     */
    private Long updateTime;

    /**
     * 省ID
     * 表字段 : enterprise_user.province_id
     */
    private String provinceId;

    /**
     * 省名称
     * 表字段 : enterprise_user.province_name
     */
    private String provinceName;

    /**
     * 市ID
     * 表字段 : enterprise_user.city_id
     */
    private String cityId;

    /**
     * 市名称
     * 表字段 : enterprise_user.city_name
     */
    private String cityName;

    /**
     * 区ID
     * 表字段 : enterprise_user.district_id
     */
    private String districtId;

    /**
     * 区名称
     * 表字段 : enterprise_user.district_name
     */
    private String districtName;

    /**
     * 地址
     * 表字段 : enterprise_user.address
     */
    private String address;

    /**
     * 获取 enterprise_ 字段:enterprise_user.enterprise_id
     *
     * @return enterprise_user.enterprise_id, enterprise_
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置 enterprise_ 字段:enterprise_user.enterprise_id
     *
     * @param enterpriseId the value for enterprise_user.enterprise_id, enterprise_
     */
    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取 企业名称 字段:enterprise_user.enterprise_name
     *
     * @return enterprise_user.enterprise_name, 企业名称
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 设置 企业名称 字段:enterprise_user.enterprise_name
     *
     * @param enterpriseName the value for enterprise_user.enterprise_name, 企业名称
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    /**
     * 获取 状态 字段:enterprise_user.state
     *
     * @return enterprise_user.state, 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置 状态 字段:enterprise_user.state
     *
     * @param state the value for enterprise_user.state, 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取 级别 字段:enterprise_user.level
     *
     * @return enterprise_user.level, 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 级别 字段:enterprise_user.level
     *
     * @param level the value for enterprise_user.level, 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 账户 字段:enterprise_user.account
     *
     * @return enterprise_user.account, 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置 账户 字段:enterprise_user.account
     *
     * @param account the value for enterprise_user.account, 账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取 登陆账号 字段:enterprise_user.login_account
     *
     * @return enterprise_user.login_account, 登陆账号
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 设置 登陆账号 字段:enterprise_user.login_account
     *
     * @param loginAccount the value for enterprise_user.login_account, 登陆账号
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    /**
     * 获取 登录密码Not null(MD5加密) 字段:enterprise_user.login_pwd
     *
     * @return enterprise_user.login_pwd, 登录密码Not null(MD5加密)
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置 登录密码Not null(MD5加密) 字段:enterprise_user.login_pwd
     *
     * @param loginPwd the value for enterprise_user.login_pwd, 登录密码Not null(MD5加密)
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * 获取 联系人名称 字段:enterprise_user.contact_name
     *
     * @return enterprise_user.contact_name, 联系人名称
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置 联系人名称 字段:enterprise_user.contact_name
     *
     * @param contactName the value for enterprise_user.contact_name, 联系人名称
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取 联系人电话 字段:enterprise_user.contact_phone
     *
     * @return enterprise_user.contact_phone, 联系人电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置 联系人电话 字段:enterprise_user.contact_phone
     *
     * @param contactPhone the value for enterprise_user.contact_phone, 联系人电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取 邮箱 字段:enterprise_user.email
     *
     * @return enterprise_user.email, 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱 字段:enterprise_user.email
     *
     * @param email the value for enterprise_user.email, 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 机器人数量 字段:enterprise_user.robot_num
     *
     * @return enterprise_user.robot_num, 机器人数量
     */
    public Integer getRobotNum() {
        return robotNum;
    }

    /**
     * 设置 机器人数量 字段:enterprise_user.robot_num
     *
     * @param robotNum the value for enterprise_user.robot_num, 机器人数量
     */
    public void setRobotNum(Integer robotNum) {
        this.robotNum = robotNum;
    }

    /**
     * 获取 营业执照图片地址 字段:enterprise_user.business_license_url
     *
     * @return enterprise_user.business_license_url, 营业执照图片地址
     */
    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    /**
     * 设置 营业执照图片地址 字段:enterprise_user.business_license_url
     *
     * @param businessLicenseUrl the value for enterprise_user.business_license_url, 营业执照图片地址
     */
    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl == null ? null : businessLicenseUrl.trim();
    }

    /**
     * 获取 行业类别1 字段:enterprise_user.industry_type
     *
     * @return enterprise_user.industry_type, 行业类别1
     */
    public String getIndustryType() {
        return industryType;
    }

    /**
     * 设置 行业类别1 字段:enterprise_user.industry_type
     *
     * @param industryType the value for enterprise_user.industry_type, 行业类别1
     */
    public void setIndustryType(String industryType) {
        this.industryType = industryType == null ? null : industryType.trim();
    }

    /**
     * 获取 行业分类2 字段:enterprise_user.industry_type_two
     *
     * @return enterprise_user.industry_type_two, 行业分类2
     */
    public String getIndustryTypeTwo() {
        return industryTypeTwo;
    }

    /**
     * 设置 行业分类2 字段:enterprise_user.industry_type_two
     *
     * @param industryTypeTwo the value for enterprise_user.industry_type_two, 行业分类2
     */
    public void setIndustryTypeTwo(String industryTypeTwo) {
        this.industryTypeTwo = industryTypeTwo == null ? null : industryTypeTwo.trim();
    }

    /**
     * 获取 邮政编码 字段:enterprise_user.zip_code
     *
     * @return enterprise_user.zip_code, 邮政编码
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置 邮政编码 字段:enterprise_user.zip_code
     *
     * @param zipCode the value for enterprise_user.zip_code, 邮政编码
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 获取 创建时间 字段:enterprise_user.create_time
     *
     * @return enterprise_user.create_time, 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:enterprise_user.create_time
     *
     * @param createTime the value for enterprise_user.create_time, 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间 字段:enterprise_user.update_time
     *
     * @return enterprise_user.update_time, 修改时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:enterprise_user.update_time
     *
     * @param updateTime the value for enterprise_user.update_time, 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 省ID 字段:enterprise_user.province_id
     *
     * @return enterprise_user.province_id, 省ID
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 设置 省ID 字段:enterprise_user.province_id
     *
     * @param provinceId the value for enterprise_user.province_id, 省ID
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 获取 省名称 字段:enterprise_user.province_name
     *
     * @return enterprise_user.province_name, 省名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置 省名称 字段:enterprise_user.province_name
     *
     * @param provinceName the value for enterprise_user.province_name, 省名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 获取 市ID 字段:enterprise_user.city_id
     *
     * @return enterprise_user.city_id, 市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置 市ID 字段:enterprise_user.city_id
     *
     * @param cityId the value for enterprise_user.city_id, 市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 获取 市名称 字段:enterprise_user.city_name
     *
     * @return enterprise_user.city_name, 市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置 市名称 字段:enterprise_user.city_name
     *
     * @param cityName the value for enterprise_user.city_name, 市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 获取 区ID 字段:enterprise_user.district_id
     *
     * @return enterprise_user.district_id, 区ID
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * 设置 区ID 字段:enterprise_user.district_id
     *
     * @param districtId the value for enterprise_user.district_id, 区ID
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    /**
     * 获取 区名称 字段:enterprise_user.district_name
     *
     * @return enterprise_user.district_name, 区名称
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 设置 区名称 字段:enterprise_user.district_name
     *
     * @param districtName the value for enterprise_user.district_name, 区名称
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    /**
     * 获取 地址 字段:enterprise_user.address
     *
     * @return enterprise_user.address, 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置 地址 字段:enterprise_user.address
     *
     * @param address the value for enterprise_user.address, 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}
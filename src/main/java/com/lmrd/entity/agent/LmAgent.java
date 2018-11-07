/*
*
* LmAgent.java
* @author LiuSiGuang
* @date 2018-11-06
*/
package com.lmrd.entity.agent;

public class LmAgent {
    /**
     * 代理商ID主键自增
     * 表字段 : lm_agent.agent_id
     */
    private Long agentId;

    /**
     * 代理商名称
     * 表字段 : lm_agent.agent_name
     */
    private String agentName;

    /**
     * 状态
     * 表字段 : lm_agent.state
     */
    private Integer state;

    /**
     * 级别
     * 表字段 : lm_agent.level
     */
    private Integer level;

    /**
     * 父级ID
     * 表字段 : lm_agent.parent_id
     */
    private Long parentId;

    /**
     * 账户
     * 表字段 : lm_agent.account
     */
    private String account;

    /**
     * 法人姓名
     * 表字段 : lm_agent.legal_person_name
     */
    private String legalPersonName;

    /**
     * 法人电话
     * 表字段 : lm_agent.legal_person_phone
     */
    private String legalPersonPhone;

    /**
     * 法人证件号码
     * 表字段 : lm_agent.legal_person_idcard
     */
    private String legalPersonIdcard;

    /**
     * 证件类型(1:身份证,2:护照) 等
     * 表字段 : lm_agent.legal_person_certificate_type
     */
    private Integer legalPersonCertificateType;

    /**
     * 联系人名称
     * 表字段 : lm_agent.contact_name
     */
    private String contactName;

    /**
     * 联系人电话
     * 表字段 : lm_agent.contact_phone
     */
    private String contactPhone;

    /**
     * 邮箱
     * 表字段 : lm_agent.email
     */
    private String email;

    /**
     * 机器人数量
     * 表字段 : lm_agent.robot_num
     */
    private Integer robotNum;

    /**
     * 营业期限至
     * 表字段 : lm_agent.operate_end
     */
    private Long operateEnd;

    /**
     * 统一社会信用代码/注册号/组织机构代码
     * 表字段 : lm_agent.biz_license_no
     */
    private String bizLicenseNo;

    /**
     * 营业执照图片地址
     * 表字段 : lm_agent.business_license_url
     */
    private String businessLicenseUrl;

    /**
     * 行业类别ID
     * 表字段 : lm_agent.industry_type_id
     */
    private Long industryTypeId;

    /**
     * 行业类别名称
     * 表字段 : lm_agent.industry_type_name
     */
    private String industryTypeName;

    /**
     * 行业分类2ID
     * 表字段 : lm_agent.industry_type_two_id
     */
    private Long industryTypeTwoId;

    /**
     * 行业分类2名称
     * 表字段 : lm_agent.industry_type_two_name
     */
    private String industryTypeTwoName;

    /**
     * 邮政编码
     * 表字段 : lm_agent.zip_code
     */
    private String zipCode;

    /**
     * 创建时间
     * 表字段 : lm_agent.create_time
     */
    private Long createTime;

    /**
     * 修改时间
     * 表字段 : lm_agent.update_time
     */
    private Long updateTime;

    /**
     * 省ID
     * 表字段 : lm_agent.province_id
     */
    private String provinceId;

    /**
     * 省名称
     * 表字段 : lm_agent.province_name
     */
    private String provinceName;

    /**
     * 市ID
     * 表字段 : lm_agent.city_id
     */
    private String cityId;

    /**
     * 市名称
     * 表字段 : lm_agent.city_name
     */
    private String cityName;

    /**
     * 区ID
     * 表字段 : lm_agent.district_id
     */
    private String districtId;

    /**
     * 区名称
     * 表字段 : lm_agent.district_name
     */
    private String districtName;

    /**
     * 地址
     * 表字段 : lm_agent.address
     */
    private String address;

    /**
     * 删除时间
     * 表字段 : lm_agent.delete_time
     */
    private Long deleteTime;

    /**
     * 删除标记
     * 表字段 : lm_agent.is_delete
     */
    private Integer isDelete;

    /**
     * 获取 代理商ID主键自增 字段:lm_agent.agent_id
     *
     * @return lm_agent.agent_id, 代理商ID主键自增
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * 设置 代理商ID主键自增 字段:lm_agent.agent_id
     *
     * @param agentId the value for lm_agent.agent_id, 代理商ID主键自增
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取 代理商名称 字段:lm_agent.agent_name
     *
     * @return lm_agent.agent_name, 代理商名称
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置 代理商名称 字段:lm_agent.agent_name
     *
     * @param agentName the value for lm_agent.agent_name, 代理商名称
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    /**
     * 获取 状态 字段:lm_agent.state
     *
     * @return lm_agent.state, 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置 状态 字段:lm_agent.state
     *
     * @param state the value for lm_agent.state, 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取 级别 字段:lm_agent.level
     *
     * @return lm_agent.level, 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 级别 字段:lm_agent.level
     *
     * @param level the value for lm_agent.level, 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 父级ID 字段:lm_agent.parent_id
     *
     * @return lm_agent.parent_id, 父级ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置 父级ID 字段:lm_agent.parent_id
     *
     * @param parentId the value for lm_agent.parent_id, 父级ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 账户 字段:lm_agent.account
     *
     * @return lm_agent.account, 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置 账户 字段:lm_agent.account
     *
     * @param account the value for lm_agent.account, 账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取 法人姓名 字段:lm_agent.legal_person_name
     *
     * @return lm_agent.legal_person_name, 法人姓名
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * 设置 法人姓名 字段:lm_agent.legal_person_name
     *
     * @param legalPersonName the value for lm_agent.legal_person_name, 法人姓名
     */
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    /**
     * 获取 法人电话 字段:lm_agent.legal_person_phone
     *
     * @return lm_agent.legal_person_phone, 法人电话
     */
    public String getLegalPersonPhone() {
        return legalPersonPhone;
    }

    /**
     * 设置 法人电话 字段:lm_agent.legal_person_phone
     *
     * @param legalPersonPhone the value for lm_agent.legal_person_phone, 法人电话
     */
    public void setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone == null ? null : legalPersonPhone.trim();
    }

    /**
     * 获取 法人证件号码 字段:lm_agent.legal_person_idcard
     *
     * @return lm_agent.legal_person_idcard, 法人证件号码
     */
    public String getLegalPersonIdcard() {
        return legalPersonIdcard;
    }

    /**
     * 设置 法人证件号码 字段:lm_agent.legal_person_idcard
     *
     * @param legalPersonIdcard the value for lm_agent.legal_person_idcard, 法人证件号码
     */
    public void setLegalPersonIdcard(String legalPersonIdcard) {
        this.legalPersonIdcard = legalPersonIdcard == null ? null : legalPersonIdcard.trim();
    }

    /**
     * 获取 证件类型(1:身份证,2:护照) 等 字段:lm_agent.legal_person_certificate_type
     *
     * @return lm_agent.legal_person_certificate_type, 证件类型(1:身份证,2:护照) 等
     */
    public Integer getLegalPersonCertificateType() {
        return legalPersonCertificateType;
    }

    /**
     * 设置 证件类型(1:身份证,2:护照) 等 字段:lm_agent.legal_person_certificate_type
     *
     * @param legalPersonCertificateType the value for lm_agent.legal_person_certificate_type, 证件类型(1:身份证,2:护照) 等
     */
    public void setLegalPersonCertificateType(Integer legalPersonCertificateType) {
        this.legalPersonCertificateType = legalPersonCertificateType;
    }

    /**
     * 获取 联系人名称 字段:lm_agent.contact_name
     *
     * @return lm_agent.contact_name, 联系人名称
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置 联系人名称 字段:lm_agent.contact_name
     *
     * @param contactName the value for lm_agent.contact_name, 联系人名称
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取 联系人电话 字段:lm_agent.contact_phone
     *
     * @return lm_agent.contact_phone, 联系人电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置 联系人电话 字段:lm_agent.contact_phone
     *
     * @param contactPhone the value for lm_agent.contact_phone, 联系人电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 获取 邮箱 字段:lm_agent.email
     *
     * @return lm_agent.email, 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱 字段:lm_agent.email
     *
     * @param email the value for lm_agent.email, 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 机器人数量 字段:lm_agent.robot_num
     *
     * @return lm_agent.robot_num, 机器人数量
     */
    public Integer getRobotNum() {
        return robotNum;
    }

    /**
     * 设置 机器人数量 字段:lm_agent.robot_num
     *
     * @param robotNum the value for lm_agent.robot_num, 机器人数量
     */
    public void setRobotNum(Integer robotNum) {
        this.robotNum = robotNum;
    }

    /**
     * 获取 营业期限至 字段:lm_agent.operate_end
     *
     * @return lm_agent.operate_end, 营业期限至
     */
    public Long getOperateEnd() {
        return operateEnd;
    }

    /**
     * 设置 营业期限至 字段:lm_agent.operate_end
     *
     * @param operateEnd the value for lm_agent.operate_end, 营业期限至
     */
    public void setOperateEnd(Long operateEnd) {
        this.operateEnd = operateEnd;
    }

    /**
     * 获取 统一社会信用代码/注册号/组织机构代码 字段:lm_agent.biz_license_no
     *
     * @return lm_agent.biz_license_no, 统一社会信用代码/注册号/组织机构代码
     */
    public String getBizLicenseNo() {
        return bizLicenseNo;
    }

    /**
     * 设置 统一社会信用代码/注册号/组织机构代码 字段:lm_agent.biz_license_no
     *
     * @param bizLicenseNo the value for lm_agent.biz_license_no, 统一社会信用代码/注册号/组织机构代码
     */
    public void setBizLicenseNo(String bizLicenseNo) {
        this.bizLicenseNo = bizLicenseNo == null ? null : bizLicenseNo.trim();
    }

    /**
     * 获取 营业执照图片地址 字段:lm_agent.business_license_url
     *
     * @return lm_agent.business_license_url, 营业执照图片地址
     */
    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    /**
     * 设置 营业执照图片地址 字段:lm_agent.business_license_url
     *
     * @param businessLicenseUrl the value for lm_agent.business_license_url, 营业执照图片地址
     */
    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl == null ? null : businessLicenseUrl.trim();
    }

    /**
     * 获取 行业类别ID 字段:lm_agent.industry_type_id
     *
     * @return lm_agent.industry_type_id, 行业类别ID
     */
    public Long getIndustryTypeId() {
        return industryTypeId;
    }

    /**
     * 设置 行业类别ID 字段:lm_agent.industry_type_id
     *
     * @param industryTypeId the value for lm_agent.industry_type_id, 行业类别ID
     */
    public void setIndustryTypeId(Long industryTypeId) {
        this.industryTypeId = industryTypeId;
    }

    /**
     * 获取 行业类别名称 字段:lm_agent.industry_type_name
     *
     * @return lm_agent.industry_type_name, 行业类别名称
     */
    public String getIndustryTypeName() {
        return industryTypeName;
    }

    /**
     * 设置 行业类别名称 字段:lm_agent.industry_type_name
     *
     * @param industryTypeName the value for lm_agent.industry_type_name, 行业类别名称
     */
    public void setIndustryTypeName(String industryTypeName) {
        this.industryTypeName = industryTypeName == null ? null : industryTypeName.trim();
    }

    /**
     * 获取 行业分类2ID 字段:lm_agent.industry_type_two_id
     *
     * @return lm_agent.industry_type_two_id, 行业分类2ID
     */
    public Long getIndustryTypeTwoId() {
        return industryTypeTwoId;
    }

    /**
     * 设置 行业分类2ID 字段:lm_agent.industry_type_two_id
     *
     * @param industryTypeTwoId the value for lm_agent.industry_type_two_id, 行业分类2ID
     */
    public void setIndustryTypeTwoId(Long industryTypeTwoId) {
        this.industryTypeTwoId = industryTypeTwoId;
    }

    /**
     * 获取 行业分类2名称 字段:lm_agent.industry_type_two_name
     *
     * @return lm_agent.industry_type_two_name, 行业分类2名称
     */
    public String getIndustryTypeTwoName() {
        return industryTypeTwoName;
    }

    /**
     * 设置 行业分类2名称 字段:lm_agent.industry_type_two_name
     *
     * @param industryTypeTwoName the value for lm_agent.industry_type_two_name, 行业分类2名称
     */
    public void setIndustryTypeTwoName(String industryTypeTwoName) {
        this.industryTypeTwoName = industryTypeTwoName == null ? null : industryTypeTwoName.trim();
    }

    /**
     * 获取 邮政编码 字段:lm_agent.zip_code
     *
     * @return lm_agent.zip_code, 邮政编码
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置 邮政编码 字段:lm_agent.zip_code
     *
     * @param zipCode the value for lm_agent.zip_code, 邮政编码
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 获取 创建时间 字段:lm_agent.create_time
     *
     * @return lm_agent.create_time, 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:lm_agent.create_time
     *
     * @param createTime the value for lm_agent.create_time, 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间 字段:lm_agent.update_time
     *
     * @return lm_agent.update_time, 修改时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:lm_agent.update_time
     *
     * @param updateTime the value for lm_agent.update_time, 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 省ID 字段:lm_agent.province_id
     *
     * @return lm_agent.province_id, 省ID
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 设置 省ID 字段:lm_agent.province_id
     *
     * @param provinceId the value for lm_agent.province_id, 省ID
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 获取 省名称 字段:lm_agent.province_name
     *
     * @return lm_agent.province_name, 省名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置 省名称 字段:lm_agent.province_name
     *
     * @param provinceName the value for lm_agent.province_name, 省名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 获取 市ID 字段:lm_agent.city_id
     *
     * @return lm_agent.city_id, 市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置 市ID 字段:lm_agent.city_id
     *
     * @param cityId the value for lm_agent.city_id, 市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 获取 市名称 字段:lm_agent.city_name
     *
     * @return lm_agent.city_name, 市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置 市名称 字段:lm_agent.city_name
     *
     * @param cityName the value for lm_agent.city_name, 市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 获取 区ID 字段:lm_agent.district_id
     *
     * @return lm_agent.district_id, 区ID
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * 设置 区ID 字段:lm_agent.district_id
     *
     * @param districtId the value for lm_agent.district_id, 区ID
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    /**
     * 获取 区名称 字段:lm_agent.district_name
     *
     * @return lm_agent.district_name, 区名称
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 设置 区名称 字段:lm_agent.district_name
     *
     * @param districtName the value for lm_agent.district_name, 区名称
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    /**
     * 获取 地址 字段:lm_agent.address
     *
     * @return lm_agent.address, 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置 地址 字段:lm_agent.address
     *
     * @param address the value for lm_agent.address, 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取 删除时间 字段:lm_agent.delete_time
     *
     * @return lm_agent.delete_time, 删除时间
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置 删除时间 字段:lm_agent.delete_time
     *
     * @param deleteTime the value for lm_agent.delete_time, 删除时间
     */
    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取 删除标记 字段:lm_agent.is_delete
     *
     * @return lm_agent.is_delete, 删除标记
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 删除标记 字段:lm_agent.is_delete
     *
     * @param isDelete the value for lm_agent.is_delete, 删除标记
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
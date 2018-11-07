/*
*
* LmEnterpriseUserMapper.java
* @author LiuSiGuang
* @date 2018-11-06
*/
package com.lmrd.dao.enterpriseUser;

import com.lmrd.entity.enterpriseUser.LmEnterpriseUser;
import com.lmrd.entity.enterpriseUser.LmEnterpriseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LmEnterpriseUserMapper {
    /**
     *  根据指定的条件获取数据库记录数,lm_enterprise_user
     *
     * @param example
     */
    long countByExample(LmEnterpriseUserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lm_enterprise_user
     *
     * @param example
     */
    int deleteByExample(LmEnterpriseUserExample example);

    /**
     *  根据主键删除数据库的记录,lm_enterprise_user
     *
     * @param enterpriseId
     */
    int deleteByPrimaryKey(Long enterpriseId);

    /**
     *  新写入数据库记录,lm_enterprise_user
     *
     * @param record
     */
    int insert(LmEnterpriseUser record);

    /**
     *  动态字段,写入数据库记录,lm_enterprise_user
     *
     * @param record
     */
    int insertSelective(LmEnterpriseUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lm_enterprise_user
     *
     * @param example
     */
    List<LmEnterpriseUser> selectByExample(LmEnterpriseUserExample example);

    /**
     *  根据指定主键获取一条数据库记录,lm_enterprise_user
     *
     * @param enterpriseId
     */
    LmEnterpriseUser selectByPrimaryKey(Long enterpriseId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lm_enterprise_user
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") LmEnterpriseUser record, @Param("example") LmEnterpriseUserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lm_enterprise_user
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") LmEnterpriseUser record, @Param("example") LmEnterpriseUserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lm_enterprise_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(LmEnterpriseUser record);

    /**
     *  根据主键来更新符合条件的数据库记录,lm_enterprise_user
     *
     * @param record
     */
    int updateByPrimaryKey(LmEnterpriseUser record);
}
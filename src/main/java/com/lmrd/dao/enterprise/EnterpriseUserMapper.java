/*
*
* EnterpriseUserMapper.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.dao.enterprise;

import com.lmrd.entity.enterprise.EnterpriseUser;
import com.lmrd.entity.enterprise.EnterpriseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseUserMapper {
    /**
     *  根据指定的条件获取数据库记录数,enterprise_user
     *
     * @param example
     */
    long countByExample(EnterpriseUserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,enterprise_user
     *
     * @param example
     */
    int deleteByExample(EnterpriseUserExample example);

    /**
     *  根据主键删除数据库的记录,enterprise_user
     *
     * @param enterpriseId
     */
    int deleteByPrimaryKey(Long enterpriseId);

    /**
     *  新写入数据库记录,enterprise_user
     *
     * @param record
     */
    int insert(EnterpriseUser record);

    /**
     *  动态字段,写入数据库记录,enterprise_user
     *
     * @param record
     */
    int insertSelective(EnterpriseUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,enterprise_user
     *
     * @param example
     */
    List<EnterpriseUser> selectByExample(EnterpriseUserExample example);

    /**
     *  根据指定主键获取一条数据库记录,enterprise_user
     *
     * @param enterpriseId
     */
    EnterpriseUser selectByPrimaryKey(Long enterpriseId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,enterprise_user
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") EnterpriseUser record, @Param("example") EnterpriseUserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,enterprise_user
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") EnterpriseUser record, @Param("example") EnterpriseUserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,enterprise_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(EnterpriseUser record);

    /**
     *  根据主键来更新符合条件的数据库记录,enterprise_user
     *
     * @param record
     */
    int updateByPrimaryKey(EnterpriseUser record);
}
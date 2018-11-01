/*
*
* BackRoleMapper.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.dao.user;

import com.lmrd.entity.user.BackRole;
import com.lmrd.entity.user.BackRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackRoleMapper {
    /**
     *  根据指定的条件获取数据库记录数,back_role
     *
     * @param example
     */
    long countByExample(BackRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,back_role
     *
     * @param example
     */
    int deleteByExample(BackRoleExample example);

    /**
     *  根据主键删除数据库的记录,back_role
     *
     * @param backRoleId
     */
    int deleteByPrimaryKey(Long backRoleId);

    /**
     *  新写入数据库记录,back_role
     *
     * @param record
     */
    int insert(BackRole record);

    /**
     *  动态字段,写入数据库记录,back_role
     *
     * @param record
     */
    int insertSelective(BackRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,back_role
     *
     * @param example
     */
    List<BackRole> selectByExample(BackRoleExample example);

    /**
     *  根据指定主键获取一条数据库记录,back_role
     *
     * @param backRoleId
     */
    BackRole selectByPrimaryKey(Long backRoleId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,back_role
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BackRole record, @Param("example") BackRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,back_role
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BackRole record, @Param("example") BackRoleExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,back_role
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BackRole record);

    /**
     *  根据主键来更新符合条件的数据库记录,back_role
     *
     * @param record
     */
    int updateByPrimaryKey(BackRole record);
}
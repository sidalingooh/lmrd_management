/*
*
* BackUserRoleMapper.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.dao.user;

import com.lmrd.entity.user.BackUserRole;
import com.lmrd.entity.user.BackUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackUserRoleMapper {
    /**
     *  根据指定的条件获取数据库记录数,back_user_role
     *
     * @param example
     */
    long countByExample(BackUserRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,back_user_role
     *
     * @param example
     */
    int deleteByExample(BackUserRoleExample example);

    /**
     *  根据主键删除数据库的记录,back_user_role
     *
     * @param backUserRoleId
     */
    int deleteByPrimaryKey(Long backUserRoleId);

    /**
     *  新写入数据库记录,back_user_role
     *
     * @param record
     */
    int insert(BackUserRole record);

    /**
     *  动态字段,写入数据库记录,back_user_role
     *
     * @param record
     */
    int insertSelective(BackUserRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,back_user_role
     *
     * @param example
     */
    List<BackUserRole> selectByExample(BackUserRoleExample example);

    /**
     *  根据指定主键获取一条数据库记录,back_user_role
     *
     * @param backUserRoleId
     */
    BackUserRole selectByPrimaryKey(Long backUserRoleId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,back_user_role
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BackUserRole record, @Param("example") BackUserRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,back_user_role
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BackUserRole record, @Param("example") BackUserRoleExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,back_user_role
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BackUserRole record);

    /**
     *  根据主键来更新符合条件的数据库记录,back_user_role
     *
     * @param record
     */
    int updateByPrimaryKey(BackUserRole record);
}
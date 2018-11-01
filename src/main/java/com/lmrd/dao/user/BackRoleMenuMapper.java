/*
*
* BackRoleMenuMapper.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.dao.user;

import com.lmrd.entity.user.BackRoleMenu;
import com.lmrd.entity.user.BackRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackRoleMenuMapper {
    /**
     *  根据指定的条件获取数据库记录数,back_role_menu
     *
     * @param example
     */
    long countByExample(BackRoleMenuExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,back_role_menu
     *
     * @param example
     */
    int deleteByExample(BackRoleMenuExample example);

    /**
     *  根据主键删除数据库的记录,back_role_menu
     *
     * @param backRoleMenuId
     */
    int deleteByPrimaryKey(Long backRoleMenuId);

    /**
     *  新写入数据库记录,back_role_menu
     *
     * @param record
     */
    int insert(BackRoleMenu record);

    /**
     *  动态字段,写入数据库记录,back_role_menu
     *
     * @param record
     */
    int insertSelective(BackRoleMenu record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,back_role_menu
     *
     * @param example
     */
    List<BackRoleMenu> selectByExample(BackRoleMenuExample example);

    /**
     *  根据指定主键获取一条数据库记录,back_role_menu
     *
     * @param backRoleMenuId
     */
    BackRoleMenu selectByPrimaryKey(Long backRoleMenuId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,back_role_menu
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BackRoleMenu record, @Param("example") BackRoleMenuExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,back_role_menu
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BackRoleMenu record, @Param("example") BackRoleMenuExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,back_role_menu
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BackRoleMenu record);

    /**
     *  根据主键来更新符合条件的数据库记录,back_role_menu
     *
     * @param record
     */
    int updateByPrimaryKey(BackRoleMenu record);


    /**
     *
     * @param backRoleMenuList
     * @return
     */
    int addRoleMenu(List<BackRoleMenu> backRoleMenuList);
}
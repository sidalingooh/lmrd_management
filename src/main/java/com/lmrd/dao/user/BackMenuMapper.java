/*
*
* BackMenuMapper.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.dao.user;

import com.lmrd.entity.user.BackMenu;
import com.lmrd.entity.user.BackMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackMenuMapper {
    /**
     *  根据指定的条件获取数据库记录数,back_menu
     *
     * @param example
     */
    long countByExample(BackMenuExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,back_menu
     *
     * @param example
     */
    int deleteByExample(BackMenuExample example);

    /**
     *  根据主键删除数据库的记录,back_menu
     *
     * @param backMenuId
     */
    int deleteByPrimaryKey(Long backMenuId);

    /**
     *  新写入数据库记录,back_menu
     *
     * @param record
     */
    int insert(BackMenu record);

    /**
     *  动态字段,写入数据库记录,back_menu
     *
     * @param record
     */
    int insertSelective(BackMenu record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,back_menu
     *
     * @param example
     */
    List<BackMenu> selectByExample(BackMenuExample example);

    /**
     *  根据指定主键获取一条数据库记录,back_menu
     *
     * @param backMenuId
     */
    BackMenu selectByPrimaryKey(Long backMenuId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,back_menu
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BackMenu record, @Param("example") BackMenuExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,back_menu
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BackMenu record, @Param("example") BackMenuExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,back_menu
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BackMenu record);

    /**
     *  根据主键来更新符合条件的数据库记录,back_menu
     *
     * @param record
     */
    int updateByPrimaryKey(BackMenu record);

    List<BackMenu> selectByBackUserId(Long backUserId);
}
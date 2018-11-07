/*
*
* BackUserMapper.java
* @author LiuSiGuang
* @date 2018-11-06
*/
package com.lmrd.dao.user;

import com.lmrd.entity.user.BackUser;
import com.lmrd.entity.user.BackUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackUserMapper {
    /**
     *  根据指定的条件获取数据库记录数,back_user
     *
     * @param example
     */
    long countByExample(BackUserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,back_user
     *
     * @param example
     */
    int deleteByExample(BackUserExample example);

    /**
     *  根据主键删除数据库的记录,back_user
     *
     * @param backUserId
     */
    int deleteByPrimaryKey(Long backUserId);

    /**
     *  新写入数据库记录,back_user
     *
     * @param record
     */
    int insert(BackUser record);

    /**
     *  动态字段,写入数据库记录,back_user
     *
     * @param record
     */
    int insertSelective(BackUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,back_user
     *
     * @param example
     */
    List<BackUser> selectByExample(BackUserExample example);

    /**
     *  根据指定主键获取一条数据库记录,back_user
     *
     * @param backUserId
     */
    BackUser selectByPrimaryKey(Long backUserId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,back_user
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BackUser record, @Param("example") BackUserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,back_user
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BackUser record, @Param("example") BackUserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,back_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BackUser record);

    /**
     *  根据主键来更新符合条件的数据库记录,back_user
     *
     * @param record
     */
    int updateByPrimaryKey(BackUser record);

    /**
     *
     * @param userName
     * @return
     */
    BackUser selectByUserName(String userName);
}
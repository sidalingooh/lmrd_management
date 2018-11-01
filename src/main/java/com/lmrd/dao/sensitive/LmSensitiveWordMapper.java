/*
*
* LmSensitiveWordMapper.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.dao.sensitive;

import com.lmrd.entity.sensitive.LmSensitiveWord;
import com.lmrd.entity.sensitive.LmSensitiveWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LmSensitiveWordMapper {
    /**
     *  根据指定的条件获取数据库记录数,lm_sensitive_word
     *
     * @param example
     */
    long countByExample(LmSensitiveWordExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lm_sensitive_word
     *
     * @param example
     */
    int deleteByExample(LmSensitiveWordExample example);

    /**
     *  根据主键删除数据库的记录,lm_sensitive_word
     *
     * @param sensitiveWordId
     */
    int deleteByPrimaryKey(Long sensitiveWordId);

    /**
     *  新写入数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int insert(LmSensitiveWord record);

    /**
     *  动态字段,写入数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int insertSelective(LmSensitiveWord record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lm_sensitive_word
     *
     * @param example
     */
    List<LmSensitiveWord> selectByExample(LmSensitiveWordExample example);

    /**
     *  根据指定主键获取一条数据库记录,lm_sensitive_word
     *
     * @param sensitiveWordId
     */
    LmSensitiveWord selectByPrimaryKey(Long sensitiveWordId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") LmSensitiveWord record, @Param("example") LmSensitiveWordExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") LmSensitiveWord record, @Param("example") LmSensitiveWordExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int updateByPrimaryKeySelective(LmSensitiveWord record);

    /**
     *  根据主键来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int updateByPrimaryKey(LmSensitiveWord record);
}
package com.lmrd.service.sensitiveWord;

import com.lmrd.entity.sensitiveWord.ImSensitiveWord;
import com.lmrd.entity.sensitiveWord.ImSensitiveWordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: teck
 * @Date: 2018/11/5 11:07
 * @Description:
 */
public interface SensitiveWordService {

    /**
     *  根据指定的条件获取数据库记录数,lm_sensitive_word
     *
     * @param example
     */
    long countByExample(ImSensitiveWordExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lm_sensitive_word
     *
     * @param example
     */
    int deleteByExample(ImSensitiveWordExample example);

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
    int insert(ImSensitiveWord record);

    /**
     *  动态字段,写入数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int insertSelective(ImSensitiveWord record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lm_sensitive_word
     *
     * @param example
     */
    List<ImSensitiveWord> selectByExample(ImSensitiveWordExample example);

    /**
     *  根据指定主键获取一条数据库记录,lm_sensitive_word
     *
     * @param sensitiveWordId
     */
    ImSensitiveWord selectByPrimaryKey(Long sensitiveWordId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ImSensitiveWord record, @Param("example") ImSensitiveWordExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ImSensitiveWord record, @Param("example") ImSensitiveWordExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ImSensitiveWord record);

    /**
     *  根据主键来更新符合条件的数据库记录,lm_sensitive_word
     *
     * @param record
     */
    int updateByPrimaryKey(ImSensitiveWord record);
}

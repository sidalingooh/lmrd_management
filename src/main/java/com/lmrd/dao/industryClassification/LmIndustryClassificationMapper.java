/*
*
* LmIndustryClassificationMapper.java
* @author LiuSiGuang
* @date 2018-11-05
*/
package com.lmrd.dao.industryClassification;

import com.lmrd.entity.industryClassification.LmIndustryClassification;
import com.lmrd.entity.industryClassification.LmIndustryClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LmIndustryClassificationMapper {
    /**
     *  根据指定的条件获取数据库记录数,lm_industry_classification
     *
     * @param example
     */
    long countByExample(LmIndustryClassificationExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lm_industry_classification
     *
     * @param example
     */
    int deleteByExample(LmIndustryClassificationExample example);

    /**
     *  根据主键删除数据库的记录,lm_industry_classification
     *
     * @param industryClassificationId
     */
    int deleteByPrimaryKey(Long industryClassificationId);

    /**
     *  新写入数据库记录,lm_industry_classification
     *
     * @param record
     */
    int insert(LmIndustryClassification record);

    /**
     *  动态字段,写入数据库记录,lm_industry_classification
     *
     * @param record
     */
    int insertSelective(LmIndustryClassification record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lm_industry_classification
     *
     * @param example
     */
    List<LmIndustryClassification> selectByExample(LmIndustryClassificationExample example);

    /**
     *  根据指定主键获取一条数据库记录,lm_industry_classification
     *
     * @param industryClassificationId
     */
    LmIndustryClassification selectByPrimaryKey(Long industryClassificationId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lm_industry_classification
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") LmIndustryClassification record, @Param("example") LmIndustryClassificationExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lm_industry_classification
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") LmIndustryClassification record, @Param("example") LmIndustryClassificationExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lm_industry_classification
     *
     * @param record
     */
    int updateByPrimaryKeySelective(LmIndustryClassification record);

    /**
     *  根据主键来更新符合条件的数据库记录,lm_industry_classification
     *
     * @param record
     */
    int updateByPrimaryKey(LmIndustryClassification record);
}
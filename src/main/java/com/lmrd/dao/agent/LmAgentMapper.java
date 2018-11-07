/*
*
* LmAgentMapper.java
* @author LiuSiGuang
* @date 2018-11-06
*/
package com.lmrd.dao.agent;

import com.lmrd.entity.agent.LmAgent;
import com.lmrd.entity.agent.LmAgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LmAgentMapper {
    /**
     *  根据指定的条件获取数据库记录数,lm_agent
     *
     * @param example
     */
    long countByExample(LmAgentExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lm_agent
     *
     * @param example
     */
    int deleteByExample(LmAgentExample example);

    /**
     *  根据主键删除数据库的记录,lm_agent
     *
     * @param agentId
     */
    int deleteByPrimaryKey(Long agentId);

    /**
     *  新写入数据库记录,lm_agent
     *
     * @param record
     */
    int insert(LmAgent record);

    /**
     *  动态字段,写入数据库记录,lm_agent
     *
     * @param record
     */
    int insertSelective(LmAgent record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lm_agent
     *
     * @param example
     */
    List<LmAgent> selectByExample(LmAgentExample example);

    /**
     *  根据指定主键获取一条数据库记录,lm_agent
     *
     * @param agentId
     */
    LmAgent selectByPrimaryKey(Long agentId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lm_agent
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") LmAgent record, @Param("example") LmAgentExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lm_agent
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") LmAgent record, @Param("example") LmAgentExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lm_agent
     *
     * @param record
     */
    int updateByPrimaryKeySelective(LmAgent record);

    /**
     *  根据主键来更新符合条件的数据库记录,lm_agent
     *
     * @param record
     */
    int updateByPrimaryKey(LmAgent record);

    List<LmAgent> selectChildrenList(LmAgent record);
}
package com.lmrd.service.agent.impl;

import com.lmrd.dao.agent.LmAgentMapper;
import com.lmrd.entity.agent.LmAgent;
import com.lmrd.entity.agent.LmAgentExample;
import com.lmrd.service.agent.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: teck
 * @Date: 2018/11/6 14:52
 * @Description:
 */
@Service(value = "agentService")
public class AgentServiceImpl implements AgentService {

    @Autowired
    private LmAgentMapper lmAgentMapper;

    @Override
    public long countByExample(LmAgentExample example) {
        return lmAgentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LmAgentExample example) {
        return lmAgentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long agentId) {
        return lmAgentMapper.deleteByPrimaryKey(agentId);
    }

    @Override
    public int insert(LmAgent record) {
        return lmAgentMapper.insert(record);
    }

    @Override
    public int insertSelective(LmAgent record) {
        return lmAgentMapper.insertSelective(record);
    }

    @Override
    public List<LmAgent> selectByExample(LmAgentExample example) {
        return lmAgentMapper.selectByExample(example);
    }

    @Override
    public LmAgent selectByPrimaryKey(Long agentId) {
        return lmAgentMapper.selectByPrimaryKey(agentId);
    }

    @Override
    public int updateByExampleSelective(LmAgent record, LmAgentExample example) {
        return lmAgentMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(LmAgent record, LmAgentExample example) {
        return lmAgentMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(LmAgent record) {
        return lmAgentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LmAgent record) {
        return lmAgentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<LmAgent> selectChildrenList(LmAgent record) {
        return lmAgentMapper.selectChildrenList(record);
    }
}

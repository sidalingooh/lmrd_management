package com.lmrd.service.sensitiveWord.impl;


import com.lmrd.dao.sensitiveWord.ImSensitiveWordMapper;
import com.lmrd.entity.sensitiveWord.ImSensitiveWord;
import com.lmrd.entity.sensitiveWord.ImSensitiveWordExample;
import com.lmrd.service.sensitiveWord.SensitiveWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: teck
 * @Date: 2018/11/5 11:08
 * @Description:
 */
@Service(value = "sensitiveWordService")
public class SensitiveWordServiceImpl implements SensitiveWordService {

    @Autowired
    private ImSensitiveWordMapper imSensitiveWordMapper;

    @Override
    public long countByExample(ImSensitiveWordExample example) {
        return imSensitiveWordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ImSensitiveWordExample example) {
        return imSensitiveWordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long sensitiveWordId) {
        return imSensitiveWordMapper.deleteByPrimaryKey(sensitiveWordId);
    }

    @Override
    public int insert(ImSensitiveWord record) {
        return imSensitiveWordMapper.insert(record);
    }

    @Override
    public int insertSelective(ImSensitiveWord record) {
        return imSensitiveWordMapper.insertSelective(record);
    }

    @Override
    public List<ImSensitiveWord> selectByExample(ImSensitiveWordExample example) {
        return imSensitiveWordMapper.selectByExample(example);
    }

    @Override
    public ImSensitiveWord selectByPrimaryKey(Long sensitiveWordId) {
        return imSensitiveWordMapper.selectByPrimaryKey(sensitiveWordId);
    }

    @Override
    public int updateByExampleSelective(ImSensitiveWord record, ImSensitiveWordExample example) {
        return imSensitiveWordMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ImSensitiveWord record, ImSensitiveWordExample example) {
        return imSensitiveWordMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ImSensitiveWord record) {
        return imSensitiveWordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ImSensitiveWord record) {
        return imSensitiveWordMapper.updateByPrimaryKey(record);
    }
}

package com.lmrd.service.sensitiveWord.impl;


import com.lmrd.dao.sensitiveWord.LmSensitiveWordMapper;
import com.lmrd.entity.sensitiveWord.LmSensitiveWord;
import com.lmrd.entity.sensitiveWord.LmSensitiveWordExample;
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
    private LmSensitiveWordMapper imSensitiveWordMapper;

    @Override
    public long countByExample(LmSensitiveWordExample example) {
        return imSensitiveWordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LmSensitiveWordExample example) {
        return imSensitiveWordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long sensitiveWordId) {
        return imSensitiveWordMapper.deleteByPrimaryKey(sensitiveWordId);
    }

    @Override
    public int insert(LmSensitiveWord record) {
        return imSensitiveWordMapper.insert(record);
    }

    @Override
    public int insertSelective(LmSensitiveWord record) {
        return imSensitiveWordMapper.insertSelective(record);
    }

    @Override
    public List<LmSensitiveWord> selectByExample(LmSensitiveWordExample example) {
        return imSensitiveWordMapper.selectByExample(example);
    }

    @Override
    public LmSensitiveWord selectByPrimaryKey(Long sensitiveWordId) {
        return imSensitiveWordMapper.selectByPrimaryKey(sensitiveWordId);
    }

    @Override
    public int updateByExampleSelective(LmSensitiveWord record, LmSensitiveWordExample example) {
        return imSensitiveWordMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(LmSensitiveWord record, LmSensitiveWordExample example) {
        return imSensitiveWordMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(LmSensitiveWord record) {
        return imSensitiveWordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LmSensitiveWord record) {
        return imSensitiveWordMapper.updateByPrimaryKey(record);
    }
}

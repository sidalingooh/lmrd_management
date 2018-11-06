package com.lmrd.service.industryClassification.impl;


import com.lmrd.dao.industryClassification.LmIndustryClassificationMapper;
import com.lmrd.entity.industryClassification.LmIndustryClassification;
import com.lmrd.entity.industryClassification.LmIndustryClassificationExample;
import com.lmrd.service.industryClassification.IndustryClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: teck
 * @Date: 2018/11/5 14:24
 * @Description:
 */
@Service(value="industryClassificationService")
public class IndustryClassificationServiceImpl implements IndustryClassificationService {

    @Autowired
    private LmIndustryClassificationMapper lmIndustryClassificationMapper;


    @Override
    public long countByExample(LmIndustryClassificationExample example) {
        return lmIndustryClassificationMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LmIndustryClassificationExample example) {
        return lmIndustryClassificationMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long industryClassificationId) {
        return lmIndustryClassificationMapper.deleteByPrimaryKey(industryClassificationId);
    }

    @Override
    public int insert(LmIndustryClassification record) {
        return lmIndustryClassificationMapper.insert(record);
    }

    @Override
    public int insertSelective(LmIndustryClassification record) {
        return lmIndustryClassificationMapper.insertSelective(record);
    }

    @Override
    public List<LmIndustryClassification> selectByExample(LmIndustryClassificationExample example) {
        return lmIndustryClassificationMapper.selectByExample(example);
    }

    @Override
    public LmIndustryClassification selectByPrimaryKey(Long industryClassificationId) {
        return lmIndustryClassificationMapper.selectByPrimaryKey(industryClassificationId);
    }

    @Override
    public int updateByExampleSelective(LmIndustryClassification record, LmIndustryClassificationExample example) {
        return lmIndustryClassificationMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(LmIndustryClassification record, LmIndustryClassificationExample example) {
        return lmIndustryClassificationMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(LmIndustryClassification record) {
        return lmIndustryClassificationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LmIndustryClassification record) {
        return lmIndustryClassificationMapper.updateByPrimaryKey(record);
    }
}

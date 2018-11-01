package com.lmrd.service.region.impl;

import com.alibaba.fastjson.JSONObject;
import com.lmrd.dao.region.LmRegionMapper;
import com.lmrd.entity.region.LmRegion;
import com.lmrd.entity.region.LmRegionExample;
import com.lmrd.service.region.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "regionService")
public class RegionServiceImpl implements RegionService {

    @Autowired
    private LmRegionMapper lmRegionMapper;


    @Override
    public long countByExample(LmRegionExample example) {
        return lmRegionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LmRegionExample example) {
        return lmRegionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String regionId) {
        return lmRegionMapper.deleteByPrimaryKey(regionId);
    }

    @Override
    public int insert(LmRegion record) {
        return lmRegionMapper.insert(record);
    }

    @Override
    public int insertSelective(LmRegion record) {
        return lmRegionMapper.insertSelective(record);
    }

    @Override
    public List<LmRegion> selectByExample(LmRegionExample example) {
        return lmRegionMapper.selectByExample(example);
    }

    @Override
    public LmRegion selectByPrimaryKey(String regionId) {
        return lmRegionMapper.selectByPrimaryKey(regionId);
    }

    @Override
    public int updateByExampleSelective(LmRegion record, LmRegionExample example) {
        return lmRegionMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(LmRegion record, LmRegionExample example) {
        return lmRegionMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(LmRegion record) {
        return lmRegionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LmRegion record) {
        return lmRegionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<LmRegion> selectRegionList(JSONObject jsonObject) {
        return lmRegionMapper.selectRegionList();
    }
}

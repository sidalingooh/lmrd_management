package com.lmrd.service.user.impl;


import com.lmrd.dao.user.BackMenuMapper;
import com.lmrd.entity.user.BackMenu;
import com.lmrd.entity.user.BackMenuExample;
import com.lmrd.service.user.BackMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "backMenuService")
public class BackMenuServiceImpl implements BackMenuService {

    @Autowired
    private BackMenuMapper backMenuMapper;

    @Override
    public long countByExample(BackMenuExample example) {
        return backMenuMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BackMenuExample example) {
        return backMenuMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long backMenuId) {
        return backMenuMapper.deleteByPrimaryKey(backMenuId);
    }

    @Override
    public int insert(BackMenu record) {
        return backMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(BackMenu record) {
        return backMenuMapper.insertSelective(record);
    }

    @Override
    public List<BackMenu> selectByExample(BackMenuExample example) {
        return backMenuMapper.selectByExample(example);
    }

    @Override
    public BackMenu selectByPrimaryKey(Long backMenuId) {
        return backMenuMapper.selectByPrimaryKey(backMenuId);
    }

    @Override
    public int updateByExampleSelective(BackMenu record, BackMenuExample example) {
        return backMenuMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BackMenu record, BackMenuExample example) {
        return backMenuMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BackMenu record) {
        return backMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BackMenu record) {
        return backMenuMapper.updateByPrimaryKey(record);
    }


    @Override
    public List<BackMenu> selectByBackUserId(Long backUserId) {
        // TODO Auto-generated method stub
        return backMenuMapper.selectByBackUserId(backUserId);
    }
}

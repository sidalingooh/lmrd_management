package com.lmrd.service.user.impl;


import com.lmrd.dao.user.BackUserMapper;
import com.lmrd.entity.user.BackUser;
import com.lmrd.entity.user.BackUserExample;
import com.lmrd.service.user.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "backUserService")
public class BackUserServiceImpl implements BackUserService {

    @Autowired
    private BackUserMapper backUserMapper;

    @Override
    public int countByExample(BackUserExample example) {
        return 1;
    }

    @Override
    public int deleteByExample(BackUserExample example) {
        return backUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long backUserId) {
        return backUserMapper.deleteByPrimaryKey(backUserId);
    }

    @Override
    public int insert(BackUser record) {
        return backUserMapper.insert(record);
    }

    @Override
    public int insertSelective(BackUser record) {
        return backUserMapper.insertSelective(record);
    }

    @Override
    public List<BackUser> selectByExample(BackUserExample example) {
        return backUserMapper.selectByExample(example);
    }

    @Override
    public BackUser selectByPrimaryKey(Long backUserId) {
        return backUserMapper.selectByPrimaryKey(backUserId);
    }

    @Override
    public int updateByExampleSelective(BackUser record, BackUserExample example) {
        return backUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BackUser record, BackUserExample example) {
        return backUserMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BackUser record) {
        return backUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BackUser record) {
        return backUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public BackUser selectByUserName(String userName) {
        // TODO Auto-generated method stub
        System.out.println(userName);
        return backUserMapper.selectByUserName(userName);
    }
}

package com.lmrd.service.user.impl;

import com.lmrd.dao.user.BackRoleMapper;
import com.lmrd.entity.user.BackRole;
import com.lmrd.entity.user.BackRoleExample;
import com.lmrd.service.user.BackRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "backRoleService")
public class BackRoleServiceImpl implements BackRoleService {

    @Autowired
    private BackRoleMapper backRoleMapper;

    @Override
    public long countByExample(BackRoleExample example) {
        return backRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BackRoleExample example) {
        return backRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long backRoleId) {
        return backRoleMapper.deleteByPrimaryKey(backRoleId);
    }

    @Override
    public int insert(BackRole record) {
        return backRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(BackRole record) {
        return backRoleMapper.insertSelective(record);
    }

    @Override
    public List<BackRole> selectByExample(BackRoleExample example) {
        return backRoleMapper.selectByExample(example);
    }

    @Override
    public BackRole selectByPrimaryKey(Long backRoleId) {
        return backRoleMapper.selectByPrimaryKey(backRoleId);
    }

    @Override
    public int updateByExampleSelective(BackRole record, BackRoleExample example) {
        return backRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BackRole record, BackRoleExample example) {
        return backRoleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BackRole record) {
        return backRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BackRole record) {
        return backRoleMapper.updateByPrimaryKey(record);
    }
}

package com.lmrd.service.user.impl;

import com.lmrd.dao.user.BackUserRoleMapper;
import com.lmrd.entity.user.BackUserRole;
import com.lmrd.entity.user.BackUserRoleExample;
import com.lmrd.service.user.BackUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "backUserRoleService")
public class BackUserRoleServiceImpl implements BackUserRoleService {

    @Autowired
    private BackUserRoleMapper backUserRoleMapper;

    @Override
    public long countByExample(BackUserRoleExample example) {
        return backUserRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BackUserRoleExample example) {
        return backUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long backUserRoleId) {
        return backUserRoleMapper.deleteByPrimaryKey(backUserRoleId);
    }

    @Override
    public int insert(BackUserRole record) {
        return backUserRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(BackUserRole record) {
        return backUserRoleMapper.insertSelective(record);
    }

    @Override
    public List<BackUserRole> selectByExample(BackUserRoleExample example) {
        return backUserRoleMapper.selectByExample(example);
    }

    @Override
    public BackUserRole selectByPrimaryKey(Long backUserRoleId) {
        return backUserRoleMapper.selectByPrimaryKey(backUserRoleId);
    }

    @Override
    public int updateByExampleSelective(BackUserRole record, BackUserRoleExample example) {
        return backUserRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BackUserRole record, BackUserRoleExample example) {
        return backUserRoleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BackUserRole record) {
        return backUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BackUserRole record) {
        return backUserRoleMapper.updateByPrimaryKey(record);
    }
}

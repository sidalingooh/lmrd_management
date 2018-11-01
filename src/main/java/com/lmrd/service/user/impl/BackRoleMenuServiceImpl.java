package com.lmrd.service.user.impl;

import com.lmrd.dao.user.BackRoleMenuMapper;
import com.lmrd.entity.user.BackRoleMenu;
import com.lmrd.entity.user.BackRoleMenuExample;
import com.lmrd.service.user.BackRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "backRoleMenuService")
public class BackRoleMenuServiceImpl implements BackRoleMenuService {

    @Autowired
    private BackRoleMenuMapper backRoleMenuMapper;

    @Override
    public long countByExample(BackRoleMenuExample example) {
        return backRoleMenuMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BackRoleMenuExample example) {
        return backRoleMenuMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long backRoleMenuId) {
        return backRoleMenuMapper.deleteByPrimaryKey(backRoleMenuId);
    }

    @Override
    public int insert(BackRoleMenu record) {
        return backRoleMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(BackRoleMenu record) {
        return backRoleMenuMapper.insertSelective(record);
    }

    @Override
    public List<BackRoleMenu> selectByExample(BackRoleMenuExample example) {
        return backRoleMenuMapper.selectByExample(example);
    }

    @Override
    public BackRoleMenu selectByPrimaryKey(Long backRoleMenuId) {
        return backRoleMenuMapper.selectByPrimaryKey(backRoleMenuId);
    }

    @Override
    public int updateByExampleSelective(BackRoleMenu record, BackRoleMenuExample example) {
        return backRoleMenuMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BackRoleMenu record, BackRoleMenuExample example) {
        return backRoleMenuMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(BackRoleMenu record) {
        return backRoleMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BackRoleMenu record) {
        return backRoleMenuMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateRoleMenu(String menuIdList,Long backRoleId) {
        BackRoleMenuExample example = new BackRoleMenuExample();
        example.createCriteria().andBackRoleIdEqualTo(backRoleId);
        backRoleMenuMapper.deleteByExample(example);
        if(!"".equals(menuIdList) && null != menuIdList) {
            String menuIds[] = menuIdList.split(",");
            List<BackRoleMenu> backRoleMenuList = new ArrayList<BackRoleMenu>();
            for(String menuId : menuIds) {
                BackRoleMenu backRoleMenu = new BackRoleMenu();
                backRoleMenu.setBackMenuId(Long.valueOf(menuId));
                backRoleMenu.setBackRoleId(backRoleId);
                backRoleMenuList.add(backRoleMenu);
            }
            return backRoleMenuMapper.addRoleMenu(backRoleMenuList);
        }
        return 1;


    }
}

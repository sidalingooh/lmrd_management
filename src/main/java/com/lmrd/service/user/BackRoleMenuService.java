package com.lmrd.service.user;

import com.lmrd.entity.user.BackRoleMenu;
import com.lmrd.entity.user.BackRoleMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackRoleMenuService {

    long countByExample(BackRoleMenuExample example);

    int deleteByExample(BackRoleMenuExample example);

    int deleteByPrimaryKey(Long backRoleMenuId);

    int insert(BackRoleMenu record);

    int insertSelective(BackRoleMenu record);

    List<BackRoleMenu> selectByExample(BackRoleMenuExample example);

    BackRoleMenu selectByPrimaryKey(Long backRoleMenuId);

    int updateByExampleSelective(@Param("record") BackRoleMenu record, @Param("example") BackRoleMenuExample example);

    int updateByExample(@Param("record") BackRoleMenu record, @Param("example") BackRoleMenuExample example);

    int updateByPrimaryKeySelective(BackRoleMenu record);

    int updateByPrimaryKey(BackRoleMenu record);

    public int updateRoleMenu(String menuIdList, Long backRoleId) ;
}

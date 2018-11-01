package com.lmrd.service.user;

import com.lmrd.entity.user.BackUserRole;
import com.lmrd.entity.user.BackUserRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackUserRoleService {

    long countByExample(BackUserRoleExample example);

    int deleteByExample(BackUserRoleExample example);

    int deleteByPrimaryKey(Long backUserRoleId);

    int insert(BackUserRole record);

    int insertSelective(BackUserRole record);

    List<BackUserRole> selectByExample(BackUserRoleExample example);

    BackUserRole selectByPrimaryKey(Long backUserRoleId);

    int updateByExampleSelective(@Param("record") BackUserRole record, @Param("example") BackUserRoleExample example);

    int updateByExample(@Param("record") BackUserRole record, @Param("example") BackUserRoleExample example);

    int updateByPrimaryKeySelective(BackUserRole record);

    int updateByPrimaryKey(BackUserRole record);
}

package com.lmrd.service.user;

import com.lmrd.entity.user.BackRole;
import com.lmrd.entity.user.BackRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackRoleService {
    long countByExample(BackRoleExample example);

    int deleteByExample(BackRoleExample example);

    int deleteByPrimaryKey(Long backRoleId);

    int insert(BackRole record);

    int insertSelective(BackRole record);

    List<BackRole> selectByExample(BackRoleExample example);

    BackRole selectByPrimaryKey(Long backRoleId);

    int updateByExampleSelective(@Param("record") BackRole record, @Param("example") BackRoleExample example);

    int updateByExample(@Param("record") BackRole record, @Param("example") BackRoleExample example);

    int updateByPrimaryKeySelective(BackRole record);

    int updateByPrimaryKey(BackRole record);
}

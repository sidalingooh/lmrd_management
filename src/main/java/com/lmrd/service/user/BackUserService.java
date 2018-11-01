package com.lmrd.service.user;


import com.lmrd.entity.user.BackUser;
import com.lmrd.entity.user.BackUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackUserService {

    int countByExample(BackUserExample example);

    int deleteByExample(BackUserExample example);

    int deleteByPrimaryKey(Long backUserId);

    int insert(BackUser record);

    int insertSelective(BackUser record);

    List<BackUser> selectByExample(BackUserExample example);

    BackUser selectByPrimaryKey(Long backUserId);

    int updateByExampleSelective(@Param("record") BackUser record, @Param("example") BackUserExample example);

    int updateByExample(@Param("record") BackUser record, @Param("example") BackUserExample example);

    int updateByPrimaryKeySelective(BackUser record);

    int updateByPrimaryKey(BackUser record);

    BackUser selectByUserName(String userName);
}

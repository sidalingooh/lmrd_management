package com.lmrd.service.user;

;
import com.lmrd.entity.user.BackMenu;
import com.lmrd.entity.user.BackMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackMenuService {
    long countByExample(BackMenuExample example);

    int deleteByExample(BackMenuExample example);

    int deleteByPrimaryKey(Long backMenuId);

    int insert(BackMenu record);

    int insertSelective(BackMenu record);

    List<BackMenu> selectByExample(BackMenuExample example);

    BackMenu selectByPrimaryKey(Long backMenuId);

    int updateByExampleSelective(@Param("record") BackMenu record, @Param("example") BackMenuExample example);

    int updateByExample(@Param("record") BackMenu record, @Param("example") BackMenuExample example);

    int updateByPrimaryKeySelective(BackMenu record);

    int updateByPrimaryKey(BackMenu record);

    List<BackMenu> selectByBackUserId(Long backUserId);
}

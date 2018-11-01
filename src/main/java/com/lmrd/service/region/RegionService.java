package com.lmrd.service.region;

import com.alibaba.fastjson.JSONObject;
import com.lmrd.entity.region.LmRegion;
import com.lmrd.entity.region.LmRegionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegionService {

    /**
     *  根据指定的条件获取数据库记录数,lm_region
     *
     * @param example
     */
    long countByExample(LmRegionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lm_region
     *
     * @param example
     */
    int deleteByExample(LmRegionExample example);

    /**
     *  根据主键删除数据库的记录,lm_region
     *
     * @param regionId
     */
    int deleteByPrimaryKey(String regionId);

    /**
     *  新写入数据库记录,lm_region
     *
     * @param record
     */
    int insert(LmRegion record);

    /**
     *  动态字段,写入数据库记录,lm_region
     *
     * @param record
     */
    int insertSelective(LmRegion record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lm_region
     *
     * @param example
     */
    List<LmRegion> selectByExample(LmRegionExample example);

    /**
     *  根据指定主键获取一条数据库记录,lm_region
     *
     * @param regionId
     */
    LmRegion selectByPrimaryKey(String regionId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lm_region
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") LmRegion record, @Param("example") LmRegionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lm_region
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") LmRegion record, @Param("example") LmRegionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lm_region
     *
     * @param record
     */
    int updateByPrimaryKeySelective(LmRegion record);

    /**
     *  根据主键来更新符合条件的数据库记录,lm_region
     *
     * @param record
     */
    int updateByPrimaryKey(LmRegion record);

    List<LmRegion> selectRegionList(JSONObject jsonObject);
}

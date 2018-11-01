package com.lmrd.controller;



import com.lmrd.entity.base.PageData;
import com.lmrd.entity.region.LmRegion;
import com.lmrd.entity.region.LmRegionExample;
import com.lmrd.service.region.RegionService;
import com.lmrd.util.PageUtil;
import com.lmrd.util.tag.PageTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("region")
public class RegionController {
    @Autowired
    private RegionService regionService;


    @ResponseBody
    @RequestMapping(value = "/selectProvince")
    public List selectProvince(String provinceId) {
        LmRegionExample example = new LmRegionExample();
        example.createCriteria().andLevelTypeEqualTo("1");
        List<LmRegion> list = regionService.selectByExample(example);
        return list;
    }

    @RequestMapping(value = "/index")
    public String index(ModelMap map, Integer pageNo, Integer pageSize) {
        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageUtil.startPage(pageNo, pageSize);
        LmRegionExample example = new LmRegionExample();
        example.createCriteria().andLevelTypeEqualTo("1");
        List<LmRegion> list = regionService.selectByExample(example);
        PageData pd = new PageData(list);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        map.addAttribute("pt",pt);
        return "region/index";
    }

    @ResponseBody
    @RequestMapping("/getByRegionCode")
    public List getByRegionCode(String regionId) {
        LmRegionExample example = new LmRegionExample();
        example.createCriteria().andParentIdEqualTo(regionId);
        List<LmRegion> list = regionService.selectByExample(example);
        return list;
    }
}

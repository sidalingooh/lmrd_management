package com.lmrd.util;


import com.alibaba.fastjson.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

public class JsonUtil {

    /**
     * 判断该字符串是否属于Json
     * @param json
     * @return
     */
    public static boolean isGoodJson(String json) {
        boolean flag = false;

        if(StringUtils.isBlank(json)) {
            return false;
        }
        try {
            JSONArray jsonStr= JSONArray.parseArray(json);
            flag =  true;
        } catch (Exception e) {

        } finally {
            return flag;
        }
    }


}

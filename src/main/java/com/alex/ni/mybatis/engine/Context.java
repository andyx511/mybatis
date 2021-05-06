package com.alex.ni.mybatis.engine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AlexNi
 * @Classname Context
 * @Description TODO
 * @Date 2021/5/6 9:36
 */
public class Context {

    private Map<String, Object> resultMap = new HashMap<>();

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }
}

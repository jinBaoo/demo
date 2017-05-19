package com.fm.singleton;

import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * @author moore  Administrator
 * @Date 2017/5/18 0018 下午 5:20
 */
public class Singleton7 {
    private static Map<String,Object> objMap = new HashedMap();

    private Singleton7() {
    }
    public static void  registerService(String key ,Object val) {
        if(!objMap.containsKey(key)) {
            objMap.put(key,val);
        }
    }
    public  static  Object getService(String key) {
        return objMap.get(key);
    }
}

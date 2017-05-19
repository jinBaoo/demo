package com.fm.singleton;

import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/** 单例工厂
 * @author moore  Administrator
 * @Date 2017/5/19 0019 下午 2:18
 */
public class SingletonFactory {
    private static Map<String ,Object> objMap = new HashedMap();

    public static void register(String key,Object value) {
        if(!objMap.containsKey(key)) {
            objMap.put(key,value);
        }
    }
    public static Object get(String key) {
        return objMap.get(key);
    }
}

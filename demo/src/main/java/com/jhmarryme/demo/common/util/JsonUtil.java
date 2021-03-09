package com.jhmarryme.demo.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * 基于Gson的json工具类
 * @author JiaHao Wang
 * @date 2021/2/27 21:59
 */
@Slf4j
public class JsonUtil {

    private static final Gson GSON;

    static {
        GSON = new GsonBuilder().create();
    }

    /**
     * 将对象转为json字符串
     *
     * @param data
     * @return java.lang.String
     * @throws
     */
    public static String objectToJson(Object data) {
        String json = null;
        try {
            json = GSON.toJson(data);
        } catch (Exception e) {
            log.error("序列化对象失败");
        }
        return json;
    }

    /**
     * 将指定类型的对象转为json字符串
     *
     * @param t
     * @param cls
     * @return java.lang.String
     */
    public static <T> String pojoToJson(T t, Class<T> cls) {
        String json = null;
        try {
            json = GSON.toJson(t, cls);
        } catch (Exception e) {
            log.error("序列化对象失败");
        }
        return json;
    }

    /**
     * 将json字符串转为指定类型的实例
     *
     * @param json
     * @param cls
     * @return T
     */
    public static <T> T jsonToPojo(String json, Class<T> cls) {
        T t = null;
        try {
            t = GSON.fromJson(json, cls);
        } catch (Exception e) {
            log.error("反序列化对象失败");
        }
        return t;
    }

    /**
     * 将json转为指定类型的List
     *
     * @param json
     * @return java.util.List<T>
     */
    public static <T> List<T> jsonToList(String json) {
        List<T> list = null;
        try {
            // Gson的TypeToken来确定要反序列化的正确类型
            list = GSON.fromJson(json, new TypeToken<List<T>>() {}.getType());
        } catch (Exception e) {
            log.error("反序列化对象失败");
        }
        return list;
    }

    public static <T> Map<String, T> jsonToMap(String json) {
        Map<String, T> map = null;
        try {
            map = GSON.fromJson(json, new TypeToken<Map<String, T>>() {}.getType());
        } catch (Exception e) {
            log.error("反序列化对象失败");
        }
        return map;
    }

    /**
     * 将json转为Map List
     *
     * @param json
     * @return java.util.List<java.util.Map < java.lang.String, T>>
     */
    public static <T> List<Map<String, T>> jsonToMapList(String json) {
        List<Map<String, T>> list = null;
        try {
            // Gson的TypeToken来确定要反序列化的正确类型
            list = GSON.fromJson(json, new TypeToken<List<Map<String, T>>>() {}.getType());
        } catch (Exception e) {
            log.error("反序列化对象失败");
        }
        return list;
    }

}

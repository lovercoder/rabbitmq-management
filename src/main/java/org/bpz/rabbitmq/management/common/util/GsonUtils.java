package org.bpz.rabbitmq.management.common.util;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * Gson工具类
 */
@Slf4j
public final class GsonUtils {

    private final static Gson GSON = new Gson();

    private GsonUtils() throws IllegalAccessException {
        log.warn("禁止访问GsonUtils私有构造函数");
        throw new IllegalAccessException("禁止访问私有构造函数");
    }

    public static String toJson(Object o){
       return GSON.toJson(o);
    }
    public static <T> T fromJson(String s,Class<T> clazz) {
       return GSON.fromJson(s,clazz);
    }
}

package com.howie.bookstore.util;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description UUID
 * @Date 2019-01-02
 * @Time 12:48
 */
public class UUIDUtils {
    public static String getUUID() {
       return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}

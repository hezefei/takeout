package com.itty.sell.utils;

import java.util.Random;

/**
 * @Auther: hezefei
 * @Date: 2018/10/29 16:29
 * @Description:
 */
public class KeyUtil {
    /**
     * 生成唯一主键
     * 格式：时间+六位随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;//生成六位随机数
        return System.currentTimeMillis() + String.valueOf(number);
    }
}


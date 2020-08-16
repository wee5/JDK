package com.company.jdk.集合.方法演示.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        String key = "weezy";
        String val = "lilwayne";

        /*
        * LinkedHashMap有四个自己的方法：clear(),containsValue(),get(),removeEldestEntry()
        * 其他方法主要继承与HashMap和Map
        * */
        linkedHashMap.get(key);//返回该键对应的值
        linkedHashMap.containsValue(val);//是否包含该值
        linkedHashMap.clear();//移除所有键和值
    }
}

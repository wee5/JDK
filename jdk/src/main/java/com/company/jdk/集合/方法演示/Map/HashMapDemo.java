package com.company.jdk.集合.方法演示.Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<String,String>();
        String key = "weezy";
        String val = "lilwayne";

        //键值相关方法
        hashMap.put(key,val);//关联指定的键和值
        hashMap.get(key);//返回和键关联的值，若不存在该键，则返回null
        hashMap.remove(key);//若存在，则移除键和值
        hashMap.containsKey(key);//是否包含该键
        hashMap.containsValue(val);//是否包含该值

        // 集合相关方法
        hashMap.clear();//移除所有映射关系
        hashMap.isEmpty();//是否为空
        hashMap.size();//返回关联的键和值的数量
        hashMap.values();//返回此映射所包含的值的 Collection 视图
    }
}

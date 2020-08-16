package com.company.jdk.集合.方法演示.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        String str = "weezy";
        int index = 0;

        //元素相关方法
        hashSet.add(str);//若集合中没有该元素，则添加该元素
        hashSet.contains(str);//是否包含该元素
        hashSet.remove(str);//若集合存在改元素，则移除该元素

        //集合相关方法
        hashSet.clear();//移除所有元素
        hashSet.isEmpty();//集合是否为空
        hashSet.size();//返回元素数量
        hashSet.iterator();
    }
}

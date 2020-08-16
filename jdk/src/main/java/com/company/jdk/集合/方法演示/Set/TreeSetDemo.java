package com.company.jdk.集合.方法演示.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        String str = "weezy";
        int index = 0;


        //元素相关方法
        treeSet.add(str);//若集合中不存在该元素，则添加该元素
        treeSet.remove(str);//若集合中存在该元素，则移除该元素
        treeSet.contains(str);//是否包含该元素

        //集合相关方法
        treeSet.clear();//移除所有元素
        treeSet.isEmpty();//是否为空
        treeSet.size();//返回元素数量
        treeSet.iterator();
    }
}

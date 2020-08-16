package com.company.jdk.集合.方法演示.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        String key = "weezy";
        String val = "lilwayne";

        treeMap.get(key);
        treeMap.put(key,val);
        treeMap.remove(key);
        treeMap.remove(val);
        treeMap.clear();
        treeMap.containsKey(key);
        treeMap.containsValue(val);

    }
}

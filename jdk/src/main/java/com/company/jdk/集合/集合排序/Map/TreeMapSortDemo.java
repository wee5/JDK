package com.company.jdk.集合.集合排序.Map;

import java.util.*;

/*
* Map的实现类中只有TreeMap可以排序
* */
public class TreeMapSortDemo {
    public static void main(String[] args) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String obj1, String obj2) {
                return obj2.compareTo(obj1);// 这里是降序排序
            }
        };

        Map<String, Object> map = new TreeMap<String, Object>(comparator);

        map.put("2019-03", "ccccc");
        map.put("2018-12", "aaaaa");
        map.put("2019-01", "bbbbb");
        map.put("2019-02", "ddddd");

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();

        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }
    }
}

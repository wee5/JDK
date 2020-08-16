package com.company.jdk.集合.方法演示.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String str = "weezy";
        int index = 0;
        
        //关于元素的方法
        arrayList.add(str);//添加元素
        arrayList.add(index,str);//在指定位置添加元素
        arrayList.contains(str);//是否包含该元素
        arrayList.get(index);//返回指定位置的元素
        arrayList.remove(index);//移除指定位置的元素
        arrayList.set(index,str);//用该元素替换指定位置的元素
        //关于集合的方法
        arrayList.indexOf(str);//返回该元素的索引，若集合不包含该元素，返回-1
        arrayList.clear();//移除所有元素
        arrayList.isEmpty();//是否为空（不包含任何元素）
        arrayList.size();//返回元素数量
        arrayList.toArray();//按适当顺序（从第一到最后一个）返回包含所有元素的数组
        


    }
}

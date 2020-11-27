package com.company.jdk.集合.集合框架;

/*
* List：允许元素重复，元素有序
*
*   ArrayList：查询快，增删慢；非线程安全，允许由null元素
*
*   LinkedList：增删快，查询慢，非线程安全；允许有null元素
* 
*   Vector：线程安全的，通过synchronized实现，但效率低
*
* Set：不允许元素重复，元素无序
*
*   HashSet：不允许元素重复，元素无序，允许有一个null元素
*
*   LinkedHashSet：
*
*   TreeSet：可以实现排序功能
*
* Map：键值对
* 
*   HashMap:
*
*   LinkedHashMap:
*
*   TreeMap:
*
*   ConcurrentHashMap:
*
* 为什么ArrayList（按下标）查找比LinkedList快？
*   ArrayList按下标查找的时间复杂度时O(1)：由首地址+偏移量直接获得
*   LinkedList查找的时间复杂度时O(n)：由Node.next执行n次获得（实际会更快，因为当n>size/2时，会从后往前查询）
*
* */
public class Demo {
}

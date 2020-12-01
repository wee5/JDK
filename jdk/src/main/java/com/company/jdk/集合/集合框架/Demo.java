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
*   HashMap：非线程安全；元素无序；允许key/value为null，但是key只能有一个null
*
*   LinkedHashMap：非线程安全；元素有序；允许key/value为null，但是key只能有一个null；value重复会被覆盖
*
*   TreeMap：
*
*   ConcurrentHashMap：
*
* 使集合线程安全的方法
*   通过Collections.synchronizedList()等方法，原理是封装原方法，并主动加synchronized关键字修饰
*
* 为什么ArrayList（按下标）查找比LinkedList快？
*   ArrayList按下标查找的时间复杂度时O(1)：由首地址+偏移量直接获得
*   LinkedList查找的时间复杂度时O(n)：由Node.next执行n次获得（实际会更快，因为当n>size/2时，会从后往前查询）
*
* 什么是HashMap？
*   采用数组加链表的结构，结点类型为HashMap.Node
* 什么是LinkedHashMap？
*   双向循环链表结构，结点类型为LinkedHashMap.Entry
*   用HashMap来维护数据结构,用LinkList维护数据插入的顺序.
*
* 为什么HashMap是元素无序的？
*   HashMap用数组存储，但存储位置由哈希值决定
*
* Map及其实现类中表示结点的类的关系
*   顶级接口Map.Entry，定义了存取值和比较的基本操作
*   HashMap.Entry实现Map.Entry，包含键，值，hash和一个指向下一个结点的自身类
*   HashMap.Node继承Map.Entry，表示HashMap的结点
*   LinkedHashMap.Entry继承HashMap.Node，表示LinkedHashMap的结点
*
* */
public class Demo {
}

package com.company.jdk.集合.其他内容;

/*
* Entry
* */
public class EntryDemo {
    public static void main(String [] args){
        /*
        * Entry<K,V>:不同于Entry<T>
        *
        * 表示逻辑上的一个节点，用来构成单向链表
        * 包含属性：int hash;final K key;V value;Entry<K,V> next
        * 对应逻辑上节点包含的信息：hash值，键，值，指向下一个节点的指针
        *
        * LinkedHashMap中包含Entry before，Entry after
        * */
    }
}

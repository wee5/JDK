package com.company.jdk.集合.List实现类的同步;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 
* 测试目的：证明集合同步，但是这个证明方法不好
*
* ArrayList和LinkedList可以通过该方法实现线程同步
* Vector本身是线程安全的
* 其他集合通过在外部调用方法中，对集合获取锁操作，来实现线程同步
*
* */
public class ListDemo {
    public static void main(String[] args) {
        List<String> synArrayList = Collections.synchronizedList(new ArrayList<String>());
    }
}

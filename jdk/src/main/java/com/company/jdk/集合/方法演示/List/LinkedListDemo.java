package com.company.jdk.集合.方法演示.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        String str = "weezy";
        int index = 0;

        //集合相关的方法
        linkedList.add(str);//将该元素添加到列表结尾
        linkedList.add(index,str);//指定位置插入该元素
        linkedList.addFirst(str);//将该元素添加到列表开头
        linkedList.addLast(str);//将该元素添加到列表结尾
        linkedList.contains(str);//是否包含该元素
        linkedList.element();//返回头元素
        linkedList.get(index);//返回指定位置的元素
        linkedList.getFirst();//返回头元素
        linkedList.getLast();//返回尾元素
        linkedList.indexOf(str);//返回该元素首次出现的索引，若不存在，则返回-1
        linkedList.lastIndexOf(str);//返回该元素最后出现的索引，若不存在，则返回-1
        linkedList.peek();//返回头元素
        linkedList.poll();//返回并移除头元素
        linkedList.pop();//从此列表所表示的堆栈处弹出一个元素
        linkedList.push(str);//将元素推入此列表所表示的堆栈
        linkedList.remove();//返回并移除头元素
        linkedList.remove(index);//移除指定位置的元素
        linkedList.set(index,str);//将指定位置的元素替换为指定的元素

        //元素相关的方法
        linkedList.clear();//移除所有元素
        linkedList.size();//返回元素数
        linkedList.toArray();//返回以适当顺序（从第一个元素到最后一个元素）包含此列表中所有元素的数组
    }
}

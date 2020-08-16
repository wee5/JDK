package com.company.jdk.集合.重写equals和hashcode方法.不重写的后果;

import java.util.HashSet;

/*
* 测试目的：证明HashSet和HashMap必须重写equals和hashCode方法，才能保证HashSet元素不重复的特性；
*
* 什么才是"元素不重复"？  当两个对象的所有属性都相同时，主观认为两个对象是重复的；这是HashSet需要保证的要求
* 计算机如何判断"对象是否重复"？  通过判断对象的hashCode是否一致来判断对象是否相同
*
* 不重写equals和hashCode方法的后果：会出现属性完全相同但hashCode不同的对象，主观认为两对象相同，计算机认为两对象不同
* 下面演示这种错误情况（第二个对象原本添加到HashSet应该是失败的，但是却成功了）
* */
public class NonDemo {
    public static void main(String[] args) {
        Man weezy = new Man("weezy", 38);
        Man riri = new Man("weezy", 38);
        HashSet<Man> men = new HashSet<>();
        System.out.println(men.add(weezy));
        System.out.println(men.add(riri));
    }
    static class Man{
        String name;
        int age;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //未重写equals和hashCode方法
    }
}

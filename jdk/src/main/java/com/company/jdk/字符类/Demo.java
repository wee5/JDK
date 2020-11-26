package com.company.jdk.字符类;

public class Demo {
    public static void main(String[] args) {

        /*
        * 长度可变
        *   StringBuffer和StringBuilder都是长度可变的字符串对象
        *   String指向常量池，被final修饰，长度不可变
        *
        * 线程安全
        *   String和StringBuffer是线程安全的，String被final修饰，是不可变的，StringBuffer的大部分方法都有synchronized修饰；
        *   StringBuilder是线程不安全的
        *
        * */
        String weezy = "weezy";
        StringBuffer riri = new StringBuffer("riri");
        StringBuilder fit = new StringBuilder("fit");
        
        //字符串追加
        StringBuffer ririAppend = riri.append(weezy);
        System.out.println(ririAppend.toString());
        StringBuilder fitAppend = fit.append(weezy);
        System.out.println(fitAppend.toString());
    }
}

package com.company.jdk.内部类.四种内部类.局部内部类;

/*
* 局部内部类：定义在一个方法或作用域中的类
*
* 访问权限
*   该类访问权限仅限于方法或作用域内
*   该类不能用public，protected，private，static修饰
*
* */
public class Demo {

    private String name;
    private int age;
    private static int num;

    public Demo(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void method(){

        class Man{
            String name;

            public Man(String name) {
                this.name = name;
            }
            public void method(){
                int i = age;
            }
        }
        System.out.println("上面是一个局部内部类");
    }
}

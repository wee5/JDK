package com.company.jdk.内部类.四种内部类.静态内部类;

/*
* 静态内部类
*
* 静态内部类是不需要依赖于外部类的
* 不能使用外部类的非static成员变量或者方法
*
* */
public class Demo1 {
    private String name;

    public Demo1(String name) {
        this.name = name;
    }

    static public class StaticInner{
        private String name;

        public StaticInner(String name) {
            this.name = name;
        }

        public void method(){
            System.out.println("静态内部类方法");
        }
    }
}

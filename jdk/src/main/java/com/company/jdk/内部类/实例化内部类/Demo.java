package com.company.jdk.内部类.实例化内部类;

import com.company.jdk.内部类.四种内部类.成员内部类.Outer;
import com.company.jdk.内部类.四种内部类.静态内部类.Demo1;

import java.util.Comparator;

/*
* 实例化内部类
* */
public class Demo {
    public static void main(String [] args){

        //成员内部类:内部类依赖外部类
        Outer outer = new Outer("weezy", 8);
        Outer.Inner weezy = outer.new Inner("weezy");

        //静态内部类:因为该类和所实例化的类不在同一个包下，所以对静态内部类修饰public
        Demo1.StaticInner riri = new Demo1.StaticInner("riri");
        riri.method();


        /*
        * 局部内部类，不能用访问修饰符，并且访问权限只在方法或作用域中
        * 所以在该类中不能实例化，只能在被定义时所在的方法或作用域中实例化
        * */

        //匿名内部类:使用时即实例化
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //todo
                return 0;
            }
        };
    }
}

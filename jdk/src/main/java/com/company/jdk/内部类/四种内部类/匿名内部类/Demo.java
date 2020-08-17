package com.company.jdk.内部类.四种内部类.匿名内部类;

import java.util.Collections;
import java.util.Comparator;

/*
* 匿名内部类：最常用的内部类，编写事件监听的代码时使用匿名内部类不但方便，而且使代码更加容易维护
*
* 访问权限
*   不能有访问修饰符和 static 修饰符
* */
public class Demo {
    public static void main(String [] args){
        //匿名内部类实现Comparator接口，并重写了compare方法
        Collections.sort(null,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                //todo
                return 0;
            }
        });
    }
}

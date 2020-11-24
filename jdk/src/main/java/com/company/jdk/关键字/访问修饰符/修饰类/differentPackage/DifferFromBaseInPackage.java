package com.company.访问修饰符.修饰类.differentPackage;

import com.company.访问修饰符.修饰类.basePackage.PublicBase;

/*
* 修饰类的访问修饰符主要是public和默认的
* */
public class DifferFromBaseInPackage {
    public static void main(String[] args) {
        //只能访问public类
        PublicBase publicBase = new PublicBase();
    }
}

/*
* 继承Base类的子类不知道改怎么定义
* */

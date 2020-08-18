package com.company.jdk.类加载.类加载顺序;

/*
* 类加载和初始化的区别
*   类加载不会执行构造方法，类初始化会执行构造方法
*   类加载的第一步是加载方法，但不执行方法
*
* 加载顺序（以子类为当前类，包含父类，静态成员，复杂类型）
* 实例化过程
*   加载
*       父类静态属性赋值
*       父类静态代码块
*       子类静态属性赋值
*       子类静态代码块
*   初始化
*       父类非静态属性赋值
*       父类非静态代码块
*       父类构造函数
*       子类非静态属性赋值
*       子类非静态代码块
*       子类构造函数
* 执行主方法过程
*   父类静态属性赋值
*   父类静态代码块
*   子类静态属性赋值
*   子类静态代码块
*   主方法
*
*包含内部类的类加载顺序暂时没有看
*
* */
public class Demo extends Father{
    String name;
    Color color;
    static int age = 11;
    static Color staticColor = new Color("red");

    public Demo(int height, Color color, String name, Color color1) {
        super(height, color);
        this.name = name;
        this.color = color1;
        System.out.println("构造函数");
    }

/*    public Demo(String name, Color color) {
        this.name = name;
        this.color = color;
        System.out.println("构造函数");
    }*/

    {
        System.out.println("非静态代码块");
        System.out.println(name);
        System.out.println(color);
    }
    static {
        System.out.println("静态代码块");
        System.out.println(age);
    }
    
    public static void main(String [] args){
        System.out.println("主方法");
    }
    
    static void method1(){
        System.out.println("静态方法");
    }
    void method2(){
        System.out.println("非静态方法");
    }

}
class Demo1 {
    public static void main(String[] args) {
        Demo demo = new Demo(170, new Color("black"),"weezy",new Color("green"));
    }
}
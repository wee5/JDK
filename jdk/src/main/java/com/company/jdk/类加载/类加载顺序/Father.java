package com.company.jdk.类加载.类加载顺序;

public class Father {
    int height = 999;
    Color color = new Color("pink");
    static int weight = 100;
    static Color staticColor = new Color("yellow");

    public Father(int height, Color color) {
        System.out.println("父类构造函数");
        this.height = height;
        this.color = color;
    }

    {
        System.out.println("父类非静态代码块");
        System.out.println(height);
        System.out.println(color);
    }
    static {
        System.out.println("父类静态代码块");
    }

    public static void main(String [] args){
        System.out.println("父类主方法");
    }

    static void method1(){
        System.out.println("父类静态方法");
    }
    void method2(){
        System.out.println("父类非静态方法");
    }
}

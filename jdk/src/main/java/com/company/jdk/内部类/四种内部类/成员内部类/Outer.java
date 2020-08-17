package com.company.jdk.内部类.四种内部类.成员内部类;

/*
* 成员内部类
*
* 内部类中两个易混淆概念：访问权限，外部类和内部类的相互访问
*
* 访问权限:指不同包或不同类中是否可以实例化某一个类;用public,protected,default,private控制类的访问权限
*   public:则任何地方都能访问
*   protected:则只能在同一个包下或者继承外部类的情况下访问
*   默认访问权限:则只能在同一个包下访问
*   private:则只能在外部类的内部访问
*
* 外部类和内部类的相互访问:指外(内)部类是否可以访问内(外)部类的成员
*   内部类访问外部类成员:内部类内部可以直接访问外部类的所有属性和方法：包括私有的，静态的
*   外部类访问内部类成员:外部类需要实例化内部类，来访问内部类成员
*
* */
public class Outer {
    private String name;
    private int count;
    static private int age=10;

    public Outer(String name,int count) {
        this.name = name;
        this.count = count;
    }

    public void scream(){
        System.out.println("这是外部类Inner的scream方法");
    }
    
    public void userInner(){
        Inner inner = new Inner("inner");
        System.out.println("在外部类Outer中使用内部类Inner");
    }

    //成员内部类
    public class Inner{

        private String name;

        public Inner(String name) {
            this.name = name;
        }

        public void say(){
            System.out.println("这是成员内部类Inner的say方法");
            System.out.println("访问外部类的私有属性count="+count);
            System.out.println("访问外部类的静态属性age="+age);
            System.out.println("访问外部类同名属性Outer.name="+Outer.this.name);
            System.out.println("访问外部类的方法————");
            scream();
        }
        
        public void scream(){
            System.out.println("这是和外部类Inner同名的内部类scream方法");
        }
    }
}

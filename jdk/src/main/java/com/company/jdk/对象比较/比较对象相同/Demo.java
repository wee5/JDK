package com.company.jdk.对象比较.比较对象相同;

/*
* ==，equals，hashCode的关系
*
* ==:比较对象的地址
* equals():是Object的方法，原生实现是用==比较地址；大部分类都重写了equals()
* hashCode():返回对象的hashCode值
*   有些地方会比较对象的hashCode值来判断对象是否相同（比如Set，Map），
*   为了保证主观上和计算机视角同时认为对象相等，在重写了equals()方法时，需要同时重写hashCode()方法
*
* 重写hashCode方法的原则
*   同一个对象多次调用hashCode()方法应该返回相同的值
*   当两个对象通过equals()方法比较返回true时，这两个对象的hashCode()应该返回相等的（int）值
*   对象中用作equals()方法比较标准的Filed(成员变量（类属性）)，都应该用来计算hashCode值
* 一个简单的重写hashCode()的方法
*   利用Lambok的注解，排除不想对比和关联的属性
*   @Data
*   @EqualsAndHashCode(exclude = {"score","time"})
*
*
* 常用类的equals()方法
*   Object的equals方法，逻辑为用==比较
*   基本类型没有equals方法，直接用==比较；
*   包装类重写了equals()，逻辑为比较其值，而不是地址
*   String重写了equals()方法（比较是将String当做对象看）
*       逻辑为：地址相同，或地址不同但char[]相同，则返回true
*       当出现直接用字符串赋值String时，相同的字符串永远表示同一个对象（即地址相同）
*   StringBuffer没有重写equals()，使用父类的equals()，即比较地址
*
* 常用类的hashCode()方法
*   Object的hashCode()方法没有方法体，但是可以返回不同的hashCode（方法被native修饰)
*   基本类型没有equals()方法
*   包装类和String重写了hashCode()方法
*   StringBuffer没有重写hashCode()方法
*
* */
public class Demo {

}

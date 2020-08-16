package com.company.jdk.集合.重写equals和hashcode方法.重写的方式;

import java.util.HashSet;
import java.util.Objects;

/*
* HashSet实际上是一个HashMap，包含一个HashMap变量
* HashMap比较键是否相同的逻辑是：
*   先比较键的hashCode，若hashCode相同，再用equals比较属性是否相同
*   hashCode不同，或hashCode相同但属性不同，都视为键不同，即键不重复
*
* 所以需要同时重写equals和hashCode方法，来保证HashSet和HashMap的元素不重复特点
* 下面演示如何重写equals和hashCode方法
*
* */
public class Demo {
    public static void main(String[] args) {
        Man weezy = new Man("weezy", 38);
        Man riri = new Man("weezy", 38);
        HashSet<Man> men = new HashSet<>();
        System.out.println(men.add(weezy));
        System.out.println(men.add(riri));
    }
    static class Man{
        String name;
        int age;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //重写equals和hashCode方法
        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;
            Man man = (Man) obj;
            return name.equals(man.name) && age == man.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name,age);
        }
    }
}

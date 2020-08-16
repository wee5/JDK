package com.company.jdk.对象比较.比较对象大小.实现Comparator;

import java.util.Comparator;

/*
* 自定义比较器，即实现Comparator接口
* */
public class Demo {
    public static void main(String [] args){
        Tree ming = new Tree("ming", 23);
        Tree ning = new Tree("ning", 45);
        CustomComparator customComparator = new CustomComparator();
        System.out.println(customComparator.compare(ming,ning));
    }

    static class CustomComparator implements Comparator<Tree>{

        @Override
        public int compare(Tree o1, Tree o2) {
            if(o1 instanceof Tree && o2 instanceof Tree){
                Tree tree1 = (Tree)o1;
                Tree tree2 = (Tree)o2;
                return tree1.name.compareTo(tree2.name);
            }
            throw new ClassCastException("不能转换Tree类型");
        }
    }

    static class Tree{
        private String name;
        private int age;

        public Tree(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

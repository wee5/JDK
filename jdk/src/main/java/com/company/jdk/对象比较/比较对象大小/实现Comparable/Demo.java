package com.company.jdk.对象比较.比较对象大小.实现Comparable;

/*
* 两种方式
*   需要比较的类实现Comparable接口，并重写compareTo()方法，自定义比较的方式
*   自定义比较器类实现Comparator，并重写compare(T,T)方法，自定义比较的方式;用比较器比较两个类的大小
*
* String重写compareTo()
*   逻辑为依次比较字符，返回第一对不相同字符的差
*   若知道较短字符串比较完所有字符，和被比较字符串都相同
*
* 这里演示第一种方式：被比较类实现Comparable接口
*
* */
public class Demo {
    public static void main(String [] args){

        Animal dog = new Animal("dog", 3);
        Animal cat = new Animal("cat", 2);
        System.out.println(dog.compareTo(cat));
    }

    static class Animal implements Comparable{
        private String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Object o) {
            if(o instanceof Animal){
                Animal animal = (Animal) o;
                return name.compareTo(animal.name);//按照Animal.name比较
            }
            throw new ClassCastException("不能转换为Animal类型");
        }
    }
}

package com.company.jdk.集合.集合排序.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* List的自定义排序方式：通过内部类的形式，创建Comparator比较器，并重写compare方法（自定义排序方式）
*
* 两种方式的排序原理相同：通过比较两个对象的属性给对象排序，返回值都是int类型，决定对象的顺序（大小）
*   属性比较：基本类型可以直接减法运算；复杂类型需要重写compareTo()方法，用该方法比较属性顺序
*
* 自然排序和自定义排序的区别：
*   自然排序耦合度高，每个类都需要重写比较方式，并且该比较方式和类耦合
*   自定义排序耦合度低，排序方式在比较器中重写，再指定集合和比较器来实现对集合的排序
*
* */
public class ListCustomSortDemo {
    public static void main(String [] args){

        //内部类Comparator；重写了compare方法
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Food && o2 instanceof Food){
                    Food f1 = (Food) o1;
                    Food f2 = (Food) o2;
                    return f1.getPrice() - f2.getPrice();
                }
                throw new ClassCastException("不能转换为Food类型");
            }
        };

        ArrayList<Food> foods = new ArrayList<Food>();
        foods.add(new Food("fish",2));
        foods.add(new Food("rice",1));
        foods.add(new Food("beef",3));

        Collections.sort(foods,comparator);

        for(Food f : foods){
            System.out.println(f.toString());
        }
    }

    static class Food{
        private String name;
        private int price;

        public Food(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Food{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

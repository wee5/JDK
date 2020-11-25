package com.company.jdk.集合.集合排序.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
* List的自然排序方式：通过Collections.sort(List)，List的元素类型需要实现Compareble接口，并重写compareTo方法
* */
public class ListDefaultSortDemo {
    public static void main(String [] args){
        List<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball("basketball",32));
        balls.add(new Ball("football",22));
        balls.add(new Ball("baseball",12));
        Collections.sort(balls);
        for(Ball ball : balls){
            System.out.println(ball.toString());
        }
    }
    static class Ball implements Comparable{
        private String name;
        private int weight;

        public Ball(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Ball() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            if(o instanceof Ball){
                Ball ball = (Ball) o;
                //return weight - ((Ball) o).getWeight();//按weight增序排序
                return name.compareTo(((Ball) o).getName());//按name增序排序
            }
            throw new ClassCastException("不能转换为Ball类型");
        }
    }
}

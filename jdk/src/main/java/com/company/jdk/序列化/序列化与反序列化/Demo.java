package com.company.jdk.序列化.序列化与反序列化;

import com.company.jdk.序列化.序列化的三种方式.Apple;

import java.io.*;

public class Demo {
    public static void main(String[] args)  throws IOException, ClassNotFoundException{

        /* 对仅实现Serializable的对象，序列化和反序列化方法如下；其他两种序列化方法在该类中实现 */
        //序列化
        FileOutputStream fileOutputStream = new FileOutputStream("object.out");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Apple("red",2));
        objectOutputStream.flush();
        objectOutputStream.close();

        //反序列化
        FileInputStream fileInputStream = new FileInputStream("object.out");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Apple apple = (Apple) objectInputStream.readObject();
        System.out.println(apple.toString());
    }
}
/*
* 证明serialVersionUID作用的方式：
*   在Apple类中不设置serialVersionUID
*   将上面序列化过程注释掉
*   执行main方法，会报错invalidClassException
* */
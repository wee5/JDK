package com.company.jdk.序列化.序列化的三种方式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.IOException;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Banana implements Serializable {

    private static final long serialVersionUID = 5757066510215332014L;
    private String color;
    private double weight;

    //自定义序列化和反序列化方法
    private void writeObject(java.io.ObjectOutputStream out) throws IOException{
        //todo
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{
        //todo
    }
}

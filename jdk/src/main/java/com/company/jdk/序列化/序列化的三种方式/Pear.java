package com.company.jdk.序列化.序列化的三种方式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pear implements Externalizable {

    private static final long serialVersionUID = -6021677560219925483L;
    private String color;
    private double weight;

    //重写序列化和反序列化方法
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //todo
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //todo
    }
}

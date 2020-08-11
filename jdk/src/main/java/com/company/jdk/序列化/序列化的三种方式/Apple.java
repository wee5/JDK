package com.company.jdk.序列化.序列化的三种方式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Apple implements Serializable {


    private static final long serialVersionUID = -3617458834465791655L;
    private String color;
    private double weight;

}

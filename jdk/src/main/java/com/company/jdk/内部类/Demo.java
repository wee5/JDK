package com.company.jdk.内部类;

import com.company.jdk.内部类.四种内部类.成员内部类.Outer;

public class Demo {

    public static void main(String [] args){
        Outer outer = new Outer("weezy", 8);
        Outer.Inner weezy = outer.new Inner("weezy");
    }
}

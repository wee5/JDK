package com.company.访问修饰符.修饰成员.differentPackge;

import com.company.访问修饰符.修饰成员.basePackage.Base;

public class DifferFromBaseInPackage {
    public static void main(String[] args) {
        Base base = new Base();
        //不同包下，只能访问public成员
        String publicField = base.publicField;
    }
}

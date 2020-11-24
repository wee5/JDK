package com.company.访问修饰符.修饰成员.basePackage;

public class SamePackageWithBase {
    public static void main(String[] args) {
        Base base = new Base();
        String publicField = base.publicField;
        String protectedField = base.protectedField;
        String defaultField = base.defaultField;
        //相同包下，不能访问到private成员
    }
}

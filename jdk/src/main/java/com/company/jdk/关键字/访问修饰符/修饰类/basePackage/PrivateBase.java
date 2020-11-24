package com.company.访问修饰符.修饰类.basePackage;

/*
* private和protected只能修饰内部类
* */
public class PrivateBase {
    public void method() {
        PublicBase publicBase = new PublicBase();
        ProtectedBase.ProtectedBaseClass protectedBaseClass = new ProtectedBase.ProtectedBaseClass();
        DefaultBase defaultBase = new DefaultBase();
        //可以访问private类
        PrivateBaseClass privateBaseClass = new PrivateBaseClass();
    }
    private static class PrivateBaseClass{

    }
}

package com.company.访问修饰符.修饰成员.differentPackge;

import com.company.访问修饰符.修饰成员.basePackage.Base;

public class SubClassOfBase extends Base{

    public void method(){
        //子类在 任何包 下，都可以访问父类的protected成员
        String protectedField = super.protectedField;
    }
    public static void main(String[] args) {
        Base base = new Base();
        String publicField = base.publicField;
    }
}

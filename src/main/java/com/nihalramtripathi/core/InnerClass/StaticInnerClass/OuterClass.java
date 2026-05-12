package com.nihalramtripathi.core.InnerClass.StaticInnerClass;

public class OuterClass {

    static int value=10;
     int value2=10;

    private static class InnerClass{
        void defaultMethod(){
        value=20;
        }
    }

    void display(){
        InnerClass innerClass =new InnerClass();
        innerClass.defaultMethod();
    }
}

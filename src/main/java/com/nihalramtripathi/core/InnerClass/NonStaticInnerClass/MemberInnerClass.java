package com.nihalramtripathi.core.InnerClass.NonStaticInnerClass;

public class MemberInnerClass {

    int value=11;

    public class MemberInner{

        void print(){
            value=12;
        }
    }
}

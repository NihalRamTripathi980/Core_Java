package com.nihalramtripathi.core.InnerClass.NonStaticInnerClass;

public class MAIN {

    public static void main(String[] args) {
        // Member Inner Class
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.MemberInner inner = memberInnerClass.new MemberInner();
    }
}

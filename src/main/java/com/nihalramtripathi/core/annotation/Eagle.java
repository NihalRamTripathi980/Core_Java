package com.nihalramtripathi.core.annotation;

@MyCustomAnnotation(name = "Bird",size = 22)
public class Eagle {
    @Deprecated(since = "Deprecated since my learning guys")
    void flyHigh(){
        System.out.println("Eagle can fly high");
    }
}



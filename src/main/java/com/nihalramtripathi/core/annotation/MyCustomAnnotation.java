package com.nihalramtripathi.core.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MyCustomAnnotation {

    String name();
    int size() default 21;
}

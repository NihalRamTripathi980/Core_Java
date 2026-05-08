package com.nihalramtripathi.core.Constructor;

public class PrivateConstructor {

    private PrivateConstructor(){

    }

    public  static  PrivateConstructor getInstance(){
        return new PrivateConstructor();
    }
}



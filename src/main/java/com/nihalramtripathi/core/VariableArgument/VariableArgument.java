package com.nihalramtripathi.core.VariableArgument;

public class VariableArgument {

    void sum(int...var){
        int output =0;
        for(int e:var){
            output=output+e;
        }
        System.out.println("Sum:"+output);
    }
}

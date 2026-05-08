package com.nihalramtripathi.core.Constructor;

public class ContructorChainning {
    String name;
    int empId;

    ContructorChainning(){
        this(10);
    }
    ContructorChainning(int empId){
        this("Nihal",empId);
    }

    ContructorChainning(String name,int empId){
       this.name=name;
       this.empId=empId;
    }
}


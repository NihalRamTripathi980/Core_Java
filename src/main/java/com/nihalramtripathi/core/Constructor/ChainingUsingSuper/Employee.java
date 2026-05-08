package com.nihalramtripathi.core.Constructor.ChainingUsingSuper;

public class Employee extends  Person{
    int age;
    Employee(int age,int emplID){
        super(emplID);
        this.age=age;
    }
}

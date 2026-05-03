package com.nihalramtripathi.core.variable;

public class ReferenceVariable {

    /*
    * Kinds of Variables
    * 1. Local
    * 2. Instance / Member
    * 3. Static/Class Variable
    * 4. Method parameter
    * 5. Constructor Parameters
    * */


    int memberVariable =10;
    static int classVariable =11;
    public static void main(String[] args) {

    }

    // Constructor Parameter
    ReferenceVariable(int a){

    }

    // Method Parameter
    int dummyMethod (int a , int b){
        byte localVariable = 12; // Local Variable
        return  localVariable+a+b;
    }
}

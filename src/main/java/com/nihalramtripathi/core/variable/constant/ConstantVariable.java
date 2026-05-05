package com.nihalramtripathi.core.variable.constant;

public class ConstantVariable {

    final static int STUDENT_ID=10;
    final String studentName;
    //studentName="Nihal";

    ConstantVariable() {
        studentName = "Nihal"; // ✅ valid
    }

    // final vs Constant
    // 1. if only final then the variable is member variable not Class variable if Constant (static final) then it is class variable , not needed object creation of Class


    static void getStudentId(){
         int value=1;
    }
    void updateName(){
       // studentName="Mukesh"; Not possible
    }
}

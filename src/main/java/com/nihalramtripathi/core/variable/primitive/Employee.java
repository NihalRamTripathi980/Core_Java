package com.nihalramtripathi.core.variable.primitive;

public class Employee {


    public static void main(String[] args) {
        float val1= .3f;
        float val2= .1f;
        float val3= val1 -val2;
        System.out.println(val3);
        float val4=.7f;
        System.out.println((double) val4);

        // 1.  Widening /Automatic Conversion example
        int varInt =10;
        long varLong = varInt;
        System.out.println(varLong);

        // Example 2
        byte byteVar=10;
        int intVar =byteVar;
        System.out.println(intVar);

        // Automatic conversion happen when you goes down to up like( byte = 1byte and int = 4byte , byte->int and int-> long(8 bytes )

        // 2. Downcasting/ Narrowing Conversion

        int intVariable =12;
        byte byteVariable =(byte) intVariable;

        // 3. Promotion duration expression

        int a =17;
        double doubleVariable = 12d;
        double sum = a+doubleVariable; // Promotion to double

        // 4. Explicit Casting during expression

        int sum2 = (int)(a+doubleVariable);


    }
}

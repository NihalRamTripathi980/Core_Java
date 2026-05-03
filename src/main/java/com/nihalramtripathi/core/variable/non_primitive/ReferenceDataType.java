package com.nihalramtripathi.core.variable.non_primitive;

public class ReferenceDataType {



    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";  // s2 reference point to String constant Pool with Same value "Hello" which is s1 pointing means String is immutable

        // Example
        System.out.println(s1==s2); // Checking Address
        System.out.println(s1.equals(s2)); // Checking value

        String s3 = new String("Hello"); // Means Here is i am creating an object in Heap not String Constant Pool
        String s4 = new String("Hello");

        // Example
        System.out.println(s3==s4); // Checking Address /Memory
        System.out.println(s3.equals(s4)); // Checking value


    }

}

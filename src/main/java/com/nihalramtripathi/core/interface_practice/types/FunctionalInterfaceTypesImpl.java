package com.nihalramtripathi.core.interface_practice.types;

public class FunctionalInterfaceTypesImpl {

    // Functional Programmer Types practice
    public static void main(String[] args) {

        // Consumer
        Consumer<Integer> consumer = (Integer value)->{
            if(value>10){
                System.out.println("Consumer is consumed: "+value);
            }
        };
        consumer.accept(11);

        // Supplier
        Supplier<String> supplier = ()->{
           return "Supplier is working and supplied the value of name" ;
        };
        System.out.println(supplier.get());

        // Function
        Function<Integer,String> function =(Integer value)->{
            String output =value.toString();
            return output;
        };
        System.out.println("Function output is:"+function.apply(64));

        // Predicate
        Predicate<Integer> isEven =(Integer value)->{
            return value % 2 == 0;
        };

          System.out.println("IsEven value ->"+isEven.test(64));
    }
}

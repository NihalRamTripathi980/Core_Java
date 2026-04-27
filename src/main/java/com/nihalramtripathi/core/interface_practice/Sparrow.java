package com.nihalramtripathi.core.interface_practice;

public class Sparrow implements BirdFunctionalInterface{
    @Override
    public void canFly() {
        System.out.println("Yes Sparrow can fly");
    }

    public static class FunctionInterfaceImpl {


        public static void main(String[] args) {

            // Different ways to implement the functional Interface
            //  1 Way to implement
            Sparrow sparrow = new Sparrow();
            sparrow.canFly();

            // 2 Way to implement the Functional Interface by using Anonymous Class

            BirdFunctionalInterface eagleObject = new BirdFunctionalInterface() {
                @Override
                public void canFly() {
                  System.out.println("Yes Eagle can fly");
                }
            };
            eagleObject.canFly();


            // 3 ways is using the Lambda Expression

              BirdFunctionalInterface parrotObject = ()->{
                  System.out.println("Parrot can fly");
              };
            parrotObject.canFly();

        }
    }
}

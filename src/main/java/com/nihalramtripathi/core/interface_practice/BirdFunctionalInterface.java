package com.nihalramtripathi.core.interface_practice;


@FunctionalInterface
public interface BirdFunctionalInterface {

    void canFly();

    default void canEat(){

    }

    static void canDrink(){

    }

    String toString();

}

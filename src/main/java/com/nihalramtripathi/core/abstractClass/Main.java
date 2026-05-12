package com.nihalramtripathi.core.abstractClass;

public class Main {
    public static void main(String[] args) {
       /* Car car = new LuxuryCar() {
            @Override
            void digitalLCD() {

            }

            @Override
            void digitalMAP() {

            }

            @Override
            void speed() {

            }

            @Override
            void backGear() {

            }

            @Override
            void wheels() {

            }
        };
        car.numberOFGear();*/

        LuxuryCar car = new AbstractClassImpl();
        car.backGear();
    }
}

package com.nihalramtripathi.core.reflection;

public class Bird {
   public boolean name;
    double size;

    private void canFly(){
        System.out.println("Yes");
    }

     public void canEat(boolean value,String foodName){
        System.out.println("Can Eat ? "+value+",Food Name:"+foodName);
    }
}

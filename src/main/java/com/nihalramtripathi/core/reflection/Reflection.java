package com.nihalramtripathi.core.reflection;



/*
 To reflect the class, we first need to get an Object of Class
(So, lets first understand, Class then we will come back to how to reflect the class.)
What is this class Class?
- Instance of the class Class represents classes during runtime.
- JVM creates one Class object for each and every class which is loaded during run time. - This Class object, has meta data information about the particular class like its method,
fields, constructor etc.
How to get the particular class Class object?
* */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection {




    public Reflection() throws ClassNotFoundException {

    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 1 ways to get Class Object
        Class birdClass = Class.forName("com.nihalramtripathi.core.reflection.Bird");
        // 2 way
        Class birdClass1 = Bird.class;

        // 3 way
        Bird newBird = new Bird();
        Class getBirdClass2 = newBird.getClass();
       System.out.println("Class name "+birdClass.getName());
       System.out.println("Variables name "+ Arrays.toString(birdClass.getFields()));
       System.out.println("Variables name "+ Arrays.toString(birdClass.getDeclaredFields()));
       System.out.println("Modifiers: "+ Modifier.toString(birdClass.getModifiers()) );
       System.out.println("DeclaredMethods: "+ Arrays.toString(birdClass.getDeclaredMethods()));

      Object birdObj=birdClass1.newInstance();
      Method birdSMethod = birdClass1.getMethod("canEat", boolean.class, String.class);
      birdSMethod.invoke(birdObj,true,"Wheat");

    }

}

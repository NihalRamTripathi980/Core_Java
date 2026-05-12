package com.nihalramtripathi.core.GenericClass;

import java.util.List;

public class GenericVsWildCard {


    // Wild Card
    void computeNumber(List<? extends Number> list1, List<? extends Number> list2){

    }

    // Generic
    public <T extends Number> void computeNumber1(List<T> lsi1 , List<T> list2){

    }
}

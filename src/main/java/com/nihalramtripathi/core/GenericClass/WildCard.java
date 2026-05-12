package com.nihalramtripathi.core.GenericClass;

import java.util.List;

public class WildCard {

    // Upper Bound Wild Card
    void setPrintValue(List<? extends Vehicle> value){

    }

    // Lower Bound Wild Card
    void setPrintValueForLowerBound(List<? super Vehicle> value){

    }

    // Unbounded Wild card

    void setList(List<?> value){

    }
}

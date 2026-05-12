package com.nihalramtripathi.core.GenericClass;

public class Pair<K,V> {
    K key;
    V value;

    void put(K key,V value){
        this.key=key;
        this.value=value;
    }
}

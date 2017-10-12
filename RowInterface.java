package com.awesomedb;

public interface RowInterface<K, V> {
    V select(K key);
    boolean insert(K key, V value);
    boolean update(K key, V value);
    void delete(K key);
}

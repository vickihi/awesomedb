package com.awesomedb;

public interface RowInterface<K, V> {
    public V select(K key);
    public void insert(K key, V value);
    //public void update(K key, V value);
    public void delete(K key);
}

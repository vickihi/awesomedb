package com.awesomedb;

import java.util.*;

public class Row<K, V> implements RowInterface<K,V>, java.io.Serializable{
    private int size;
    private int DEFAULT_CAPACITY = 16;

    private Entry<K, V>[] values = new Entry[DEFAULT_CAPACITY];

    public V select(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public boolean insert(K key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                insert = false;
                break;
            }
        }
        if (insert) {
            ensureCapa();
            values[size++] = new Entry<>(key, value);
        }
        return insert;
    }

    public boolean update(K key, V value) {
        boolean update = false;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                update = true;
                break;
            }
        }
        return update;
    }

    private void ensureCapa() {
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public void delete(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                condenseArray(i);
            }
        }
    }

    public int size() {
        return size;
    }



    private void condenseArray(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<K>();
        for (int i = 0; i < size; i++) {
            set.add(values[i].getKey());
        }
        return set;
    }
}

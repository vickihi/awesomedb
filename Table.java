package com.awesomedb;

import java.util.Arrays;


public class Table<E> implements TableInterface, java.io.Serializable {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Table() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void add() {
        if (size == elements.length) {
            ensureCapacity();
        }
        Row<Column, String> entry = new Row<>();
        elements[size++] = entry;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements  = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public int size() {
        return size;
    }

    public void remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        Object temp[] = new Object[--size];
        for(int j = 0; j < size; j++) {
            if (j < i) {
                temp[j] = elements[j];
            } else {
                temp[j] = elements[j + 1];
            }
        }
        elements = temp;
    }

    public void remove(){
        Object temp[] = new Object[--size];
        for (int i = 0; i <size; i++) {
            temp[i] = elements[i];
        }
        elements = temp;
    }

}

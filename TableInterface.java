package com.awesomedb;

public interface TableInterface<E> {
    void add();
    E get(int i);
    int size();
    void remove();
    void remove(int i);
}

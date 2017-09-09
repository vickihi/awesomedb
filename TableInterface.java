package com.awesomedb;

public interface TableInterface<E> {
    public void add();
    public E get(int i);
    public int size();
    public void remove();
    public void remove(int i);
}

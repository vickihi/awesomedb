package com.awesomedb;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Column A = new Column();
        A.setName("Id");
        A.setType("Int");

        Column B = new Column();
        B.setName("Name");
        B.setType("String");

        Column C = new Column();
        C.setName("Gender");
        C.setType("String");

        Column D = new Column();
        D.setName("Age");
        D.setType("Int");

        Column E = new Column();
        E.setName("Description");
        E.setType("String");

        Column F = new Column();
        F.setName("DateCreated");
        F.setType("DateTime");


        Row<Column, String> entry1 = new Row<Column, String>();        entry1.put(A, "1");
        entry1.put(B, "John");
        entry1.put(C, "Male");
        entry1.put(D, "20");
        entry1.put(E, "Newbie");
        entry1.put(F, "2017-10-10");

        Row<Column, String> entry2 = new Row<Column, String>();
        entry2.put(A, "2");
        entry2.put(B, "Micheal");
        entry2.put(C, "Male");
        entry2.put(D, "22");
        entry2.put(E, "Box");
        entry2.put(F, "2017-11-10");

        Row<Column, String> entry3 = new Row<Column, String>();
        entry3.put(A, "3");
        entry3.put(B, "Jennie");
        entry3.put(C, "Female");
        entry3.put(D, "18");
        entry3.put(E, "Pretty");
        entry3.put(F, "2017-08-10");

        Row<Column, String> entry4 = new Row<Column, String>();
        entry4.put(A, "4");
        entry4.put(B, "Kate");
        entry4.put(C, "Female");
        entry4.put(D, "19");
        entry4.put(E, "Cute");
        entry4.put(F, "2017-10-11");

        Row<Column, String> entry5 = new Row<Column, String>();
        entry5.put(A, "5");
        entry5.put(B, "Bob");
        entry5.put(C, "Male");
        entry5.put(D, "17");
        entry5.put(E, "Under18");
        entry5.put(F, "2017-12-11");


        Table<Row> table = new Table<Row>();
        table.add(entry1);
        table.add(entry2);
        table.add(entry3);
        table.add(entry4);
        table.add(entry5);

        table.remove(2);

        System.out.println(table.size());
        System.out.println(table.get(2).get(B));
    }
}
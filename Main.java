package com.awesomedb;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Column Id = new Column("Id", "Int");
        Column Name = new Column("Name", "String");
        Column Gender = new Column("Gender", "String");
        Column Age = new Column("Age", "Int");
        Column Description = new Column("Description", "String");
        Column DateCreated = new Column("DateCreated", "DateTime");

        Row<Column, String> entry1 = new Row<>();

        entry1.put(Id, "1");
        entry1.put(Name, "John");
        entry1.put(Gender, "Male");
        entry1.put(Age, "20");
        entry1.put(Description, "Newbie");
        entry1.put(DateCreated, "2017-10-10");

        Row<Column, String> entry2 = new Row<>();
        entry2.put(Id, "2");
        entry2.put(Name, "Micheal");
        entry2.put(Gender, "Male");
        entry2.put(Age, "22");
        entry2.put(Description, "Box");
        entry2.put(DateCreated, "2017-11-10");

        Row<Column, String> entry3 = new Row<>();
        entry3.put(Id, "3");
        entry3.put(Name, "Jennie");
        entry3.put(Gender, "Female");
        entry3.put(Age, "18");
        entry3.put(Description, "Pretty");
        entry3.put(DateCreated, "2017-08-10");

        Row<Column, String> entry4 = new Row<>();
        entry4.put(Id, "4");
        entry4.put(Name, "Kate");
        entry4.put(Gender, "Female");
        entry4.put(Age, "19");
        entry4.put(Description, "Cute");
        entry4.put(DateCreated, "2017-10-11");

        Row<Column, String> entry5 = new Row<>();
        entry5.put(Id, "5");
        entry5.put(Name, "Bob");
        entry5.put(Gender, "Male");
        entry5.put(Age, "17");
        entry5.put(Description, "Under18");
        entry5.put(DateCreated, "2017-12-11");


        Table<Row> table = new Table<>();
        table.add(entry1);
        table.add(entry2);
        table.add(entry3);
        table.add(entry4);
        table.add(entry5);

        table.remove(2);

        table.add();

        System.out.println(table.size());
        for (int i = 0; i < table.size(); i++) {
            System.out.println(table.get(i).get(Name));
        }

        //System.out.println(table.get(2).get(Name));
    }
}
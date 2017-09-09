package com.awesomedb;

import com.sun.tools.javah.Gen;

public class Main {

    public static void main(String[] args) {
        Column Id = new Column("Id", "Int");
        Column Name = new Column("Name", "String");
        Column Gender = new Column("Gender", "String");
        Column Age = new Column("Age", "Int");
        Column Description = new Column("Description", "String");
        Column DateCreated = new Column("DateCreated", "DateTime");

        Row<Column, String> entry1 = new Row<>();

        entry1.insert(Id, "1");
        entry1.insert(Name, "John");
        entry1.insert(Gender, "Male");
        entry1.insert(Age, "20");
        entry1.insert(Description, "Newbie");
        entry1.insert(DateCreated, "2017-10-10");

        Row<Column, String> entry2 = new Row<>();
        entry2.insert(Id, "2");
        entry2.insert(Name, "Micheal");
        entry2.insert(Gender, "Male");
        entry2.insert(Age, "22");
        entry2.insert(Description, "Box");
        entry2.insert(DateCreated, "2017-11-10");

        Row<Column, String> entry3 = new Row<>();
        entry3.insert(Id, "3");
        entry3.insert(Name, "Jennie");
        entry3.insert(Gender, "Female");
        entry3.insert(Age, "18");
        entry3.insert(Description, "Pretty");
        entry3.insert(DateCreated, "2017-08-10");

        Row<Column, String> entry4 = new Row<>();
        entry4.insert(Id, "4");
        entry4.insert(Name, "Kate");
        entry4.insert(Gender, "Female");
        entry4.insert(Age, "19");
        entry4.insert(Description, "Cute");
        entry4.insert(DateCreated, "2017-10-11");

        Row<Column, String> entry5 = new Row<>();
        entry5.insert(Id, "5");
        entry5.insert(Name, "Bob");
        entry5.insert(Gender, "Male");
        entry5.insert(Age, "17");
        entry5.insert(Description, "Under18");
        entry5.insert(DateCreated, "2017-12-11");


        Table<Row> table = new Table<>();
        table.add(entry1);
        table.add(entry2);
        table.add(entry3);
        table.add(entry4);
        table.add(entry5);

        table.remove(2);

        table.add();
        table.remove();

        System.out.println("table size: " + table.size());

        System.out.println("Id Name Gender Age Description DateCreated");
        for (int i = 0; i < table.size(); i++) {
            Row row = table.get(i);
            if(i==0){
                row.delete(Gender);
            }
            System.out.print(row.select(Id) + " ");
            System.out.print(row.select(Name) + " ");
            System.out.print(row.select(Gender) + " ");
            System.out.print(row.select(Age) + " ");
            System.out.print(row.select(Description) + " ");
            System.out.print(row.select(DateCreated) + " ");
            System.out.println();
        }

        //System.out.println(table.get(2).get(Name));
    }
}
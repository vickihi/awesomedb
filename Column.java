package com.awesomedb;

public class Column  implements java.io.Serializable{

    //Properties
    private String name = null;
    private String type = null;

    // No-arg constructor (takes no arguments)
    public Column(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

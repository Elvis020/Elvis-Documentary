package com.example.elvisamoako.springboot_with_ranger.user;

import java.util.Date;

public class User {
    private int ID;
    private String name;

    public User(int ID, String name, Date DOB) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    private Date DOB;
}

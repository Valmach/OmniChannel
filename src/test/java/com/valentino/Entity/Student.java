package com.valentino.Entity;

public class Student {

    private int id;
    private String name;
    private String cours;

    public Student(int id, String name, String cours) {
        this.id = id;
        this.name = name;
        this.cours = cours;

    }

    public Student(){


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }
}


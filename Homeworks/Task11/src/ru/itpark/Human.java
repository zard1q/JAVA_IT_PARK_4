package ru.itpark;

public class Human {
    private String name;
    private int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "["+name + " " + age+"]";
        }
}

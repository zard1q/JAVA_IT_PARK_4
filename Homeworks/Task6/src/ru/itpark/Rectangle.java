package ru.itpark;

public class Rectangle extends Figure{
    private int a;
    private int h;

    public Rectangle (int a, int h, String name){
        this.a = a;
        this.h = h;
        super.name = name;
        super.area = a*h;
    }

}

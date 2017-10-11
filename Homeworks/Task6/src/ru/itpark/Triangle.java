package ru.itpark;

public class Triangle  extends Figure{
    private int a;
    private int h;


    public Triangle (int a, int h, String name){
        this.a = a;
        this.h = h;
        super.name = name;
        super.area = a*h/2.0;
    }

}

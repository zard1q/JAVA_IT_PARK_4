package ru.itpark;

public class Square extends Figure{
    private int a;
    public Square(int a, String name){
        this.a = a;
        super.area = a*a;
        super.name = name;
    }
}

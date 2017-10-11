package ru.itpark;

public class Circle extends Figure {
    private final double Pi = 3.1415926;
    private int r;


    public Circle(int r, String name) {
        this.r = r;
        super.name = name;
        super.area = Pi*r*r;

    }

}

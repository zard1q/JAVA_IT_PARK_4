package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Triangle treugolnik = new Triangle(4,8, "треугольник");
        Rectangle pryamougolnik = new Rectangle(4,8, "прямоугольник");
        Circle krug = new Circle(3, "круг");
        Square kvadrat = new Square(6, "квадрат");

        Figure figures[] = {treugolnik, pryamougolnik, krug, kvadrat};
        for(Figure figure:figures) {
            System.out.println("Площадь " + figure.getName() + "а" + " равна " +  figure.getArea());
        }

	}
}


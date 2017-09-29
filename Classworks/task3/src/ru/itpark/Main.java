package ru.itpark;
import static java.lang.Math.*;
public class Main {

    public static double f(double x) {
        return sin(x);
    }

    public static double integrate(double a, double b, int n) {
        // рассчитать ширину разбиения
        double result = 0;
        double h = abs(a - b) / (double) (n);
        for (double x = a; x <= b; x = x + h) {
            result += f(x) * h;
        }

        return result;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        double integrateOFSin = integrate(0, PI, 10000);
        System.out.println(integrateOFSin);

    }
}
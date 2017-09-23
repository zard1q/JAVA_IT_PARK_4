package ru.itpark;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число элементова массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[];
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("а[%d]=",i);

            a[i] = scanner.nextInt();
            if (i % 2 == 0) {
                a[i] = 0;
            }
            }


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


	// write your code here
    }
}

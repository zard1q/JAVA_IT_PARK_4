package ru.itpark;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        int array[] = new int[numbersCount];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Sorter.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}

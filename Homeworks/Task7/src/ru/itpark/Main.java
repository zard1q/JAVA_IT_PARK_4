package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Program program = new Program();
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.println("Введите символ: ");
//            char c = scanner.next().charAt(0);
//            System.out.println(program.isLetter(c));
//            System.out.println(program.isDigit(c));
//            System.out.println(program.isUpper(c));
//            System.out.println(program.isLower(c));
//        }
        char number[] = {'1', '4', '5', '6'};
        int x = program.parse(number);
        System.out.println(x); // 1456

    }
}

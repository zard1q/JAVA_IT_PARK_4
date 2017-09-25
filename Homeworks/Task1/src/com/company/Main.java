package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Меню:");
        System.out.println("1. Считать 2 числа");
        System.out.println("2. Сумма чисел вывод");
        System.out.println("3. Разность чисел вывод");
        System.out.println("4. Произведение чисел вывод:");
        System.out.println("5. Выход");
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        while(true) {
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.print("Первое число = ");
                    number1 = scanner.nextInt();
                    System.out.print("Второе число = ");
                    number2 = scanner.nextInt();
                    System.out.println("Числа определены! Введите команду!");
                    break;
                case 2:
                    System.out.printf("%d + %d = " + (number1 + number2) +  "\n", number1, number2);
                    break;
                case 3:
                    System.out.printf("%d - %d = " + (number1 - number2) +  "\n", number1, number2);
                    break;
                case 4:
                    System.out.printf("%d * %d = " + (number1 * number2) +  "\n", number1, number2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна!");



            }
        }


	// write your code here
    }
}

package ru.itpark;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(100);


        Scanner scanner = new Scanner(System.in);

        System.out.println("МЕНЮ:");
        System.out.println("1. Показать массив");
        System.out.println("2. Добавить элемент в начало массива");
        System.out.println("3. Добавить элемент в конец массива");
        System.out.println("4. Удалить указанный элемент массива");
        System.out.println("5. Выход");

        while (true) {
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    for (int i = 0; i < a.size(); i++) {
                        System.out.printf("[%d] ", a.get(i));
                    }
                    System.out.println("\nРазмер массива равен '" + a.size() + "' элементам");

                    break;
                case 2:
                    System.out.printf("Введите число для добавления в начало массива: ");
                    a.add(0, scanner.nextInt());
                    for (int i = 0; i < a.size(); i++) {
                        System.out.printf("[%d] ", a.get(i));
                    }
                    System.out.println("\nРазмер массива равен '" + a.size() + "' элементам");
                    break;
                case 3:
                    System.out.printf("Введите число для добавления в конец массива: ");
                    a.add(scanner.nextInt());
                    for (int i = 0; i < a.size(); i++) {
                        System.out.printf("[%d] ", a.get(i));
                    }
                    System.out.println("\nРазмер массива равен '" + a.size() + "' элементам");
                    break;
                case 4:
                    System.out.printf("Введите номер элемента для удаления из массива: ");
                    int b = (scanner.nextInt());
                    if (a.size() == 0) {
                        System.out.println("Нельзя удалить элемент из пустого массива! Сначала введите элементы в массив!");
                    }

                    else if  (b > a.size()-1) {

                        System.out.println("Элемента с таким номером не существует! Введите правильный номер!");

                    }
                    else {
                        a.remove(b);
                        for (int i = 0; i < a.size(); i++) {
                            System.out.printf("[%d] ", a.get(i));
                        }
                        System.out.println("\nРазмер массива равен '" + a.size() + "' элементам");
                    }

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна!");
            }
        }
    }
}


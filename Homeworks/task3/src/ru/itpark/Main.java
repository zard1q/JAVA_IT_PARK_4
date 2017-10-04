package ru.itpark;

import java.util.Scanner;


public class Main {


    //вывод элементов массива
    public static void output(int a[], int count) {
        for (int i = 0; i < count; i++) {
            System.out.printf("[%d] ", a[i]);

        }
        System.out.println("\nРазмер массива равен '" + count + "' элементам");
    }
    //добавление элемента в начало массива
    public static boolean addLeft(int a[], int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для добавления в начало массива: ");

        if (count >= a.length) {
            System.out.println("Массив полон! Сначала удалите какой-нибудь элемент!");
            return false;
        }
        else {
            for (int i = count - 1; i >= 0; i--) {
                a[i + 1] = a[i];
            }
        }
        a[0] = scanner.nextInt();
        return true;

    }

    //добавление элемента в конеч массива
    public static boolean addRight(int a[], int count) {
        Scanner scanner = new Scanner(System.in);
        if (count >= a.length) {
            System.out.println("Массив полон! Сначала удалите какой-нибудь элемент!");
            return false;
        }
        else {
            System.out.printf("Введите число для добавления в конец массива: ");
            a[count] = scanner.nextInt();
            return true;
        }
    }

    //удаление элемента из массива
    public static boolean remove(int a[], int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер элемента для удаления из массива (начиная от 0): ");
        int index = (scanner.nextInt());
        if (count == 0) {
            System.out.println("Нельзя удалить элемент из пустого массива! Сначала введите элементы в массив!");
            return false;
        }
        else {
            while (index > count - 1){
                System.out.print("Элемента с таким номером не существует! Введите правильный номер: ");
                index = (scanner.nextInt());
            }
            if (index < a.length-1) {
                for (int i = index; i < count; i++) {
                    a[i] = a[i+1];
                }
            }
            else a[index] = 0;
            return true;
        }
    }


    //сортировка массива
    public static void sort(int a[], int count) {
        for (int i = 0; i < count; i++) {
            int min = i;
            for (int j = i;j < count; j++) {
                if (a[min] > a[j]) {
                        min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }




    public static void main(String[] args) {


        int a[] = new int[100];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("МЕНЮ:");
        System.out.println("1. Показать массив");
        System.out.println("2. Добавить элемент в начало массива");
        System.out.println("3. Добавить элемент в конец массива");
        System.out.println("4. Удалить указанный элемент массива");
        System.out.println("5. Сортировать массив по возрастанию");
        System.out.println("6. Выход");

        while (true) {
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    output(a, count);
                    break;
                case 2:
                    if (addLeft(a, count)) {
                        count++;
                        output(a, count);
                    }
                    break;
                case 3:
                    if (addRight(a, count)) {
                        count++;
                        output(a, count);
                    }
                    break;

                case 4:
                    if (remove(a, count)) {
                        count--;
                        output(a, count);
                    }
                    break;
                case 5:
                    sort(a, count);
                    output(a, count);
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна!");
            }
        }
    }
}


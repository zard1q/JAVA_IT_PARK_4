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
    public static boolean unshift(int a[], int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число для добавления в начало массива: ");

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
    public static boolean push(int a[], int count) {
        Scanner scanner = new Scanner(System.in);
        if (count > a.length) {
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
        else if (index > count - 1) {
            while (index > count - 1){
            System.out.println("Элемента с таким номером не существует! Введите правильный номер: ");


            return false;
        }
        else {
            for (int i = index; i < count; i++) {
                a[i] = a[i + 1];
            }
            return true;

        }
    }




    public static void main(String[] args) {

//        ArrayList<Integer> a = new ArrayList<>(100);
        int a[] = new int[5];
        int count = 0;

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
                    output(a, count);
                    break;
                case 2:
                    if (unshift(a, count)) {
                        count++;
                        output(a, count);
                    }
                    break;
                case 3:
                    if (push(a, count)) {
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна!");
            }
        }
    }
}


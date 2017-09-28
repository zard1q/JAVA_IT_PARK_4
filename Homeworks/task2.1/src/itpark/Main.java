package itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Integer> a = new ArrayList<>(100);
        int a[] = new int[100];
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
                    for (int i = 0; i < count; i++) {
                        System.out.printf("[%d] ", a[i]);
                    }
                    System.out.println("\nРазмер массива равен '" + count + "' элементам");

                    break;
                case 2:
                    if (count > 99) {
                        System.out.println("Массив полон! Сначала удалите какой-нибудь элемент!");
                        break;
                    }
                    else {
                        System.out.printf("Введите число для добавления в начало массива: ");
                        for (int i = count - 1; i >= 0; i--) {
                            a[i + 1] = a[i];
                        }
                        a[0] = scanner.nextInt();
                        count++;
                        for (int i = 0; i < count; i++) {
                            System.out.printf("[%d] ", a[i]);
                        }
                        System.out.println("\nРазмер массива равен '" + count + "' элементам");
                        break;
                    }
                case 3:
                    if (count > 99) {
                        System.out.println("Массив полон! Сначала удалите какой-нибудь элемент!");
                        break;
                    }
                    else {
                        System.out.printf("Введите число для добавления в конец массива: ");
                        a[count] = scanner.nextInt();
                        count ++;
                        for (int i = 0; i < count; i++) {
                            System.out.printf("[%d] ", a[i]);
                        }
                        System.out.println("\nРазмер массива равен '" + count + "' элементам");
                        break;
                    }

                case 4:
                    System.out.printf("Введите номер элемента для удаления из массива (начиная от 0): ");
                    int b = (scanner.nextInt());
                    if (count == 0) {
                        System.out.println("Нельзя удалить элемент из пустого массива! Сначала введите элементы в массив!");
                    }

                    else if  (b >count-1) {

                        System.out.println("Элемента с таким номером не существует! Введите правильный номер!");

                    }
                    else {

                        for (int i = b; i < count; i++) {
                            a[i] = a[i+1];
                        }
                        count--;

                        for (int i = 0; i < count; i++) {
                            System.out.printf("[%d] ", a[i]);
                        }
                        System.out.println("\nРазмер массива равен '" + count + "' элементам");
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


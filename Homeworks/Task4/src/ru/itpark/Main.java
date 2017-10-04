package ru.itpark;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        // инзачально это массив null
        ArrayList lists[] = new ArrayList[5];
        // МЕНЮ
        // 1. Создать список (0..4) - создаете нужный список
        // 2. Показть все списки (показываются только ненулевые)
        // 3. Работа со списком - попросить ввести номер спика
        //       1. Добавить
        //       2. Удалить
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать список");
            System.out.println("2. Показать все списки");
            System.out.println("3. Работа со списком");
            System.out.println("4. Выход");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0..4]");
                    int listNumber = scanner.nextInt();
                    lists[listNumber] = new ArrayList();
                    break;
                case 2:
                    int notEmpty = 0;
                    for(int i = 0; i < lists.length; i++) {
                        if (lists[i].size() > 0) {
                            System.out.println(lists[i]);
                            notEmpty++;
                        }
                    }
                    if (notEmpty == 0) {
                        System.out.println("Все списки пусты");
                    }
                    break;
                case 3:
                    System.out.print("Работа со списками. Введите номер списка: ");
                    listNumber = scanner.nextInt();

                    System.out.println("Меню работы со списком:");
                    System.out.println("1. Показать массив");
                    System.out.println("2. Добавить элемент в начало массива");
                    System.out.println("3. Добавить элемент в конец массива");
                    System.out.println("4. Добавить элемент в заданную позицию");
                    System.out.println("5. Показать элемент по заданному индексу");
                    System.out.println("6. Заменить элемент в заданной позиции новым");
                    System.out.println("7. Сортировать массив по возрастанию");
                    System.out.println("8. Развернуть массив");
                    System.out.println("9. Удалить элемент по заданному индексу");
                    System.out.println("10. Показать индекс элемента в массиве");
                    System.out.println("11. Выход");
                    while (command != 11) {
                        command = scanner.nextInt();

                        switch (command) {
                            case 1:
                                for (int i = 0; i < lists[listNumber].size(); i++) {
                                    System.out.printf("[%d] ", lists[listNumber].get(i));
                                }
                                break;
                            case 2:
                                System.out.print("Введите элемент для добавления в начало массива: ");
                                lists[listNumber].addToBegin(scanner.nextInt());
                                break;
                            case 3:
                                System.out.print("Введите элемент для добавления в конец массива: ");
                                lists[listNumber].add(scanner.nextInt());
                                break;

                            case 4:
                                System.out.print("Введите элемент: ");
                                int element = scanner.nextInt();
                                System.out.print("Введите индекс: ");
                                int index = scanner.nextInt();
                                lists[listNumber].insert(element, index);
                                break;

                            case 5:
                                System.out.print("Введите индекс: ");
                                lists[listNumber].get(scanner.nextInt());
                                break;

                            case 6:
                                System.out.print("Введите элемент: ");
                                element = scanner.nextInt();
                                System.out.print("Введите индекс: ");
                                index = scanner.nextInt();
                                lists[listNumber].insert(element, index);
                                break;

                            case 7:
                                lists[listNumber].sort();
                                System.out.println("Массив отсортирован");
                                break;

                            case 8:
                                lists[listNumber].reverse();
                                System.out.println("Массив развернут");
                                break;

                            case 9:
                                System.out.print("Введите индекс элемента для удаления из массива: ");
                                lists[listNumber].remove(scanner.nextInt());
                                break;

                            case 10:
                                System.out.print("Введите элемент, чтобы узнать его индекс: ");
                                break;

                            case 11:
                                break;

                            default:
                                System.out.println("Команда не верна!");
                                break;


                        }




                    }
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Команда не верна!");
                    break;

            }
        }
    }
}


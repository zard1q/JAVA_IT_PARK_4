package ru.itpark;

public class ArrayList {
    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 100;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    /**
     * Добавить элемент в конец
     *
     * @param element
     */
    public void add(int element) {
        if (count < elements.length) {
            elements[count] = element;
            count++;
        } else {
            // TODO: увеличение размера массива
            System.err.println("Нет места");
        }
    }

    /**
     * Добавить элемент в начало списка, со сдвигом вправо
     *
     * @param element
     */
    public void addToBegin(int element) {
        if (count < elements.length) {
            for (int i = count - 1; i >= 0; i--) {
                elements[i + 1] = elements[i];
                elements[0] = element;
                count++;
            }
        } else {

            System.err.println("Нет места");
        }

    }

    /**
     * Вставить элемент в заданную позицию со сдвигом
     *
     * @param element сам элемент
     * @param index   индекс, куда надо вставить
     */
    public void insert(int element, int index) {
        if (count < elements.length) {
            if ((index < count) & (index >= 0)) {
                for (int i = count - 1; i >= element; i--) {
                    elements[i + 1] = elements[i];
                    elements[index] = element;
                    count++;
                }
            } else {
                System.err.println("Неправильный индекс");
            }

        } else {
            System.err.println("Нет места");

        }

    }

    /**
     * Получить элемент по индексу
     *
     * @param index
     * @return сам элемент по заданному индексу
     */
    public int get(int index) {
        if ((index < count) & (index >= 0)) {
            return elements[index];

        } else {
            return -1;
        }
    }

    /**
     * Заменить элемент в заданной позиции новым элементом
     *
     * @param index
     * @param element
     */
    public void replace(int index, int element) {
        if ((index < count) & (index >= 0)) {
            elements[index] = element;
        } else {
            System.err.println("Неправильный индекс");
        }


    }

    public void sort() {
        for (int i = 0; i < count; i++) {
            int min = i;
            for (int j = i; j < count; j++) {
                if (elements[min] > elements[j]) {
                    min = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }


    }

    public void reverse() {
        for (int i = 0; i < count / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[count - 1];
            elements[count - 1] = temp;

        }

    }

    public void remove(int index) {
        while (index > count - 1) {
            System.out.print("Элемента с таким номером не существует! Введите правильный номер: ");
        }
        if (index == elements.length - 1) {
            elements[index] = 0;
        } else {
            for (int i = index; i < count; i++) {
                elements[i] = elements[i + 1];
            }
        }
        count--;
    }


    /**
     * Вернуть индекс элемента, если элемента нет = -1
     *
     * @param element
     * @return
     */

    public int find(int element) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }


    public int size() {
        return count;
    }
}
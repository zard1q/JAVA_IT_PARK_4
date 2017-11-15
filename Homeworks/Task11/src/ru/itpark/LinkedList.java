package ru.itpark;

public class LinkedList<T> implements Iterable<T> {

    // указатель на начало списка
    private Node head;

    // указатель на конец списка
    private Node tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }


    public void add(T element) {
        Node newNode = new Node(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
//    // создаем новый узел
//    Node newNode = new Node(element);
//    // заводим бегунок, который будет
//    // бегать по элементам списка
//    // начиная с первого
//    Node currentNode = head;
//    // пока после текущего есть элементы
//    // смещаем бегунок дальше
//    while (currentNode.next != null) {
//      currentNode = currentNode.next;
//    }
//    // когда элементы закончились,
//    // новый элемент будет следующим после
//    // последнего
//    currentNode.next = newNode;
    }


    public void addToBegin(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            tail = newNode;
        }

        // для нового узла следующий элемент -
        // тот, который был первым в списке
        newNode.next = head;
        // теперь первый элемент списка - новый
        head = newNode;
        count++;
    }


    public T get(int index) {
        if (index < 0 && index >= count) {
            throw new IllegalArgumentException();
        }
        // начинаем с первого элемнта
        Node currentNode = head;
        // пока i меньше, чем index идем дальше
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        // значение currentNode
        return (T)currentNode.value;
    }


    public void remove(T object) {
        if (head.value.equals(object)) {
            head = head.next;
            count--;
        } else {
            Node currentNode = head;
            while (currentNode.next != null && !currentNode.next.value.equals(object)) {
                currentNode = currentNode.next;
            }
            if (currentNode.next.value.equals(object)) {
                currentNode.next = currentNode.next.next;
                count--;
            }
        }

    }


    public int indexOf(T object) {
        Node currentNode = head;
        for (int i = 0; i < count; i++) {
            if (currentNode.value.equals(object)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }


    public int size() {
        return count;
    }


    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator<T> implements Iterator {

        private Node currentNode = head;


        public T next() {
            T element = (T) currentNode.value;
            currentNode = currentNode.next;
            return element;
        }


        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node<T> {
        // значение, которое хранит узел
        T value;
        // указатель на следующий узел
        Node next;

        Node(T value) {
            this.value = value;
        }
    }


}
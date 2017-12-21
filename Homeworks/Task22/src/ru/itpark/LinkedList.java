package ru.itpark;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LinkedList<T> implements Iterable {

    private Node head;
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

    }
    public void addToBegin(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            tail = newNode;
        }

        newNode.next = head;
        head = newNode;
        count++;
    }

    public T get(int index) {
        if (index < 0 && index >= count) {
            throw new IllegalArgumentException();
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
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
        T value;
        // указатель на следующий узел
        Node next;

        Node(T value) {
            this.value = value;
        }
    }
    public MyStream<T> stream() {
        return new LinkedListStream<T>(this);
    }
    private static class LinkedListStream<T> implements MyStream<T>{
        private LinkedList<T> linkedList = new LinkedList<>();

        LinkedListStream(LinkedList<T> linkedList) {
            for (int i = 0; i < linkedList.size(); i++) {
                this.linkedList.add(linkedList.get(i));
            }
        }

        @Override
        public MyStream<T> forEach(Consumer<T> consumer) {
            for (int i = 0; i < linkedList.size(); i++) {
                consumer.accept(linkedList.get(i));
            }
            return this;
        }
        @Override
        public MyStream<T> filter(Predicate<T> predicate) {
            LinkedList<T> filter = new LinkedList<>();
            for (int i = 0; i < linkedList.size(); i++) {
                if (predicate.test(linkedList.get(i))) {
                    filter.add(linkedList.get(i));
                }
            }
            return filter.stream();
        }
        @Override
        public <R> MyStream<R> map(Function<T, R> function) {
            LinkedList<R> rLinkedList = new LinkedList<>();
            for (int i = 0; i < linkedList.size(); i++) {
                rLinkedList.add(function.apply(linkedList.get(i)));
            }
            return rLinkedList.stream();
        }
    }
}
package ru.itpark;


public class ArrayList<T> implements Iterable<T> {
    private int initial_size = 10;
    private Object data[];
    private Object temp[];

    private int count;

    public ArrayList() {
        data = new Object[initial_size];
        count = 0;
    }


    public void add(T element) {

        if (count+1 == data.length) {
            temp = new Object[data.length*3/2 + 1];
            for (int i = 0; i < count; i++) {
                temp[i] = data[i];
            }
            data = temp;

        }
        data[count++] = element;
    }

    public void addToBegin(T object) {
        if (count+1 < data.length){
            for (int i = count - 1; i >= 0; i--) {
                data[i + 1] = data[i];
            }
            data[0] = object;
            count++;
        } else {
            temp = data;
            int new_size = (initial_size*3)/2 + 1;
            data = new Object[(initial_size*3)/2 + 1];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
            addToBegin(object);
        }



    }

    public T get(int index) {
        return (T)data[index];
    }

    public void remove(T object) {
        if (indexOf(object) != -1) {
            for (int i = indexOf(object); i < count; i++) {
                data[i] = data[i + 1];
            }
            count--;
        } else {
            throw new IllegalArgumentException();
        }




    }

    public int indexOf(T object) {
        for(int i = 0; i < count; i++) {
            if (data[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return count;
    }


    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator<T> implements Iterator {
        int arrayCount = 0;
        private T currentValue = (T)data[arrayCount];


        public T next() {
            T element = currentValue;
            currentValue = (T)data[++arrayCount];
            return element;
        }

        public boolean hasNext() {
            return currentValue != null;
        }
    }
}
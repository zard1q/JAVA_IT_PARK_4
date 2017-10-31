package ru.itpark;

public class ArrayList implements Iterable {
    private int initial_size = 10;
    private Object data[];
    private Object temp[];

    private int count;

    public ArrayList() {
        data = new Object[initial_size];
        count = 0;
    }


    public void add(Object element) {

        if (count+1 < data.length) {
            data[count++] = element;
        } else {
            temp = data;


            data = new Object[(initial_size*3)/2 + 1];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
            add(element);
        }
    }

    public void addToBegin(Object object) {
        if (count+1 < data.length){
            for (int i = count - 1; i >= 0; i--) {
                data[i + 1] = data[i];
            }
            data[0] = object;
            count++;
        } else {
            temp = data;
            int new_size = (initial_size*3)/2 + 1;
            System.out.println(new_size + "lol");
            data = new Object[(initial_size*3)/2 + 1];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
            addToBegin(object);
        }



    }

    public Object get(int index) {
        return data[index];
    }

    public void remove(Object object) {
        if (indexOf(object) != -1) {
            for (int i = indexOf(object); i < count; i++) {
                data[i] = data[i + 1];
            }
            count--;
        } else {
            throw new IllegalArgumentException();
        }




    }

    public int indexOf(Object object) {
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

    private class ArrayListIterator implements Iterator {
        int arrayCount = 0;
        private Object currentValue = data[arrayCount];


        public Object next() {
            Object element = currentValue;
            currentValue = data[++arrayCount];
            return element;
        }

        public boolean hasNext() {
            return currentValue != null;
        }
    }
}
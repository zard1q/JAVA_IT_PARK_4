package ru.itpark;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader("input.txt");
        ArrayList<LinkedList<Human>> list = new ArrayList<>();
        String name = reader.readString();
        int age = reader.readInteger();
        for (int i = 0; i < 100; i++) {
            list.add(new LinkedList<>());
        }
        while (name.length()>0) {
            list.get(age).add(new Human(name, age));
            name = reader.readString();
            age = reader.readInteger();
        }
        for (int i = 0; i < 100; i++) {
            if (list.get(i).size() != 0) {
                System.out.println(i+": ");
                Iterator iterator = list.get(i).iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next());
                }
                System.out.println();
            }
        }
     }
}
package ru.itpark;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("Fifth");
        arrayList.addToBegin("Zeroth");
        arrayList.add(5);

        Iterator iteratorA = arrayList.iterator();
        System.out.println(arrayList.indexOf(5));
        arrayList.remove(5);
        System.out.println(arrayList.indexOf(5));
        System.out.println(arrayList.size());
        arrayList.remove("Third");

        //ИТЕРАТОР
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }

        System.out.println(arrayList.size());

    }
}
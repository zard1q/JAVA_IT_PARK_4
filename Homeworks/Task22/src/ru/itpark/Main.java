package ru.itpark;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.stream()
                .filter(line -> line > 5)
                .map(line -> line+" в кадрате равно " + line*line)
                .forEach(line -> System.out.println(line));

        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            char symbol = (char) ('a'+i);
            linkedList.add(Character.toString(symbol)+i);
        }
        linkedList.stream()
                .filter(line -> line.charAt(0)<'f')
                .map(line -> line.charAt(0)=='a')
                .forEach(line -> System.out.println(line));
    }

}

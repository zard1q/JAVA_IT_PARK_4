package ru.itpark;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double x = 0.002;
        System.out.println(x.hashCode());



        HashMap<String, Integer> map = new HashMap<>();

        map.put("Алексей", 27);
        map.put("Алмаз", 25);
        map.put("Загир", 26);
        map.put("Радик", 24);
        map.put("Марс", 24);
        map.put("Антон", 18);
        map.put("Алия", 21);
        map.put("Даниил", 25);
        map.put("Андрей", 19);
        map.put("Елизавета", 19);
        map.put("Руслан", 47);
        map.put("Артур", 18);



        System.out.println(map.get("Алексей"));
        System.out.println(map.get("Алмаз"));
        System.out.println(map.get("Загир"));
        System.out.println(map.get("Радик"));
        System.out.println(map.get("Марс"));
        System.out.println(map.get("Антон"));
        System.out.println(map.get("Алия"));
        System.out.println(map.get("Даниил"));
        System.out.println(map.get("Андрей"));
        System.out.println(map.get("Елизавета"));
        System.out.println(map.get("Руслан"));
        System.out.println(map.get("Артур"));
        System.out.println(map.get("Авраам"));

        map.keySet();
        System.out.println();
        System.out.println();

        Set<String> setMap= new Set<>();
        setMap.put("Алексей");
        setMap.put("Алексей");
        setMap.put("Алексей");
        setMap.put("Марсель");
        setMap.put("Марсель");
        setMap.getValues();

    }
}

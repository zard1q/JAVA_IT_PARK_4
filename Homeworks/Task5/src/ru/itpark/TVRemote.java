package ru.itpark;

import java.util.Scanner;

public class TVRemote {
    private TV tv;
    private int count;
    private String name = "";
    public TVRemote(TV tv) {
        this.tv = tv;
    }

    public void switchChannel() {

        System.out.println("Введите название канала('Первый', 'Россия', '2x2'(для выключения введите 'Выключить')): ");
        Scanner scanner = new Scanner(System.in);

        while (true){
            count = 0;
            name = scanner.next();
            for (Channels channel:tv.getChannels()) {
                if (channel.getName().equals(name)) {
                    tv.onChannel(channel);
                    count++; //количество совпадений
                } else if (name.equals("Выключить")) {
                    System.exit(0);
                }
            }
            if (count == 0) {
                System.out.println("Введите правильное название. Только 'Первый канал', 'Россия', '2x2', 'Выключить'");
            }
        }
    }
}

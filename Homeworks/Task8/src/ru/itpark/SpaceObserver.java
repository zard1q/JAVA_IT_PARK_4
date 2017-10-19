package ru.itpark;

public class SpaceObserver implements Observer {
    private int count = 0;

    @Override
    public void handleEvent(char[] symbols) {
        for(char symbol:symbols) {
            if (symbol == ' ') {
                count ++;
            }

        }
        System.out.println("Количество пробелов в строке равно " + (count-1));

    }
}

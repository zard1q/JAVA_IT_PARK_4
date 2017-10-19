package ru.itpark;

public class LetterObserver implements Observer {
    private int count = 0;
    @Override
    public void handleEvent(char[] symbols) {
        for(char symbol:symbols) {
            if (((int) symbol > 64 && (int) symbol < 91)||((int) symbol > 96 && (int) symbol < 123)||(((int) symbol > 1039 && (int) symbol < 1104))||((int) symbol == 1025)||((int) symbol == 1105)) {
                count ++;
            }
        }
        System.out.println("Количество букв в строке равно " + count);

    }
}


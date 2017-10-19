package ru.itpark;

public class DigitObserver implements Observer {
    private int count = 0;
    @Override
    public void handleEvent(char[] symbols) {
        for(char symbol:symbols) {
            if ((int) symbol > 47 && (int) symbol < 58) {
                count ++;
            }
        }
        System.out.println("Количество цифр в строке равно " + count);
    }
}

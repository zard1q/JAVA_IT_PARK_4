package ru.itpark;

public class Splitter implements Observer {
    private char[] word = new char[100];
    int countString = 0;
    int countChar = 0;
    private String[] stringParsed = new String[30];

    @Override
    public void handleEvent(char[] symbols) {
        for (char symbol:symbols) {
            if ((int) symbol != ' ') {
                word[countChar] = symbol;
                countChar++;
            } else if(countChar > 0) {
                stringParsed[countString] = new String(word);
                word = new char[100];
                countString++;
                countChar = 0;
            }
        }
        System.out.println("Получился массив строк:");
        for (int i = 0; i < countString; i++) {
            System.out.print("[" + stringParsed[i] + "] ");
        }
        System.out.println();
    }
}

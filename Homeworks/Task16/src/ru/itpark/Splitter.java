package ru.itpark;

public class Splitter extends ObserverThread {
    private char[] charArray = new char[50];

    int countString = 0;
    int countChar = 0;
    private String[] stringParsed = new String[30];

    @Override
    public void handleEvent(char[] symbols) {
        for (char symbol:symbols) {
            if ( symbol != ' ') {
                charArray[countChar] = symbol;
                countChar++;

            } else if(countChar > 0) {
                char[] word = new char[countChar];
                for(int i = 0; i < countChar;i++) {
                    word[i] = charArray[i];
                }
                stringParsed[countString] = new String(word);
                countString++;
                countChar = 0;
            }
        }
//        System.out.println("Получился массив строк:");
        for (int i = 0; i < countString; i++) {
            System.out.print("[" + stringParsed[i] + "] ");
        }
        System.out.println();
    }
}

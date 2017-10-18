package ru.itpark;

public class Parser {
    private static Parser instance = new Parser();
    private static String stringInput;

    public static Parser getInstance(String input) {
        Parser.stringInput = input;
        return instance;
    }
    public void parseString() {
        char[] symbols = (stringInput + " ").toCharArray();
        System.out.println();
        InputString inputString = new InputString(symbols);
              //.addObserver();
        inputString.addObserver(new Splitter());
        inputString.addObserver(new meetLetter());
        inputString.addObserver(new meetSpace());
        inputString.addObserver(new meetDigit());
        inputString.event();
    }



}




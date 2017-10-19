package ru.itpark;

public class Parser implements Observable {

    private Observer[] observers = new Observer[4];
    private int count = 0;
    private char[] symbols;

    private Parser(Builder builder) {
        this.observers = builder.observers;
        this.count = builder.count;
    }

    public void inputString(String stringInput) {
        symbols = (stringInput + " ").toCharArray();
        for (int i = 0; i < count; i++) {
            observers[i].handleEvent(symbols);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private Observer[] observers = new Observer[4];
        private int count =0;

        public Builder addObserver(Observer observer) {
            observers[count] = observer;
            count++;
            return this;
        }
        public Parser build() {
            return new Parser(this);
        }
    }



}




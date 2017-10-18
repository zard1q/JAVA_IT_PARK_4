package ru.itpark;

public class InputString implements Observable {

    private Observer[] observers = new Observer[4];
    private int count = 0;
    private char[] symbols;
    public InputString(char[] symbols) {
        this.symbols = symbols;

    }
    @Override
    public void event() {
        for (int i = 0; i < count; i++) {
            observers[i].handleEvent(symbols);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers[count] = observer;
        count++;
    }
}

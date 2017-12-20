package ru.itpark;

import static ru.itpark.TextViewer.text;

public abstract class ObserverThread implements Runnable {

    @Override
    public void run() {
        char[] symbols = (text + " ").toCharArray();
        handleEvent(symbols);

    }
    public abstract void handleEvent(char[] text);
}

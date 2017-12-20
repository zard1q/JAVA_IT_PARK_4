package ru.itpark;

public class Main {

    public static void main(String[] args) {
        TextViewer textViewer = new TextViewer();
        textViewer.setText("Шла Саша по шоссе №60");
        textViewer.addTask(new Splitter());
        textViewer.addTask(new SpaceObserver());
        textViewer.addTask(new DigitObserver());
        textViewer.addTask(new LetterObserver());

        textViewer.textProcess();
    }
}

package ru.itpark;

public class TextViewer {

    private Runnable runnables[] = new Runnable[10];
    private int count;
    private Thread threads[] = new Thread[10];

    public static String text;

    public void setText(String text) {
        this.text = text;
    }

    public void textProcess() {
        for(int i = 0; i < count; i++){
            threads[i] = new Thread(runnables[i]);
            threads[i].start();
        }

        // как-то их запустить над text
    }

    public void addTask(ObserverThread task) {
        runnables[count++] = task;
    }
}
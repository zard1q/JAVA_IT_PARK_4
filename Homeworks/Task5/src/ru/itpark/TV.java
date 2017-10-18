package ru.itpark;

public class TV {
    private static TV singleTV = new TV();
    private static Channels channels[];

    public static TV getInstance(Channels[] channels) {
        TV.channels = channels;
        return singleTV;
    }

    public void onChannel(Channels channel) {
        System.out.println(channel.goingNow());
    }

    public Channels[] getChannels() {

        return channels;
    }

}














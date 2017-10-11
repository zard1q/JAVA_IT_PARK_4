package ru.itpark;

public class TV {
    private String name;
    private Channels channels[];

    public TV(Channels[] channels, String name) {
        this.channels = channels;
        this.name = name;
    }

    public void onChannel(Channels channel) {
       System.out.println(channel.goingNow());
    }

    public Channels[] getChannels() {
        return channels;
    }

}














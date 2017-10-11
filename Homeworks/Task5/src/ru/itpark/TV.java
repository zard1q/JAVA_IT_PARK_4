package ru.itpark;

public class TV {
    private Channels channels[];

    public TV(Channels[] channels) {
        this.channels = channels;
    }

    public void onChannel(Channels channel) {
        System.out.println(channel.goingNow());
    }

    public Channels[] getChannels() {
        return channels;
    }

}














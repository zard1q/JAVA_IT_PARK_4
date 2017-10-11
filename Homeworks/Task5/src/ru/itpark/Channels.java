package ru.itpark;

import java.time.LocalTime;

public class Channels {
    private final int MAX_COUNT = 10;
    private LocalTime beginTime;
    private LocalTime endTime;
    private String name;
    private int showsCount = 0;


    private TVShows shows[];

    public Channels (String name, TVShows[] shows) {
        this.name = name;
        this.shows = shows;

    }
    public String goingNow() {

        LocalTime currentTime = LocalTime.now();
        for (int i = 0; i < shows.length; i++ ) {
            if (currentTime.isAfter(shows[i].getBeginTime()) &&
                    currentTime.isBefore(shows[i].getEndTime())) {
                return "Сейчас на канале " + name + " показывают: " + "'"+shows[i].getName()+"'";
            }
        }
        return "Сейчас ничего нет";
    }

    public String getName() {
        return name;
    }
}





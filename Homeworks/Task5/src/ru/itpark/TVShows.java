package ru.itpark;
import java.time.LocalTime;

public class TVShows {
    private LocalTime beginTime;
    private LocalTime endTime;
    private String name;

    public TVShows (LocalTime beginTime, LocalTime endTime, String name) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}

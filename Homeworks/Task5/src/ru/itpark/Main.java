package ru.itpark;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        TVShows[] firstChannel = {
                new TVShows(LocalTime.parse("05:00"), LocalTime.parse("09:59"), "Доброе утро"),
                new TVShows(LocalTime.parse("09:00"), LocalTime.parse("11:59"), "Новости"),
                new TVShows(LocalTime.parse("11:00"), LocalTime.parse("15:00"), "Новости с субтитрами"),
                new TVShows(LocalTime.parse("15:00"), LocalTime.parse("18:59"), "Какой-нибудь сериал1"),
                new TVShows(LocalTime.parse("18:00"), LocalTime.parse("20:59"), "Время"),
                new TVShows(LocalTime.parse("20:00"), LocalTime.parse("21:59"), "Спокойной ночи"),
                new TVShows(LocalTime.parse("21:00"), LocalTime.parse("23:59"), "Какой-нибудь фильм1")
        };

        TVShows[] russia = {
                new TVShows(LocalTime.parse("05:00"), LocalTime.parse("09:59"),"Утро России"),
                new TVShows(LocalTime.parse("09:00"), LocalTime.parse("11:59"),"Вести"),
                new TVShows(LocalTime.parse("11:00"), LocalTime.parse("15:59"),"Вести. Местное время"),
                new TVShows(LocalTime.parse("15:00"), LocalTime.parse("18:59"),"Какой-нибудь сериал2"),
                new TVShows(LocalTime.parse("18:00"), LocalTime.parse("20:59"),"Андрей малахов"),
                new TVShows(LocalTime.parse("20:00"), LocalTime.parse("21:59"),"Вечерние вести"),
                new TVShows(LocalTime.parse("21:00"), LocalTime.parse("23:59"),"Какой-нибудь фильм2")
        };

        TVShows[] twoXtwo = {
                new TVShows(LocalTime.parse("06:00"), LocalTime.parse("07:59"),"Русские мультфильмы"),
                new TVShows(LocalTime.parse("07:00"), LocalTime.parse("08:59"),"Покемон"),
                new TVShows(LocalTime.parse("07:00"), LocalTime.parse("08:59"),"Покемон"),
                new TVShows(LocalTime.parse("12:00"), LocalTime.parse("13:59"),"Music"),
                new TVShows(LocalTime.parse("13:00"), LocalTime.parse("14:59"),"Кунг-фу Панда"),
                new TVShows(LocalTime.parse("15:00"), LocalTime.parse("16:59"),"Симпсоны"),
                new TVShows(LocalTime.parse("17:00"), LocalTime.parse("18:59"),"Футурама"),
                new TVShows(LocalTime.parse("19:00"), LocalTime.parse("20:59"),"Рик и Морти"),
                new TVShows(LocalTime.parse("21:00"), LocalTime.parse("23:59"),"Южный парк")
        };
        Channels[] channels = {
                new Channels("Первый", firstChannel),
                new Channels("Россия", russia),
                new Channels("2x2", twoXtwo)
        };
        TV myTV = new TV(channels);

        TVRemote myTVRemote = new TVRemote(myTV);
        myTVRemote.switchChannel();




    }
}

package com.hillel.yarychevskyi.lessons.lesson15;

public enum DrinksMachine {

    COFFEE ("КАВА"),
    TEA ("ЧАЙ"),
    LEMONADE ("ЛИМОНАД"),
    MOJITO ("МОХІТО"),
    MINERALWATER ("МІНЕРАЛЬНА ВОДА"),
    COCA_COLA ("КОКА_КОЛА");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


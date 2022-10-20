package com.hillel.yarychevskyi.lessons.lesssons15;

public enum DrinksMachine {

    coffee ("КАВА"),
    tea ("ЧАЙ"),
    lemonade ("ЛИМОНАД"),
    mojito ("МОХІТО"),
    mineralWater ("Мінеральна вода"),
    COCA_COLA ("КОКА_КОЛА");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


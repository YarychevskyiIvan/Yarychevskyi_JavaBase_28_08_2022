package com.hillel.yarychevskyi.lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        MusicStyles [] musicStyles = {
                new RockMusic("Scorpions"),
                new ClassicMusic("Mozart"),
                new PopMusic("Queen")
        };
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();

        }






        }




    }

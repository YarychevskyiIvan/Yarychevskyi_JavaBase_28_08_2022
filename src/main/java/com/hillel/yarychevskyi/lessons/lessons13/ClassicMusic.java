package com.hillel.yarychevskyi.lessons.lessons13;

public class ClassicMusic extends MusicStyles {


    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Play ClassicMusic " + name);

    }
}

package com.hillel.yarychevskyi.lessons.lesson13;

public class ClassicMusic extends MusicStyles {


    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Play ClassicMusic " + getName());

    }
}

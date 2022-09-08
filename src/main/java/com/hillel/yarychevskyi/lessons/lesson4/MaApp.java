package com.hillel.yarychevskyi.lessons.lesson4;

public class MaApp {
    public static void main(String[] args) {

        int warrior = 13;
        int archer = 24;
        int rider = 46;
        int liSoldiers = 860;
        int liWarriors = warrior * liSoldiers;
        int LiArcher = archer * liSoldiers;
        int LiRider = rider * liSoldiers;

        System.out.println(liWarriors);
        System.out.println(LiArcher);
        System.out.println(LiRider);


        double Min = liSoldiers * 1.5;


    }
}

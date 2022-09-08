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

        System.out.println( liWarriors + LiArcher + LiRider);


        double Min =  liSoldiers + (liSoldiers * 1.5) ;
        int MinWarrior = 9;
        int MinArcher = 35;
        int MinRider = 12;


        double MinSoldiersAttacks = Min * MinWarrior;
        double MinArcherAttacks = Min * MinArcher;
        double MinRiderAttacks = Min * MinRider;

        System.out.println( MinSoldiersAttacks + MinArcherAttacks + MinRiderAttacks);


    }
}

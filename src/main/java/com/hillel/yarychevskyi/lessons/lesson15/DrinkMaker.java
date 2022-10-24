package com.hillel.yarychevskyi.lessons.lesson15;

public class DrinkMaker {
    public static void makeTea(){
        System.out.println("Pleas wait. " + DrinksMachine.TEA.getTitle() + "is preparing");
        new Drink();
        System.out.println("Pleas get you " + DrinksMachine.TEA.getTitle());
    }
    public static void makeCoffee(){
        System.out.println("Pleas wait. " + DrinksMachine.COFFEE.getTitle() + "is preparing");
        new Drink();
        System.out.println("Pleas get you " + DrinksMachine.COFFEE.getTitle());
    }
    public static void makeLemonade() {
        System.out.println("Pleas wait. " + DrinksMachine.LEMONADE.getTitle() + "is preparing");
        new Drink();
        System.out.println("Pleas get you " + DrinksMachine.LEMONADE.getTitle());
    }
    public static void makeMojito(){
        System.out.println("Pleas wait. " + DrinksMachine.MOJITO.getTitle() + "is preparing");
        new Drink();
        System.out.println("Pleas get you " + DrinksMachine.MOJITO.getTitle());
    }
    public static void makeMineralWater(){
        System.out.println("Pleas wait. " + DrinksMachine.MINERALWATER.getTitle() + "is preparing");
        new Drink();
        System.out.println("Pleas get you " + DrinksMachine.MINERALWATER.getTitle());
    }
    public static void makeCOCA_COLA(){
        System.out.println("Pleas wait. " + DrinksMachine.COCA_COLA.getTitle() + "is preparing");
        new Drink();
        System.out.println("Pleas get you " + DrinksMachine.COCA_COLA.getTitle());
    }
}

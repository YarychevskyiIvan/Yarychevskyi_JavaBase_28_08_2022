package com.hillel.yarychevskyi.lessons.lessons11;

public class Burger {
    String roll;
    String meat;
    String secondMeat;
    String salad;
    String cheese;
    String mayonnaise;

    public Burger(String roll, String meat, String salad, String cheese, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.salad = salad;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер: " + this.roll + " " + this.meat + " " + this.cheese + " " + this.salad + " " + this.mayonnaise);
    }

    public Burger(String roll, String meat, String salad, String cheese) {
        this.roll = roll;
        this.meat = meat;
        this.salad = salad;
        this.cheese = cheese;
        System.out.println("Дієтичний бургер: " + this.roll + " " + this.meat + " " + this.cheese + " " + this.salad );
    }

    public Burger(String roll, String meat, String secondMeat, String salad, String cheese, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.secondMeat = secondMeat;
        this.salad = salad;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println("З подвійним м'ясом: "+ this.roll + " " + this.meat + " " + this.secondMeat + " " + this.cheese + " " + this.salad + " " + this.mayonnaise );
    }

    @Override
    public String toString() {
        return "Burger{" +
                "roll='" + roll + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", cheese='" + cheese + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}

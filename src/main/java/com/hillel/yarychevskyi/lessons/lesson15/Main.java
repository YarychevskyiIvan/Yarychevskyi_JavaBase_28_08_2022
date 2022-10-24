package com.hillel.yarychevskyi.lessons.lesson15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int total_price = 0;

    public static void main(String[] args) {
        runApp();
        System.out.println("Кількість напоїв " + Drink.counter);
        System.out.println("Загальна вартість " + total_price);
        scanner.close();

    }


    static void runApp() {

        System.out.println("Ти можеш купити" + Arrays.toString(DrinksMachine.values()));
        while (true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (getDrinkType() == null) {
                return;
            }


            switch (drinksMachine) {
                case TEA -> {
                    System.out.println("Ваш напій " + DrinksMachine.TEA.getTitle() + " готовий, його вартість " + Drinks.tea_price);
                    total_price += Drink.counter;
                    break;
                }
                case COFFEE -> {
                    System.out.println("Ваш напій " + DrinksMachine.COFFEE.getTitle() + " готовий, його вартість " + Drinks.coffee_price);
                    total_price += Drink.counter;
                    break;
                }
                case LEMONADE -> {
                    System.out.println("Ваш напій " + DrinksMachine.LEMONADE.getTitle() + " готовий, його вартість " + Drinks.lemonade_price);
                    total_price += Drink.counter;
                    break;
                }
                case MOJITO -> {
                    System.out.println("Ваш напій " + DrinksMachine.MOJITO.getTitle() + " готовий, його вартість " + Drinks.mojito_price);
                    total_price += Drink.counter;
                    break;
                }
                case MINERALWATER -> {
                    System.out.println("Ваш напій " + DrinksMachine.MINERALWATER.getTitle() + " готовий, його вартість " + Drinks.mineralWater_price);
                    total_price += Drink.counter;
                    break;
                }
                case COCA_COLA -> {
                    System.out.println("Ваш напій " + DrinksMachine.COCA_COLA.getTitle() + " готовий, його вартість " + Drinks.COCA_COLA_price);
                    total_price += Drink.counter;
                    break;
                }
            }


        }
    }


    private static DrinksMachine getDrinkType() {
            DrinksMachine[] drinksMachines = DrinksMachine.values();
            System.out.println("Будь ласка вибери напій бо нажми \"Exit\" для завершення");
            while (true) {
                String str = scanner.nextLine().toUpperCase();
                if (str.equals("Exit")) {
                    return null;
                }
                for (DrinksMachine value : drinksMachines) {
                    if (str.equals(value.toString())) {
                        return DrinksMachine.valueOf(str);
                    }
                    System.out.println("Будь ласка вибери напій з переліку" + Arrays.toString(drinksMachines));


                }
            }
        }
    }






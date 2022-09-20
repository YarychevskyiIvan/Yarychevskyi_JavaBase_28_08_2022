package com.hillel.yarychevskyi.lessons.lesson5;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter name team1");
        String team1 = scanner.nextLine();
        System.out.println("team1 = " + " " + team1);
        System.out.println("Pleas enter frag for" + " " + team1);
        int bot1 = 0;
        int bot2 = 0;
        int bot3 = 0;
        int bot4 = 0;
        int bot5 = 0;
        if (scanner.hasNextInt()) {
            bot1 = scanner.nextInt();
            bot2 = scanner.nextInt();
            bot3 = scanner.nextInt();
            bot4 = scanner.nextInt();
            bot5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Pleas try agin");
            System.exit(0);
        }

        scanner.nextLine();

        System.out.println("Pleas enter name team2");
        String team2 = scanner.nextLine();
        System.out.println("Team2 = " + " " + team2);
        System.out.println("Pleas enter frag for" + " " + team2);
        int teror1 = 0;
        int teror2 = 0;
        int teror3 = 0;
        int teror4 = 0;
        int teror5 = 0;

        if (scanner.hasNextInt()) {
            teror1 = scanner.nextInt();
            teror2 = scanner.nextInt();
            teror3 = scanner.nextInt();
            teror4 = scanner.nextInt();
            teror5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Pleas try agin");
            System.exit(0);
        }
        scanner.nextLine();
        double ourbot = ((bot1 + bot2 + bot3 + bot4 + bot5) / 5);
        System.out.println("Середнє арифметичне" + " " + "команди" + " " + team1 + " " + ourbot);
        double ourteror = ((teror1 + teror2 + teror3 + teror4 + teror5) / 5);
        System.out.println("Середнє арифметичне" + " " + "команди" + " " + team2 + " " + ourteror);
        if (ourbot > ourteror) {
            System.out.println("Перемогла команда" + " " + team1 + " " + "набарала" + " " + ourbot + " " + "очків");
        } else if (ourbot < ourteror) {
            System.out.println("Перемогла команда" + " " + team2 + " " + "набарала" + " " + ourteror + " " + "очків");
        } else {
            System.out.println("Нічія" + " " + "будь-ласка переграйте");
            scanner.close();
        }

    }
}

package com.hillel.yarychevskyi.lessons.lesson5;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter name team1");
        String team1 = scanner.nextLine();
        System.out.println("team1 = " + " " + team1);
        System.out.println("Pleas enter frag for" + " " + team1);

        int bot1 = scanner.nextInt();
        int bot2 = scanner.nextInt();
        int bot3 = scanner.nextInt();
        int bot4 = scanner.nextInt();
        int bot5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pleas enter name team2");
        String team2 = scanner.nextLine();
        System.out.println("Team2 = " + " " + team2);
        System.out.println("Pleas enter frag for" + " " + team2);

        int teror1 = scanner.nextInt();
        int teror2 = scanner.nextInt();
        int teror3 = scanner.nextInt();
        int teror4 = scanner.nextInt();
        int teror5 = scanner.nextInt();
        scanner.nextLine();
        double ourbot = ((bot1 + bot2 + bot3 + bot4 + bot5) / 5);
        System.out.println("Середнє арифметичне" + " " + "команди" + " " + team1 + " " + ourbot);
        double ourteror = ((teror1 + teror2 + teror3 + teror4 + teror5) / 5);
        System.out.println("Середнє арифметичне" + " " + "команди" + " " + team2 + " " + ourteror);
        if (ourbot > ourteror) {
            System.out.println("Перемогла команда" + " " + team1+ " " + "набарала" + " " + ourbot + " " + "очків");
        } else if (ourbot < ourteror) {
            System.out.println("Перемогла команда" + " " + team2 + " " + "набарала" + " " + ourteror+ " " + "очків");
        } else {
            System.out.println("Нічія" + " " + "будь-ласка переграйте");
            scanner.close();
        }

    }
}

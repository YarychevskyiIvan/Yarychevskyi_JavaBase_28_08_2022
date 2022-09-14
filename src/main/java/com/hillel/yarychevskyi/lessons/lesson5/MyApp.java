package com.hillel.yarychevskyi.lessons.lesson5;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter name team1");
        String Team1 = scanner.nextLine();
        System.out.println("team1 = " + " " + Team1);
        System.out.println( "Pleas enter frag for" + " " + Team1);

        int bot1 = scanner.nextInt();
        int bot2 = scanner.nextInt();
        int bot3 = scanner.nextInt();
        int bot4 = scanner.nextInt();
        int bot5 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pleas enter name team2");
        String Team2 = scanner.nextLine();
        System.out.println("Team2 = " + " " + Team2);
        System.out.println( "Pleas enter frag for" + " " + Team2);

        int teror1 = scanner.nextInt();
        int teror2 = scanner.nextInt();
        int teror3 = scanner.nextInt();
        int teror4 = scanner.nextInt();
        int teror5 = scanner.nextInt();
        scanner.nextLine();
        double OurBot = ((bot1 + bot2 + bot3 + bot4 + bot5)/5);
        System.out.println("Середнє арифметичне" + " " + "команди" + " " + Team1 + " " + OurBot);
        double OurTeror = ((teror1+teror2+teror3+teror4+teror5)/5);
        System.out.println("Середнє арифметичне" + " " + "команди" + " " + Team2 + " " + OurTeror);
        if (OurBot > OurTeror) {
            System.out.println("Перемогла команда" + " " + Team1 + " " + "набарала" + " " + OurBot + " " + "очків");
        } else if (OurBot < OurTeror) {
            System.out.println("Перемогла команда" + " " + Team2 + " " + "набарала" + " " + OurTeror + " " + "очків");
        } else {
            System.out.println("Нічія" + " " + "будь-ласка переграйте");
            scanner.close();
        }

    }
}

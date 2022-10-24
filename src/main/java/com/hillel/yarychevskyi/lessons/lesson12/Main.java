package com.hillel.yarychevskyi.lessons.lesson12;

public class Main {
    public static void main(String[] args) {

        Tracker tracker = new Tracker("Oleg", 25, 7,1994, "Olegz@gmail.com", "0671739001","Lomazhyk", 95.4, 80, 5000);
        tracker.printAccountInfo();
        tracker.setSteps(5550);
        tracker.printAccountInfo();
        tracker.setSurname("Verba");
        tracker.getBirthYear();
        tracker.printAccountInfo();
        System.out.println();
        Tracker tracker1 = new Tracker("Roman",5,9, 1989,"Roman@gmail.com", "80971214563","Kovalenko", 101,75,1233);
        tracker1.printAccountInfo();
        tracker1.setSteps(2541);
        tracker1.printAccountInfo();
        System.out.println();
        Tracker tracker2 = new Tracker("Viktor", 25,10,1984, "Vikorr@gmail.com", "0631456987", "Radchenko", 89.4,65,7899);
        tracker2.printAccountInfo();
        tracker2.setWeight(96.8);
        tracker2.printAccountInfo();
    }

}

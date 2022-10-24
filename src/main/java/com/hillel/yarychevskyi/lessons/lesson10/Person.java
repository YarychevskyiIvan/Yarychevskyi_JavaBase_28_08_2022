package com.hillel.yarychevskyi.lessons.lesson10;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Dwayne", "Johnson", "California", "12312412412"));
        System.out.println(personInfo("Adam", "Sandler", "Brooklyn", "37742123513"));


    }

    static String personInfo(String name, String surname, String city, String phone) {
        String str = "Зателефонувати громадянину " + " " + name + " " + surname + " із міста " + city + " можна за номером " + phone;
        return str;
    }
}

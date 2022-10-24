package com.hillel.yarychevskyi.lessons.lesson12;

public class Tracker {
    private final String name;
    private final int  birthDay;
    private final int birthMount;
    private final int birthYear;
    private final String email;
    private final String phoneNumber;
    private String surname;
    private  double weight;
    private double pressure;
    private double steps;
    private int age;

    public Tracker(String name, int birthDay, int birthMount, int birthYear, String email, String phoneNumber, String surname, double weight, double pressure, double steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMount = birthMount;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;


        age = 2020 - birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMount() {
        return birthMount;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setSteps(double steps) {
        this.steps = steps;
    }
public void printAccountInfo() {
    System.out.println (
            "name='" + name + '\'' +
            ", birthDay=" + birthDay +
            ", birthMount=" + birthMount +
            ", birthYear=" + birthYear +
            ", email='" + email + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", surname='" + surname + '\'' +
            ", weight=" + weight +
            ", pressure=" + pressure +
            ", steps=" + steps +
            ", age=" + age
            );
}


}





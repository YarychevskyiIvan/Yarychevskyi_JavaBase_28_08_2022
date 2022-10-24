package com.hillel.yarychevskyi.lessons.lesson14;

public class iPhones extends IOS implements Smartphones {
    @Override
    public void call() {
        System.out.println("Call from iPhone");

    }

    @Override
    public void sms() {
        System.out.println("Write sms from iPhone");

    }

    @Override
    public void internet() {
        System.out.println("Go to the internet from iPhone");

    }

    @Override
    void iOS() {
        System.out.println("Iphone");
    }
}

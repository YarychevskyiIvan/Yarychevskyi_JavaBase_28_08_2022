package com.hillel.yarychevskyi.lessons.lessons14;

public class Androids extends LinuxOS implements Smartphones {
    @Override
    public void call() {
        System.out.println("Call from android");
    }

    @Override
    public void sms() {
        System.out.println("Write sms from android");

    }

    @Override
    public void internet() {
        System.out.println("Go to the internet from android");

    }

    @Override
    void LinuxOS() {
        System.out.println("Android");

    }
}


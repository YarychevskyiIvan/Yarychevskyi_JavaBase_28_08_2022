package com.hillel.yarychevskyi.lessons.lesson9;

import java.util.Scanner;

public class probne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true){
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
                break;
            }  else {
                System.out.println("wrong");
                scanner.nextLine();
            }
        }
    }
}

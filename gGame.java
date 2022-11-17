package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class gGame {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        Random random = new Random();

        System.out.println("   _  ____\n" +
                "  (_)/ ___|_   _  ___  ___ ___\n" +
                "  | | |  _| | | |/ _ \\/ __/ __|\n" +
                "  | | |_| | |_| |  __/\\__ \\__ \\\n" +
                " _/ |\\____|\\__,_|\\___||___/___/\n" +
                "|__/");
        System.out.println();
        System.out.println("--> My number is less than 10!");
        System.out.println();

        int number = random.nextInt(10);
        int userNumber = 15052004;

        while(userNumber != number){
            System.out.print("My number is => ");
            userNumber = input.nextInt();
            if (userNumber<number){
                System.out.println("My number is bigger! ");
                System.out.println();
            }else if(userNumber>number) {
                System.out.println("My number is smaller!");
                System.out.println();
            }else{
                System.out.println("  ____                            _       _\n" +
                        " / ___|___  _ __   __ _ _ __ __ _| |_ ___| |\n" +
                        "| |   / _ \\| '_ \\ / _` | '__/ _` | __/ __| |\n" +
                        "| |__| (_) | | | | (_| | | | (_| | |_\\__ \\_|\n" +
                        " \\____\\___/|_| |_|\\__, |_|  \\__,_|\\__|___(_)\n" +
                        "                  |___/");
                System.out.println();
            }
        }
    }
}

package com.javaprogramming;
import java.util.Scanner;

public class BAsic {

    public static void guessing_game() {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;

        do {
            System.out.println("Guess my number: ");
            usernumber = sc.nextInt();

            if (usernumber == mynumber) {
                System.out.println("CORRECT!!! Good Job");
                break;
            } else if (usernumber > mynumber) {
                System.out.println("Your number is large");
            } else {
                System.out.println("Your number is small");

            }
        }while(usernumber >= 0);
            System.out.print("My number was:");
            System.out.println(mynumber);
    }
    public static void main(String[] args){
            // write your code here
        guessing_game();
        }
}

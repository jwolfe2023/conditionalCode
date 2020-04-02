package lickingheights.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter \"Yes\" For Hello or \"No\" For Goodbye! ");

        String answer = keyboard.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            printHello();
        } else if (answer.equalsIgnoreCase("no")) {
            printGoodbye();
        } else {
            System.out.println("You did not follow directions");
        }
    }

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printGoodbye(){
        System.out.println("Goodbye");
    }
}

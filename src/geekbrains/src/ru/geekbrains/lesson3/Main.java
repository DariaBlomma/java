package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your task is to guess the number");
        int range = 10;
        int number = (int) (Math.random() * range);
        while(true){
            System.out.println("Guess the number from 0 to " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("You guessed");
                break;
            } else if (input_number > number) {
                System.out.println("The original number is smaller");
            } else {
                System.out.println("The original number is biggerr");
            }
        }
        scanner.close();
    }
}

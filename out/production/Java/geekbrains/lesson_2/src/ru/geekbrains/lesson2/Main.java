package ru.geekbrains.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Enter the name of the operation");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3){
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("the result is " + result);
    }
}

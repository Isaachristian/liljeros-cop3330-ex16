package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        System.out.println(scanner.nextInt() >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

    }
}

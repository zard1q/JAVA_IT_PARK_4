package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        Parser parser = Parser.getInstance(input);
        parser.parseString();
	// write your code here
    }
}

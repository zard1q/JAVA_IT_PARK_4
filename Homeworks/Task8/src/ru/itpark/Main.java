package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        Parser parser = Parser.builder()
                .addObserver(new Splitter())
                .addObserver(new LetterObserver())
                .addObserver(new SpaceObserver())
                .addObserver(new DigitObserver())
                .build();
        parser.inputString(input);

	}
}

package com.corionsoftware.tests;

import java.util.Scanner;

public class Test1 {

    private final int days;
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Test1() {
        this.days = 7;
        this.hours = 24;
        this.minutes = 60;
        this.seconds = 60;
    }

    public void query() {
        System.out.println("Test1: Bitte gebe einen Integer-Datenwert als Wochenanzahl ein!");
        Scanner scanner = new Scanner(System.in);
        this.calculate(scanner.nextInt());
    }

    public void calculate(int weeks) {
        int daysAmount = weeks * days;
        int hoursAmount = daysAmount * hours;
        int minutesAmount = hoursAmount * minutes;
        int secondsAmount = minutesAmount * seconds;
        System.out.println("Eingabe > " + weeks + " Wochen");
        System.out.println("Ausgabe > " + secondsAmount + " Sekunden");
    }

}

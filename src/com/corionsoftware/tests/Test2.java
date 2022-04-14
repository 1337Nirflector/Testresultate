package com.corionsoftware.tests;

import java.util.Scanner;

public class Test2 {

    private final int monthsAmount;

    public Test2() {
        this.monthsAmount = 3;
    }

    public void query() {
        System.out.println("Test 2: Bitte gebe einen Integer-Datenwert als Betrag ein!");
        Scanner scanner = new Scanner(System.in);
        calculate(scanner.nextInt());
    }

    public void calculate(int amount) {
        for (int i = 1; i <= monthsAmount; i++) {
            amount -= amount * 0.1;
        }
        System.out.println(amount);
    }

}

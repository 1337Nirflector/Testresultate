package com.corionsoftware.tests;

import java.util.Scanner;

public class Test5 {

    private final int index;

    public Test5() {
        this.index = 0;
    }

    public void query() {
        System.out.println("Test 5: Bitte gebe eine Zahl als Integer-Datenwert ein!");
        Scanner scanner = new Scanner(System.in);
        doIt(scanner.nextLine());
    }

    public void doIt(String... args) {
        try {
            String input = new Scanner(System.in).nextLine();
            long n = Long.parseLong(input.trim());
            System.out.print(n + " => "+ this.convert(n));
        } catch (Exception e) {
            System.out.println("Eingabe inkorrekt.");
        }
    }

    public static String convert(long n) {
        String words = "", pf= "";
        int index = 0;
        if (n==0) return "zero";
        if( n<0) {
            n=-n;
            pf = "minus";
        }
        do {
            long i = n % 1000;
            if(i!=0) words = convertTo1000((int)i) + bigNumbers[index] +words;
            index++;
            n /= 1000;
        } while(n > 0);
        return (pf + words).trim();
    }

    public static String convertTo1000(int n) {
        String words;
        if(n % 100 < 20){
            words = toTwenty[n%100];
            n /= 100;
        } else {
            words = toTwenty[n%10];
            n /= 10;
            words = tens[n%10] + words;
            n /= 10;
        }
        if (n==0) return words;
        return toTwenty[n] + " hundred" + words;
    }

    public static String[] toTwenty = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine",
            " ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
    public static String[] tens = {""," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
    public static String[] bigNumbers ={""," thousand"," million"," billion"," trillion"," quadrillion"," quintillion"};

}

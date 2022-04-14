package com.corionsoftware;

import com.corionsoftware.tests.*;

import java.util.Scanner;

public class Main {

    public static Test1 test1 = new Test1();
    public static Test2 test2 = new Test2();
    public static Test3 test3 = new Test3();
    public static Test4 test4 = new Test4();
    public static Test5 test5 = new Test5();

    public static void main(String[] args) {
        System.out.println("Test1 - für Test 1");
        System.out.println("Test2 - für Test 2");
        System.out.println("Test3 - für Test 3");
        System.out.println("Test4 - für Test 4");
        System.out.println("Test5 - für Test 5");
        Scanner testCaseQuery = new Scanner(System.in);
        switch (testCaseQuery.nextLine()) {
            case "Test1" -> test1.query();
            case "Test2" -> test2.query();
            case "Test3" -> test3.query();
            case "Test4" -> test4.perform();
            case "Test5" -> test5.query();
        }
    }
}

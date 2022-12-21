package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run1();

    }

    private void run1() {
        int nBox = 3;
        int apples = 12345678;
        System.out.printf("In box # %d are %d apples",nBox,apples);
    }

    private void run() {
        System.out.println("Hello world!");
    }
}
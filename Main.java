package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(Factorial.getRowOfFactorials(n));
            System.out.println(Factorial.calculateFactorial(n));
            sc.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
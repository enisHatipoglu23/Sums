package com.company;

import java.util.Scanner;

public class Sums {
    int a,b;
    Scanner scanner = new Scanner(System.in);
    public int sum(){
        System.out.println("First number: ");
        a = scanner.nextInt();
        System.out.println("Second number: ");
        b = scanner.nextInt();
        System.out.println(a + " " + b);
        System.out.println(a + b);
        return a+b;
    }
}

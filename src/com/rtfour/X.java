package com.rtfour;

import java.util.Scanner;

public class X {
    private static int x;

    public X() {
        System.out.println("Please enter number for table: ");
        this.x = new Scanner(System.in).nextInt();
    }

    public static int x() {
        return x;
    }
}

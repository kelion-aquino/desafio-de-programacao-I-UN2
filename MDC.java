package com.company;

import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("mdc(" + num1 + ", " + num2 + ") = " + mdcRecursivo(num1, num2));
    }

    private static int mdcRecursivo (int a, int b) {
        if(b == 0) return a;
        return mdcRecursivo(b, a % b);
    }
}

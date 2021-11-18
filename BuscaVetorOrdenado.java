package com.company;

import java.util.Scanner;

public class BuscaVetorOrdenado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = {1, 3, 6, 10};
        int n = vetor.length;
        int x = sc.nextInt();

        System.out.println(iterativo(vetor, n, x) + " " + recursivo(vetor, n, x));
    }

    private static int iterativo(int[] A, int n, int x) {
        int j = 1;
        while (j <= n && A[j] < x) {
            j += 1;
        }
        return j;
    }

    private static int recursivo(int[] A, int n, int x) {
        if(n == 0) {
            return  0;
        } else if (A[n] < x) {
            return n;
        } else {
            return recursivo(A, n - 1, x);
        }
    }
}

package com.example.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

 class Comparator {
    public boolean compare(int a, int b) {
        return a == b;
    }

    public boolean compare(String a, String b) {
        return a.equals(b);
    }

    public boolean compare(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Comparator comparator = new Comparator();

        for (int i = 0; i < t; i++) {
            int type = scanner.nextInt();
            if (type == 1) {
                String a = scanner.next();
                String b = scanner.next();
                System.out.println(comparator.compare(a, b));
            } else if (type == 2) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(comparator.compare(a, b));
            } else if (type == 3) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                int[] a = new int[n];
                int[] b = new int[m];
                for (int j = 0; j < m; j++){
                    a[j] = scanner.nextInt();
                }
                System.out.println(comparator.compare(a, b));
            }
        }
    }
}

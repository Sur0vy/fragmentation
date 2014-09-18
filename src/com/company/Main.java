package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_NUMBER = 150;
        System.out.print("Enter \"n\" and \"k\":");
        Scanner in = new Scanner(System.in);
        int n;
        int k;
        try {
            n = in.nextInt();
            k = in.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid values!");
            n = 0;
            k = 0;
        }
        if ((n > 0) && (k > 0)) {
            if ((n > MAX_NUMBER) || (k > MAX_NUMBER)) {
                System.out.println("Input values can't be bigger than " + MAX_NUMBER);
            } else {
                int cnt = FragmentationCount.split(n, k);
                System.out.println("Fragmentation count = " + cnt);
            }
        }
    }
}

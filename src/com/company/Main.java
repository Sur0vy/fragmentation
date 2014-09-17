package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_NUMBER = 150;
        System.out.print("Enter \"n\" and \"k\":");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if ((n > MAX_NUMBER) || (k > MAX_NUMBER)){
            System.out.println("Input values can't be bigger than " + MAX_NUMBER);
        } else {
            int cnt = FragmentationCount.split(n, k);
            System.out.println("Fragmentation count = " + cnt);
        }
    }
}

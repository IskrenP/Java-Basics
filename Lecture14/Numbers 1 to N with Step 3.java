package com.company;
import java.util.Scanner;

public class Lekciq2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);

        }
    }
}
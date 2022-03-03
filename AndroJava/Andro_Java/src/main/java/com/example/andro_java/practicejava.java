package com.example.andro_java;

public class practicejava {
    public static void main(String[] args) {
        int a=6;
        for (int i = 0; i <11 ; i++) {
            int b=a*i;
            System.out.println(a+"x"+i+"="+ b);
        }
        for (int i = 0; i < a ; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

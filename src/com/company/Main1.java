package com.company;

public class Main1 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
            System.out.print(array[i]);
        }
        System.out.print(" ");

        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                array[j] = 0;
            }
            System.out.print(array[j]);


        }
    }
}
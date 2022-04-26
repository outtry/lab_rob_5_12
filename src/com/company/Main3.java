package com.company;

public class Main3 {
    public static void main(String[] args) {
        int array_1[] = new int[10];
        for(int i = 0; i < 10; i++){
            array_1[i] = (int) Math.round(Math.random()* 10);
            System.out.print(array_1[i]);
        }
        System.out.print(" ");

        int array_2[] = new int[10];
        for(int i = 0; i < 10; i++){
            array_2[i] = (int) Math.round(Math.random()* 10);
            System.out.print(array_2[i]);
        }
        System.out.println();
        int array_3[] = new int[10];
        for(int i = 0; i < 10; i++){
            array_3[i] =  array_1[i] + array_2[i];
            System.out.print(array_3[i] + " ");
        }

    }
}
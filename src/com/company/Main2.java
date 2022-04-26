package com.company;

public class Main2 {
    public static void main(String[] args) {
        double sered_1 = 0, sered_2 = 0, sered_3 = 0;
        int array[] = new int[5];
        for (int a = 0; a < 5; a++) {
            array[a] = (int) Math.round(Math.random() * 5);
            System.out.print(array[a] + " ");
            sered_1 = sered_1 + array[a];

        }
        System.out.println("  " + sered_1 / 5);
        int array_2[] = new int[5];
        for (int b = 0; b < 5; b++) {
            array_2[b] = (int) Math.round(Math.random() * 5);
            System.out.print(array_2[b] + " ");
            sered_2 = sered_2 + array_2[b];
        }
        System.out.println("  " + sered_2 / 5);
        int array_3[] = new int[5];
        for (int c = 0; c < 5; c++) {
            array_3[c] = (int) Math.round(Math.random() * 5);
            System.out.print(array[c] + " ");
            sered_3 = sered_3 + array_3[c];
        }
        System.out.println("  " + sered_3 / 5);

        System.out.println(Math.max(sered_1 / 5 , Math.max(sered_2 / 5, sered_3 / 5)));

        if(sered_1 == sered_2 && sered_1 == 3 && sered_2 == sered_3){
            System.out.println("Середні арефматичні значення є рівними ");
        }

    }
}

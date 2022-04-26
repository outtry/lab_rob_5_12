package com.company;

public class Main5 {
    public static void main(String[] args) {
        int[][]t_array = new int[15][];
        t_array[0] = new int [5];
        t_array[1] = new int [5];
        t_array[2] = new int [5];
        t_array[3] = new int [5];

        t_array[4] = new int [8];
        t_array[5] = new int [8];
        t_array[6] = new int [8];
        t_array[7] = new int [8];

        t_array[8] = new int [3];
        t_array[9] = new int [3];
        t_array[10] = new int [3];
        t_array[11] = new int [3];

        t_array[12] = new int [9];
        t_array[13] = new int [9];
        t_array[14] = new int [9];

        for(int i = 0;i < t_array.length; i++){
            for(int j = 0; j< t_array[i].length; j++){
                t_array[i][j] = (int) Math.round(Math.random()*15);
                System.out.println(t_array[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
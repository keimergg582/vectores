package com.mycompany.metodos_de_organizacion;

import java.util.Arrays;

public class insertionsort {
    public static void insertionsort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Insertion Sort: " + Arrays.toString(arr));
    }
}

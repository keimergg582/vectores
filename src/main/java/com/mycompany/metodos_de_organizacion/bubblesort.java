package com.mycompany.metodos_de_organizacion;

import java.util.Arrays;

public class bubblesort {
    public static void bubblesort(int[] arr){
            for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
    }
}
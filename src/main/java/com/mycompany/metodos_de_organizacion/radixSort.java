/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos_de_organizacion;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class radixSort {
        public static void radixSort(int[] arr) {
        int max = getMax(arr);

        for(int exp = 1; max/exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }

        System.out.println("Radix Sort: " + Arrays.toString(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i = 0; i < n; i++)
            count[(arr[i]/exp)%10]++;

        for(int i = 1; i < 10; i++)
            count[i] += count[i-1];

        for(int i = n-1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodos_de_organizacion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Metodos_de_organizacion {
    
    
    public static void main(String[] args) {
        bubblesort B =new bubblesort();
        insertionsort I = new insertionsort();
        mergeSort M = new mergeSort();
        quickSort Q = new quickSort();
        radixSort R = new radixSort();
        int X[] = {5, 3, 8, 4, 2};
         System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(X));
        System.out.println();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("precione un numero del 1 al 5 para usar algun metodo \n1. bubblesort\n2. insertionSort\n3.quickSort\n4. radixSort\n5. mergeSort"));
        switch(opcion){
            case 1:
                B.bubblesort(X);
            case 2:
                I.insertionsort(X);
            case 3:
                Q.quickSort(X, 0, X.length - 1);
            case 4:
                R.radixSort(X);
            case 5:
                M.mergeSort(X, 0, X.length-1);
            default:
                System.out.println("opcion invalida");
        }
    }
}

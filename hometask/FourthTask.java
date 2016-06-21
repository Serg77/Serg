/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class FourthTask {

//    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int array[] = new int[6];
        array(array);

        sort(array);

        chetnechet(array);

        summa(array);
     
        multiply(array);

    }

    private static void chetnechet(int[] array) {
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
//                System.out.print("");
            } else if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void array(int array[]) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    private static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
        }
        System.out.print(Arrays.toString(array) + "\t");

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println();
        System.out.print(Arrays.toString(array) + "\t" + "\n");

    }

       
    private static void multiply(int[] array) {
        int multiply = 0;
        for (int i : array) {
            if (i % 3 == 0) {
                multiply *= i;
            }
        }
        System.out.print(multiply);
    }

    private static void summa(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}

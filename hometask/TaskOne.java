/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask;

/**
 *
 * @author Родители
 */
public class TaskOne {

    public static void main(String[] args) {
        int x;
        int sum2 = 0;
        int sum3 = 0;
        int sum5 = 0;
        int sum7 = 0;
        int sum;
        for (x = 0; x < 100; x++) {
//            System.out.println("x = " + x);
            if (x % 2 == 0) {
                System.out.println("кратное 2 = " + x);
                sum2 += x;
            } else if (x % 3 == 0) {
                System.out.println("кратное 3 = " + x);
                sum3 += x;
            } else if (x % 5 == 0) {
                System.out.println("кратное 5 = " + x);
                sum5 += x;
            } else if (x % 7 == 0) {
                System.out.println("кратное 7 = " + x);
                sum7 += x;
            }
            if (x % 5 > x % 3) {
                System.out.println("Больше");
            } else {
                System.out.println("меньше");
            }
        }

        System.out.println("Сумма кратно 2 = " + sum2);
        System.out.println("Сумма кратно 3 = " + sum3);
        System.out.println("Сумма кратно 5 = " + sum5);
        System.out.println("Сумма кратно 7 = " + sum7);
     
        sum = sum2 - sum7;
        System.out.println(sum);
    }
}

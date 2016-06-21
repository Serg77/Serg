/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class SecondTask {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(99);
            switch (i) {
                case 0:
                    String str = Integer.toString(n);
                    System.out.println(str);
                    break;
                case 1:
                    String str_1 = Integer.toString(n);
                    System.out.println(str_1);
                    break;
                case 2:
                    String str_2 = Integer.toString(n);
                    System.out.println(str_2);
                    break;
                case 3:
                    String str_3 = Integer.toString(n);
                    System.out.println(str_3);
                    break;

                default:
            }

        }

    }
}

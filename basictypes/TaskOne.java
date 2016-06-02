/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes;

/**
 *
 * @author Родители
 */
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println("Здравствуй мир!");

        text();

        inputText();
    }

    private static void inputText() {
        Scanner in = new Scanner(System.in);
        System.out.print("ФИО: ");
        String name = in.nextLine();
        System.out.print("Номер группы: ");
        String group = in.nextLine();
//        int number = in.nextInt();
        System.out.println("Время занятий: ");
        String days = in.nextLine();
        double time = in.nextDouble();

//        String str1 = "ФИО:";
//        String str2 = "Булычёв С.А";
//        String str3 = str1 + " " + str2;
//        System.out.println(str3);
//        String str4 = "Номер группы:";
//        String str5 = "jv" + 1605;
//        String str6 = str4 + " " + str5;
//        System.out.println(str6);
//        String str7 = "Время занятий:";
//        double t = 19.05;
//        String str8 = "Понедельник";
//        String str9 = "Пятница";
//        String str10 = str7 + " " + str8 + " " + t + ";\n" + str9 + " " + t;
//        System.out.println(str10);
    }

    private static void text() {
        String c = "Південна Америка багата на озера.\n"
                + " Найбільше озеро цього материка - Маракайбо.\n"
                + " Найбільше високогірне озеро,\n"
                + " розташоване в Андах, - Тітікака.";
        System.out.println(c);
    }

}

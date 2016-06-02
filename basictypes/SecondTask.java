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
public class SecondTask {

    public static void main(String[] args) {
        circleRing();
        triangle();
        rectangle();

    }

    private static void circleRing() {
        double pi, r, l;
        float a, s;
        byte t;
        r = 3.8;
        pi = 3.1416;
        t = 6;
        l = 2 * pi * r; //длина круга
        a = (float) (pi * r * r); //площадь круга
        s = (float) (pi * (t * t - r * r)); //площадь кольца
        System.out.println("Длина окружности = " + l);
        System.out.println("Площадь окружности = " + a);
        System.out.println("Площадь кольца = " + s);
    }

    private static void triangle() {
        float a, b, c, h;
        double p, s;
        a = 5.28f;
        b = a;
        c = b;
        h = (float) ((Math.sqrt(3) / 2) * a);
        p = a + b + c;
        s = (a * h) / 2;
        System.out.println("Периметр треугольника = " + p);
        System.out.println("Площадь треугольника = " + s);
    }

    private static void rectangle() {
        short a, b;
        int s, p;
        a = 7;
        b = 10;
        s = a * b;
        p = 2 * (a + b);
        System.out.println("Площадь прямоугольника = " + s);
        System.out.println("Периметр прямоугольника = " + p);
    }

}

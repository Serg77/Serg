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
public class ThirdTask {

    public static void main(String[] args) {
        double pi;
        pi = 3.1416;
        int r, h;
        r = 3;
        h = 8;
        cylinder(pi, r, h);

        double r2;
        r2 = 1.3;
        hollowCylinder(pi, r, r2, h);

        ball();

        rectangular_parallelepiped();

        tetrahedron();

    }

    private static void cylinder(double pi, int r, int h) {
        double v, s;
        v = pi * r * r * h;
        s = 2 * pi * r * h;
        System.out.println("объем цилиндра =" + v);
        System.out.println("площадь боковой поверхности цилиндра =" + s);

    }

    private static void hollowCylinder(double pi, int r, double r2, int h) {
        double v;
        if (r > r2) {
            v = pi * h * (r * r - r2 * r2);
            System.out.print("объем полого цилиндра =");
            System.out.println(v);
        }

    }

    private static void ball() {
        double pi = 3.1416;
        int r = 12;
        double s, v;
        s = 4 * pi * r * r;
        v = 4 * pi * Math.pow(12, 3) / 3;
        System.out.println("объем шара =" + v);
        System.out.println("площадь поверхности шара =" + s);
    }

    private static void rectangular_parallelepiped() {
        float a = 3.05f;
        int b, c;
        b = 4;
        c = 6;
        double s, v;
        v = a * b * c;
        s = 2 * (a * b + b * c + a * c);
        System.out.println("площадь прямоугольного параллепипида =" + s);
        System.out.println("объем прямоугольного параллепипида =" + v);
    }

    private static void tetrahedron() {
        float a, b, c, h;
        double v, s, h2, s2;
        a = 5.28f;
        b = a;
        c = b;
        h = (float) ((Math.sqrt(3) / 2) * a);
        h2 = 4.3111;
        System.out.println(h2);
        s = (a * h) / 2;
//        s2 = a * a * Math.sqrt(3);
        s2 = 4*s;
        v = s2 * h2 / 3;
        System.out.println("объем =" +v);
        System.out.println("площадь =" +s2);

    }

}

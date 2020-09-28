package ru.itmo.practice2;

import java.util.Random;

public class Vect {
    private double x = 0;
    private double y = 0;
    private double z = 0;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vect(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vect() {
        double rangeMax = 10;
        double rangeMin = 0;
        Random r = new Random();
        this.x = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        this.y = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        this.z = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
    }

    public double length() {
        double x = this.getX(), y = this.getY(), z = this.getZ();
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static double dotProductOfVs(Vect v1, Vect v2) {
        double x1 = v1.getX(), y1 = v1.getY(), z1 = v1.getZ();
        double x2 = v2.getX(), y2 = v2.getY(), z2 = v2.getZ();
        return x1*x2 + y1*y2 + z1*z2;
    }

    public static Vect vectorMulOfVs(Vect v1, Vect v2) {
        double x1 = v1.getX(), y1 = v1.getY(), z1 = v1.getZ();
        double x2 = v2.getX(), y2 = v2.getY(), z2 = v2.getZ();
        return new Vect(y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2);
    }

    public static double cosOfVs(Vect v1, Vect v2) {
        return Vect.dotProductOfVs(v1, v2) / (v1.length() * v2.length());
    }

    public static Vect sumOfVs(Vect v1, Vect v2) {
        double x1 = v1.getX(), y1 = v1.getY(), z1 = v1.getZ();
        double x2 = v2.getX(), y2 = v2.getY(), z2 = v2.getZ();
        return new Vect(x1 + x2, y1 + y2, z1 + z2);
    }

    public static Vect subOfVs(Vect v1, Vect v2) {
        double x1 = v1.getX(), y1 = v1.getY(), z1 = v1.getZ();
        double x2 = v2.getX(), y2 = v2.getY(), z2 = v2.getZ();
        return new Vect(x1 - x2, y1 - y2, z1 - z2);
    }

    public static Vect[] genArrayVs(int N) {
        Vect[] res = new Vect[N];
        for (int i = 0; i < N; i++) {
            res[i] = new Vect();
        }
        return res;
    }
}

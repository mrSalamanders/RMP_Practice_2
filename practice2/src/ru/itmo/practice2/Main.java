package ru.itmo.practice2;

public class Main {

    public static void main(String[] args) {
		Vect V1 = new Vect(1, 2, 2);
		showVector("V1", V1);
		Vect V2 = new Vect();
		showVector("V2", V2);
		System.out.println("|V1| = " + V1.length());
		System.out.println("|V2| = " + V2.length());
		System.out.println("V1 * V2 = " + Vect.dotProductOfVs(V1, V2));
		System.out.println("V1 x V2 = V3");
		showVector("V3", Vect.vectorMulOfVs(V1, V2));
		System.out.println("Cos V1^V2 = " + Vect.cosOfVs(V1, V2));
		System.out.println("V1 + V2 = V4");
		showVector("V4", Vect.sumOfVs(V1, V2));
		System.out.println("V1 - V2 = V5");
		showVector("V5", Vect.subOfVs(V1, V2));
		Vect[] a = Vect.genArrayVs(4);
		System.out.println("Generate some vectors");
		for (int i = 0; i < a.length; i++) {
			showVector("V" + (i + 6) + "", a[i]);
		}
    }
    public static void showVector(String name, Vect v) {
		System.out.println(name + ": x = " + v.getX() + " y = " + v.getY() + " z = " + v.getZ());
	}
}

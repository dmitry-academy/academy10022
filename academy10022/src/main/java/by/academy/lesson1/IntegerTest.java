package by.academy.lesson1;

public class IntegerTest {

	public static void main(String... args) {
//		Integer i1 = 1000;
//		Integer i2 = 1000;
//		System.out.println(i1 == i2);
//		Integer i3 = 100;
//		Integer i4 = 100;
//		System.out.println(i3 == i4);
//		Integer i5 = 1000;
//		int i6 = 1000;
//		System.out.println(i5 == i6);
//		Integer i7 = 100;
//		int i8 = 100;
//		System.out.println(i7 == i8);
        int i = 2;
        int a = 1;
        int itog;
        do {
            itog = (int) Math.pow(i,a);
            a++;
            System.out.println(itog);
        }
        while (itog<1_000_000);
	}
}

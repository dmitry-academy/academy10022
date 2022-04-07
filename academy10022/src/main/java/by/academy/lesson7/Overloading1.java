package by.academy.lesson7;

import java.util.Arrays;

public class Overloading1 {

	void test(int a) {
		System.out.println("int a: " + a);
	}

	void test(double a) {
		System.out.println("double a: " + a);
	}

	void test(int a, double b) {
		Box box = new Box();
		this.test(a);
		int c = 0;
		System.out.println("a и b: " + a + " " + b);
		System.out.println("Int + Double");
	}

	int test(double a, int b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("Double + Int");
		return 1;
	}

	int test(char a, int b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("char + Int");
		return 1;
	}

	void test(int a, int b, String s) {
		System.out.println("a и b: " + a + " " + b);
	}

	void test(String... strings) {
		strings[0] = "sdasd";
		System.out.println("Начало выполнения test(String... s)");
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println("Конец выполнения test(String... s)");
	}

	public static void main(String... args) {
		Overloading1 ob = new Overloading1();
		String[] arr = new String[1];
//		ob.test(10);
//		ob.test(10.0);
		ob.test(arr);
//		ob.test(10, 20.0);
//		ob.test(10, 20, "s");
		System.out.println(Arrays.toString(arr));
	}
}
package by.academy.lesson1;

public class Main {

	static String str;

	public static void main(String[] args) {
		int test = 1_000_000_000;
		System.out.println("Hello world!");
		System.out.println(str);

		char c1 = 97;
		System.out.println(c1);
		c1++;
		System.out.println(c1);

		byte b = 0;
		int i = 128;
		b = (byte) i;
		System.out.println(b);

		int testI = Integer.MAX_VALUE;
		System.out.println("Max integer: " + testI);
		testI++;
		System.out.println("Max integer: " + testI);

	}

}

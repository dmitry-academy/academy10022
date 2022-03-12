package by.academy.lesson3.operators;

public class Test {

	public static void main(String[] args) {

		System.out.println(1 & 1); // результат 1 - нечетное
		System.out.println(2 & 1); // результат 0 - четное

		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(2));

		// 00000000 00000000 00000000 00000010 -- 2
		// 00000000 00000000 00000000 00000001 -- 1

		System.out.println(1 % 2 == 0); // false
		System.out.println(2 % 2 == 0); // true
		System.out.println(0 % 2 == 0); // true

		System.out.println((3 + 4 + 10 + -192 + 150) / 5);
	}

}

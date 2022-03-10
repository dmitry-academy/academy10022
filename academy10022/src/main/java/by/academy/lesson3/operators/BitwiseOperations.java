package by.academy.lesson3.operators;

public class BitwiseOperations {

	public static void main(String... strings) {

		// 1. Четность числа
		System.out.println("Четность числа");
		System.out.println(5 & 1); // результат 1 - нечетное
		System.out.println(6 & 1); // результат 0 - нечетное

		// 2. Деление/умножение на 2
		System.out.println("Деление на 2");
		System.out.println(32 >> 1);
		System.out.println(32 >> 2);
		System.out.println(32 >> 3);
		System.out.println("Умножение на 2");
		System.out.println(32 << 1);
		System.out.println(32 << 2);
		System.out.println(32 << 3);

		System.out.println("Минимальный инт <<");
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE << 1));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE << 1);

		System.out.println("Минимальный инт >>");
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >> 16));
		System.out.println(Integer.MIN_VALUE >> 1);

		System.out.println("Минимальный инт >>>");
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >>> 1));

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE >> 1);

		System.out.println("Максимальный инт <<");
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE << 1));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE << 1);

		System.out.println("Максимальный инт >>");
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE >> 1));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE >> 1);
		// 3. Шифрование чисел/данных
		System.out.println("Шифрование чисел/данных");
		int publicKey = 11;
		int sensitiveInfo = 5;

		int encodedInfo = sensitiveInfo ^ publicKey;
		System.out.println(encodedInfo);

		System.out.println(encodedInfo ^ publicKey);

		// 1,2,3,4,5,6,5,4,3,2,1
		int[] arr = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		System.out.println("RESULT:");
		System.out.println(result);
		System.out.println("TEST:");
		System.out.println(4 ^ 4);
//		int j = Integer.MIN_VALUE;
//		System.out.println(Integer.toBinaryString(j));
//		for (int i = 0; i < 16; i++) {
//			j >>>= 1;
//			System.out.println(Integer.toBinaryString(j));
//		}

	}
}

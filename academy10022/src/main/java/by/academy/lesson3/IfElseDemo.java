package by.academy.lesson3;

public class IfElseDemo {

	public static void main(String[] args) {
		int i = 3;

//		if (i < 4) {
//			System.out.println("Привет-привет");
//		} else {
//			System.out.println("Пока-пока!");
//		}
//
//		System.out.println(i < 4 ? "Привет-привет" : "Пока-пока!");
//
		if (i < 4) {
			System.out.println("Число меньше 4");
		} else if (i < 5) {
			System.out.println("Число меньше 5");
		} else if (i < 6) {
			System.out.println("Число меньше 6");
		} else {
			System.out.println("Hello there!");
		}
	}

}

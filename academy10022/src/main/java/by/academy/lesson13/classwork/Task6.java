package by.academy.lesson13.classwork;

import by.academy.lesson9.generics.classwork.Cat;

public class Task6 {
//	6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). 
//		Класс содержит три переменные типа (T, V, K), конструктор, 
//		принимающий на вход параметры типа (T, V, K), 
//		методы возвращающие значения трех переменных. 
//		Создать метод, выводящий на консоль имена классов для трех переменных класса.
//
//	б) Наложить ограничения на параметры типа: 
//		T должен реализовать интерфейс Comparable (классы-оболочки, String), 
//		V должен реализовать интерфейс Serializable и расширять класс Animal, 
//		K должен расширять класс Number.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threeneric<String, Cat, Number> obj = new Threeneric<>("Hello", new Cat(), 90);
	}

}

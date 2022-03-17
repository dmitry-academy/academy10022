package by.academy.lesson5.classwork;

import by.academy.lesson5.packages.sub1.Car;

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.run();

		new by.academy.lesson5.packages.sub2.Car car2 = new by.academy.lesson5.packages.sub2.Car();
		car2.run();
	}
}

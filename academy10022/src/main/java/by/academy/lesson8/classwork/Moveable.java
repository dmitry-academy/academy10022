package by.academy.lesson8.classwork;

public interface Moveable {

	default void start() {
		System.out.println("Moveable default method start");
	}
	default void stop() {
		System.out.println("Moveable default method stop");
	}
}

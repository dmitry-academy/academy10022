package by.academy.lesson8.classwork;

public class Robot implements Flyable, Moveable{

	@Override
	public void start() {
		Flyable.super.start();
		Moveable.super.start();
	}

	@Override
	public void stop() {
		Flyable.super.stop();
		Moveable.super.stop();
	}

}

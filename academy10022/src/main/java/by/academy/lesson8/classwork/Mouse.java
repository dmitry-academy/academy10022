package by.academy.lesson8.classwork;

public interface Mouse {

	String COLOR = "red";

	void clickRigt();

	void clickLeft();

	void scrollUp();

	void scrollDown();

	default void eatCheese() {
		System.out.println("Im eating cheese");
	}
}

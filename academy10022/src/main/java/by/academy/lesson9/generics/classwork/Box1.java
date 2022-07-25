package by.academy.lesson9.generics.classwork;

public class Box1<T> {

	private T[] items;

	public Box1() {
		super();
		this.items = (T[]) new Object[10];
	}

	public Box1(T[] items) {
		super();
		this.items = items;
	}

	public T[] getItems() {
		return items;
	}

	public void setItem(T[] items) {
		this.items = items;
	}

}

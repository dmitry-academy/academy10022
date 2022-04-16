package by.academy.lesson9.generics.classwork;

public class BoxNumber<T extends Number> {

	private T[] items;

	private T item;

	public BoxNumber() {
		super();
		this.items = (T[]) new Object[10];
	}

	public BoxNumber(T[] items) {
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

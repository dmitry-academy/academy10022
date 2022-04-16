package by.academy.lesson9.generics.classwork;

public class BoxDemo {

	public static void main(String[] args) {
		Cat cat1 = new Cat();

		CatBox catBox = new CatBox(cat1);

		System.out.println(catBox.getCat());

		Box<Cat> catBox1 = new Box<>();

		System.out.println(catBox1.getItems());

		Dog dog = new Dog();

		Dog[] dogs = new Dog[10];

		Box<?>[] dogBox = new Box[10];

//		System.out.println(dogBox.getItem());
	}

}

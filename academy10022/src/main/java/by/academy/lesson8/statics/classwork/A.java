package by.academy.lesson8.statics.classwork;

public class A {

	public A() {
		super();
		System.out.println("Constructor A");
	}

	{
		System.out.println("not a static block A");
	}

	static {
		System.out.println("static block A");
	}

}

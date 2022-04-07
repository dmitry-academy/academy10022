package by.academy.lesson8.statics.classwork;

public class B extends A {

	public B() {
		super();
		System.out.println("Constructor B");
	}
	{
		System.out.println("not a static block B");
	}

	static {
		System.out.println("static B");
	}

}

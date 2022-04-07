package by.academy.lesson8.statics.classwork;

public class C extends B {

	public C() {
		super();
		System.out.println("Constructor C");
	}

	{
		System.out.println("not a static block B");
	}

	static {
		System.out.println("static C");
	}

}

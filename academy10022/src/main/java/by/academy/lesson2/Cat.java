package by.academy.lesson2;

import by.academy.lesson7.oop.classwork.Animal;

public class Cat extends Animal {
	private int age;
	private String nickname;

	public Cat() {
		super();
	}

	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(int age, String nickname) {
		super();
		this.age = age;
		this.nickname = nickname;
	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public Cat(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}

	public void grow(int addAge) {
		age = age + addAge;
		System.out.println("Кот вырос: " + age);
	}

	public void sleep() {
		System.out.println("Кот спит: " + nickname);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public void test() {

	}

	public void printAge() {
		System.out.println("Кот " + nickname + " age " + age);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [age=");
		builder.append(age);
		builder.append(", nickname=");
		builder.append(nickname);
		builder.append("]");
		return builder.toString();
	}

}

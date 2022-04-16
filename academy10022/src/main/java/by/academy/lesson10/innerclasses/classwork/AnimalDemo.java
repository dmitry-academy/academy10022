package by.academy.lesson10.innerclasses.classwork;

import by.academy.lesson7.oop.classwork.Cat;
import by.academy.lesson7.oop.classwork.Creature;
import by.academy.lesson8.classwork.Flyable;

public class AnimalDemo {
	public static void main(String[] args) {
		Creature cat = new Cat();

		Creature creature = new Creature() {

			@Override
			public void eat() {
				System.out.println("алала я создание алала");
			}
			
		};
		
		creature.eat();
		creature.say();

		Flyable f = new Flyable() {
			@Override
			public void fly() {
				System.out.println(" я муха я летаю");
			}
		};

		callFly(new Flyable() {
			@Override
			public void fly() {
				System.out.println(" я муха я летаю");
			}
		});
	}

	public static void callFly(Flyable f) {
		f.fly();
	}
}

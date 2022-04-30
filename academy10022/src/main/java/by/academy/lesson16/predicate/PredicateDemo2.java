package by.academy.lesson16.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {

		Predicate<String> containsA = t -> t.contains("A");
		Predicate<String> containsB = t -> t.contains("B");
		Predicate<String> containsM = t -> t.contains("M");

		System.out.println(containsA.and(containsB).or(containsM).test("ABCD"));
	}
}
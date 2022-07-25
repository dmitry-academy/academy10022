package by.academy.coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Truck {
	private double capasity;
	private List<Coffee> coffeeList;

	public Truck(double capasity) {
		super();
		this.capasity = capasity;
		this.coffeeList = new ArrayList<>();
	}

	public final double getCapasity() {
		return capasity;
	}

	public final void setCapasity(double capasity) {
		this.capasity = capasity;
	}

	public final List<Coffee> getCoffeeList() {
		return coffeeList;
	}

	public final void setCoffeeList(List<Coffee> coffeeList) {
		this.coffeeList = coffeeList;
	}

	public void addCoffee(Coffee coffee) {
		capasity -= coffee.getCalcValume();
		if (capasity >= coffee.getCalcValume()) {
			coffeeList.add(coffee);
		}

	}

	public void sort() {
		Coffee[] doubleR = new Coffee[coffeeList.size()];
		coffeeList.toArray(doubleR);
		Double[] doubleX = new Double[coffeeList.size()];
		for (int k = 0; k < doubleX.length; k++) {
			doubleX[k] = doubleR[k].volume;
		}
		coffeeList.clear();
		
		for (int i = doubleX.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (doubleX[j] > doubleX[j + 1]) {
					Double temp = doubleX[j];
					doubleX[j] = doubleX[j + 1];
					doubleX[j + 1] = temp;
					coffeeList.add(doubleR[j]);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Truck [capasity=");
		builder.append(capasity);
		builder.append(", coffeeList=");
		builder.append(coffeeList);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(capasity, coffeeList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		return Double.doubleToLongBits(capasity) == Double.doubleToLongBits(other.capasity)
				&& Objects.equals(coffeeList, other.coffeeList);
	}

}

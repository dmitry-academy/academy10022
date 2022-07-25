package by.academy.coffee;

public class Arabica extends Coffee {

	public Arabica(double price, double volume, String name, CoffeeState state) {
		super(price, volume, name, state);
		
	}

	
	@Override
	double getCalcValume() {
		return volume+0.5;
	}

	
}

package by.academy.coffee;

public class Rabusta extends Coffee {

	public Rabusta(double price, double volume, String name, CoffeeState state) {
		super(price, volume, name, state);
	}

	@Override
	double getCalcValume() {
		return volume + 0.8;
	}

}

package by.academy.coffee;

public abstract class Coffee {
	protected double price;
	protected double volume;
	protected String name;
	protected  CoffeeState state;

	public Coffee(double price, double volume, String name, CoffeeState state) {
		super();
		this.price = price;
		this.volume = volume;
		this.name = name;
		this.state = state;
	}

	abstract double getCalcValume();

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}

	public final double getVolume() {
		return volume;
	}

	public final void setVolume(double volume) {
		this.volume = volume;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final CoffeeState getState() {
		return state;
	}

	public final void setState(CoffeeState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coffee [price=");
		builder.append(price);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", name=");
		builder.append(name);
		builder.append(", state=");
		builder.append(state);
		builder.append("]");
		return builder.toString();
	}

}

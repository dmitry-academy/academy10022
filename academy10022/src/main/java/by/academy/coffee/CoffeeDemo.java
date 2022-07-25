package by.academy.coffee;

public class CoffeeDemo {
	public static void main (String [] args){
		Coffee k1 = new Arabica(2.5, 1.0, "Jackobs", CoffeeState.МОЛОТЫЙ);
		Coffee k2 = new Rabusta(3.5, 1.0, "Jardin", CoffeeState.ЗЕРНО);
		Truck truck = new Truck(1000);
		truck.addCoffee(k2);
		truck.addCoffee(k1);
		truck.sort();
		System.out.println(truck.getCoffeeList());
		
	}
	

}

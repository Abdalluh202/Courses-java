package Lec08;

public class Car_Box extends Car {

	boolean Box_car;

	public Car_Box(String CarName, String Coloer, int Carmodel, double PriceCar, boolean Box_car) {
		super(CarName, Coloer, Carmodel, PriceCar);
		this.Box_car = Box_car;
	}

	@Override
	public void specification() {
		System.out.println(CarName + " " + Coloer + " " + Carmodel + " " + PriceCar + "(" + Box_car + ")");
	}

}

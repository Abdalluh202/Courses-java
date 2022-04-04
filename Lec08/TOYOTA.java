package Lec08;

public class TOYOTA extends Car {
	String Kind_Of_car;

	public TOYOTA(String CarName, String Coloer, int Carmodel, double PriceCar, String Kind_Of_car) {
		super(CarName, Coloer, Carmodel, PriceCar);
		this.Kind_Of_car = Kind_Of_car;
	}

	@Override
	public void specification() {
		System.out.println(CarName + " " + Coloer + " " + Carmodel + " " + Kind_Of_car + " " + PriceCar);
	}
}

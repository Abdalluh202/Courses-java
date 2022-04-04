package Lec08;

public abstract class Car {
	String CarName;
	String Coloer;
	int Carmodel;
	double PriceCar;

	public Car(String CarName, String Coloer, int Carmodel, double PriceCar) {
		this.CarName = CarName;
		this.Coloer = Coloer;
		this.Carmodel = Carmodel;
		this.PriceCar = PriceCar;
	}

	public abstract void specification();

}

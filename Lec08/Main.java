package Lec08;

public class Main {

	public static void main(String[] args) {

		TOYOTA T1 = new TOYOTA("Camry", "black", 2020, 12000, "sedan");
		T1.specification();
		Car_Box c1 = new Car_Box("HILUX", "WHIT", 2021, 12000, true);
		c1.specification();
	}

}

package n1exercici1;

public class Corda extends Instrument {
	
	private  static String name;
	private static double price;
	

	public Corda() {
		super (name, price);
	}
	public Corda (String name, double price) {
		super (name, price);
	}

	static {
		name = "viola";
		price = 200;
	}
	
	public String tocar() {
		return "Está sonant un instrument de corda";
	}

}

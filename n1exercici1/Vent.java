package n1exercici1;

public class Vent extends Instrument {
	private  static String name;
	private static double price;
	
	public Vent() {
		super (name, price);
	}
	public Vent (String name, double price) {
		super (name, price);
	}

	static {
		name = "gong";
		price = 180;
	}
	public String tocar() {
		return "Está sonant un instrument de vent";
	}

}

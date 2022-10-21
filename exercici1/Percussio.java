package exercici1;

public class Percussio extends Instrument {
	private  static String name;
	private static double price;
	
	public Percussio() {
		super (name, price);
	}
	public Percussio (String name, double price) {
		super (name, price);
	}

	static {
		name = "gong";
		price = 180;
	}
		
	public String tocar() {
		return "Está sonant un instrument de percussi�";
	}

}

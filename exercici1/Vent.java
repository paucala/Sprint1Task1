package exercici1;

public class Vent extends Instrument {
	
	public Vent (String name, double price) {
		super (name, price);
	}
	
	public String getDescription() {
		return "Está sonant un instrument de vent";
	}

}

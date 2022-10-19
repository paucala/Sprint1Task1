package exercici1;

public class Corda extends Instrument {
	
	public Corda (String name, double price) {
		super (name, price);
	}
	public String getDescription() {
		return "Está sonant un instrument de corda";
	}

}

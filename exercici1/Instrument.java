package exercici1;

public abstract class Instrument {
	
	// El primer metode només s'invocara una vegada per ser static i el segon tantes vegades com es generi un objecte
	static {
		System.out.println("Benvinguts");
	}
	{
		System.out.println("Un altre intrument");
	}
	
	private String name;
	private double price;
	
	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Instrument() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	abstract String tocar();

}

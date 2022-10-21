package n2exercici1;

public class Telephone {
	
	private String brand;
	private String model;
	
	public Telephone (String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel (String model) {
		this.model = model;
	}
	public String call (String number) {
		return "S'està trucant al número " + number;
	}

}

package exercici3;

public class Smartphone extends Telephone implements Camera, Watch {

	public Smartphone(String brand, String model) {
		super(brand, model);
		
	}

	public String alarm() {
		return "Està sonant l’alarma";
	}

	public String photografie() {
		return "S’està fent una foto";
	}
	

}

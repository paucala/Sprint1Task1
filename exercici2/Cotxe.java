package exercici2;

public class Cotxe {
	private static final String BRAND = "toyota";
	private static String Model;
	private final int POWER;
	
	public Cotxe (String Model, final int POWER) {
		Cotxe.Model = Model;
		this.POWER = POWER;
	}
	/* La diferencia entre els 3 és que la marca, 
	 * s'ha d'inicialitzar obligatoriament al ser static i final, 
	 * el model es pot canviar però serà el mateix per tots el objectes Cotxe, 
	 * i la potencia pot variar durant la construcció de l'objecte però serà definitiva (no adment canvis) */

	public int getPOWER() {
		return POWER;
	}

	public static String getModel() {
		return Model;
	}

	public static void setModel(String model) {
		Cotxe.Model = model;
	}

	public static String getBrand() {
		return BRAND;
	}
	public static String frenar() {
		return "El vehicle està frenant";
			
	}
	public String accelerar() {
		return "El vehicle " + Cotxe.BRAND + Cotxe.Model + this.POWER + "està accelerant";
	}
	/* la diferencia entre els 2 mètodes és que l'estatic serà accecible per tots els cotxes (tots el cotxes frenen)
	 *  i l'altre serà accesible per cada objecte cotxe individualment */
	
	public String getDescription() {
		return Cotxe.BRAND + Cotxe.Model + this.POWER;
	}

}

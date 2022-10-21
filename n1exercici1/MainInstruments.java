package n1exercici1;

public class MainInstruments {

	public static void main(String[] args) {
		/*En un grup de m�sica hi ha diferents tipus d�n1exercici1 musicals. Hi ha n1exercici1 de vent, de corda i de percussi�.

Tots els n1exercici1 tenen com a atributs el seu nom, i el seu preu. A m�s, tenen un m�tode anomenat tocar(). 
Aquest, �s abstracte a la classe instrument i, per tant, s�ha d�implementar a les classes filles. 
Si s�est� tocant un instrument de vent, el m�tode ha de mostrar per consola: "Est� sonant un instrument de vent",
 si s�est� tocant un instrument de corda: �Est� sonant un instrument de corda� 
 i si s�est� tocant un instrument de percussi�: �Est� sonant un instrument de percussi�.


El proc�s de c�rrega d'una classe nom�s t� lloc una vegada. 
Demostra que la c�rrega pot ser provocada per la creaci� de la primera inst�ncia d'aquesta classe o per l'acc�s a un membre est�tic d'aquesta. 

Cerca informaci� sobre els blocs d'inicialitzaci� i blocs est�tics en Java.*/
		Corda x = new Corda("violi", 230);
		System.out.println(x.tocar());
		Vent y = new Vent("trombó", 150);
		System.out.println(y.tocar());
		Percussio z = new Percussio("bateria", 300);
		System.out.println(z.tocar());
		Corda w = new Corda();
		System.out.println(w.tocar());
		Percussio e = new Percussio("bateria", 300);
		System.out.println(e.tocar());
	}
	
	
	
	

}

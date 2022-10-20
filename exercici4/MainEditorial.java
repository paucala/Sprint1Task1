package exercici4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEditorial {

	static ArrayList<Writer> writers = new ArrayList<Writer>();

	public static void main(String[] args) {
		/* A la classe principal s’ha de fer un menú amb les següents opcions:

1.- Introduir redactor.

2.- Eliminar redactor.

3.- Introduir notícia a un redactor.

4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

5.- Mostrar totes les notícies per redactor.

6.- Calcular puntuació de la notícia.

7.- Calcular preu-notícia. */
	Scanner entry =	new Scanner (System.in);
	String name = "", dni = "", head = "", competition = "", club = "", player = "", player1 = "", player2 = "", team = "";
	int op = 0, x = 0, y = 0;
	do {
		
		System.out.println("Selecciona una opció: \n"
				+ "1.- Introduir redactor.\r\n"
				+ "2.- Eliminar redactor.\r\n"
				+ "3.- Introduir notícia a un redactor.\r\n"
				+ "4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).\r\n"
				+ "5.- Mostrar totes les notícies per redactor.\r\n"
				+ "6.- Calcular puntuació de la notícia.\r\n"
				+ "7.- Calcular preu-notícia \r\n"
				+ "0. Sortir");
		op = entry.nextInt();
		entry.nextLine();
		while (op < 0 || op > 7) {
			System.out.println("La opció escollida no existeix, selecciona una altre opció: ");
			op = entry.nextInt();
			entry.nextLine();
	}
			
			
	switch (op) {
			case 1:
				System.out.println("Indica el nom del redactor");
				name = entry.nextLine();
				System.out.println("Indica el dni del redactor");
				dni = entry.nextLine();
				Writer writer = new Writer(name, dni);
				writers.add(writer);
				break;
			case 2:
				System.out.println("Indica el nom del redacotr que vols eliminar");
				name = entry.nextLine();
				x = searchWriter(name, x);
				while (x == -1) {
					System.out.println("No s'ha trobat el redactor, torna a introduir el nom: ");
					name = entry.nextLine();
					x = searchWriter(name, x);
				}
				writers.remove(x);
				System.out.println("Redactor eliminat");
				break;
			case 3:
				System.out.println("Indica el nom del redacotr al que vols afegir una noticia");
				name = entry.nextLine();
				x = searchWriter(name, x);
				while (x == -1) {
					System.out.println("No s'ha trobat el redactor, torna a introduir el nom: ");
					name = entry.nextLine();
					x = searchWriter(name, x);
				}
					System.out.println("Indica el el tipus de noticia que vols afegir"
							+ "1. Futbol"
							+ "2. Basket"
							+ "3. Tenis"
							+ "4. F1"
							+ "5. Motociclisme");
						op = entry.nextInt();
						entry.nextLine();
						while(op < 0 || op > 5) {
							System.out.println("La opció escollida no existeix, selecciona una altre opció: ");
							op = entry.nextInt();
							entry.nextLine();
				}
				switch(op) {				
					case 1:
						System.out.println("Escriu el titular");
						head = entry.nextLine();
						System.out.println("Escriu el campionat");
						competition = entry.nextLine();
						System.out.println("Escriu el club");
						club = entry.nextLine();
						System.out.println("Escriu el jugador");
						player = entry.nextLine();
						Futbol futbol = new Futbol(head, competition, club, player);
						writers.get(x).getNews().add(futbol);
						break;
					case 2:
						System.out.println("Escriu el titular");
						head = entry.nextLine();
						System.out.println("Escriu el campionat");
						competition = entry.nextLine();
						System.out.println("Escriu el club");
						club = entry.nextLine();
						Basket basket = new Basket(head, competition, club);
						writers.get(x).getNews().add(basket);
						break;
					case 3:
						System.out.println("Escriu el titular");
						head = entry.nextLine();
						System.out.println("Escriu el campionat");
						competition = entry.nextLine();
						System.out.println("Escriu el jugador 1");
						player1 = entry.nextLine();
						System.out.println("Escriu el jugador 2");
						player2 = entry.nextLine();
						Tenis tenis = new Tenis(head, competition, player1, player2);
						writers.get(x).getNews().add(tenis);
						break;
					case 4:
						System.out.println("Escriu el titular");
						head = entry.nextLine();
						System.out.println("Escriu l'escuderia");
						team = entry.nextLine();
						F1 f1 = new F1(head, team);
						writers.get(x).getNews().add(f1);
						break;
					case 5:
						System.out.println("Escriu el titular");
						head = entry.nextLine();
						System.out.println("Escriu l'escuderia");
						team = entry.nextLine();
						Motorcicle motorcicle = new Motorcicle(head, team);
						writers.get(x).getNews().add(motorcicle);
						break;	
				}
				System.out.println("Noticia afegida");
				break;
			case 4:
				System.out.println("Indica el nom del redactor al que vols eliminar la noticia");
				name = entry.nextLine();
				x = searchWriter(name, x);
				while (x == -1) {
					System.out.println("No s'ha trobat el redactor, torna a introduir el nom: ");
					name = entry.nextLine();
					x = searchWriter(name, x);
				}
				System.out.println("Indica el titular de la noticia que vols eliminar");
				head = entry.nextLine();
				y = searchNews(head, x, y);
				while (y == -1) {
					System.out.println("No s'ha trobat la noticia, torna a introduir el nom: ");
					head = entry.nextLine();
					y = searchNews(head, x, y);
				}
				writers.get(x).getNews().remove(y);

				System.out.println("Noticia eliminat");
				break;
			case 5:
				System.out.println("Indica el nom del redactor");
				name = entry.nextLine();
				x = searchWriter(name, x);
				while (x == -1) {
					System.out.println("No s'ha trobat el redactor, torna a introduir el nom: ");
					name = entry.nextLine();
					x = searchWriter(name, x);
				}
				writers.get(x).showNews();
				break;
			case 6:
				System.out.println("Indica el nom del redactor");
				name = entry.nextLine();
				x = searchWriter(name, x);
				while (x == -1) {
					System.out.println("No s'ha trobat el redactor, torna a introduir el nom: ");
					name = entry.nextLine();
					x = searchWriter(name, x);
				}
				System.out.println("Indica el titular de la noticia");
				head = entry.nextLine();
				y = searchNews(head, x, y);
				while (y == -1) {
					System.out.println("No s'ha trobat el titular, torna a introduir el nom: ");
					head = entry.nextLine();
					y = searchNews(head, x, y);
				}
				System.out.println(writers.get(x).getNews().get(y).calculateNewsPoints());
				break;
			case 7:
				System.out.println("Indica el nom del redactor");
				name = entry.nextLine();
				x = searchWriter(name, x);
				while (x == -1) {
					System.out.println("No s'ha trobat el redactor, torna a introduir el nom: ");
					name = entry.nextLine();
					x = searchWriter(name, x);
				}
				System.out.println("Indica el titular de la noticia");
				head = entry.nextLine();
				y = searchNews(head, x, y);
				while (y == -1) {
					System.out.println("No s'ha trobat la noticia, torna a introduir el nom: ");
					head = entry.nextLine();
					y = searchNews(head, x, y);
				}
				System.out.println(writers.get(x).getNews().get(y).calculateNewsPrice());
				break;
		}
	} while (op != 0);

	}
	public static int searchWriter (String name, int x) {
		x = 0;
		int i = 0;
		boolean found = false;
		while (i < writers.size() && found == false) {
			if (name.equalsIgnoreCase(writers.get(x).getName())) {
				found = true;
			} else {
				x++;
				i++;
			}
		}
		if (found == true) {
			return x;
		} else {
			return x = -1;
		}
	}
		public static int searchNews (String head, int y, int x) {
			y = 0;
			int i = 0;
			boolean found = false;
			while (i < writers.get(x).getNews().size() && found == false) {
				if (writers.get(x).getNews().get(y).getHead().equalsIgnoreCase(head)) {
					found = true;
				} else {
					y++;
					i++;
				}
			}
			if (found == true) {
				return y;
			} else {
				return y = -1;
			}
		}

}

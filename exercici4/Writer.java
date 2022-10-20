package exercici4;

import java.util.ArrayList;

public class Writer {
	/* La redacció pot tenir més d’un redactor, 
	 * i de cadascun d’ells volem saber el seu nom, el DNI i el sou. 
	 * Un cop assignat un DNI, aquest no podrà canviar mai. 
	 * Tots els redactors tenen el mateix sou, i si en un futur l’empresa pot incrementar-lo, 
	 * ho farà a tothom per igual. De moment el sou actual és de 1500 €.*/
	
	private String name;
	private String dni;
	private static int salary = 1500;
	private ArrayList<News> news;
	
	public Writer (String name, String dni) {
		this.name = name;
		this.dni = dni;
		this.news = new ArrayList<News>();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		Writer.salary = salary;
	}

	public ArrayList<News> getNews() {
		return news;
	}

	public void setNews(ArrayList<News> news) {
		this.news = news;
	}
	public void showNews() {
		for (News news : this.getNews()) {
			System.out.println(news.getHead());
		}
	}

	
}

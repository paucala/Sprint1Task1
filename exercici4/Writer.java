package exercici4;

import java.util.ArrayList;

public class Writer {
	
	private String name;
	private final String dni;
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

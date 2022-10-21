package exercici4;

abstract class News {
	/*  Classe abstracta ja que no volem que és pugui crear una noticia de la superclasse (només de les subclasses*/
	
	private String head;
	private String body;
	private int points;
	private int price;
	
	public News (String head) {
		this.head = head;
		this.body = "";
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getPoints() {
		return points;
	}

	public int getPrice() {
		return price;
	}
	abstract int calculateNewsPoints();
	
	abstract int calculateNewsPrice();
	
}
	



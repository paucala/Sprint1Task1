package exercici4;

public class News {
	/*  Les notícies han de tenir un titular, un text, una puntuació i un preu. 
	 * En el moment de crear-se, el text ha d’estar buit.*/
	
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
	public int calculateNewsPoints() {
		return points;
	}
	public int calculateNewsPrice() {
		return price;
	}
}
	



package exercici4;

public class Tenis extends News{
		
	private String competition;
	private String player1;
	private String player2;
	
	public Tenis(String head, String competition, String player1, String player2) {
		super(head);
		this.competition = competition;
		this.player1 = player1;
		this.player2 = player2;
	}
	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	public String getPlayer1() {
		return player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public int calculateNewsPrice() {
		int price = 150;
		if (this.player1.equalsIgnoreCase("Federer") || this.player1.equalsIgnoreCase("Nadal") || this.player1.equalsIgnoreCase("Djocovic") ) {
			price += 100;
		} 
		if (this.player2.equalsIgnoreCase("Federer") || this.player2.equalsIgnoreCase("Nadal") || this.player2.equalsIgnoreCase("Djocovic") ) {
			price += 100;
		} 
		return price;
	}
	
	public int calculateNewsPoints() {
		int points = 4;
		if (this.player1.equalsIgnoreCase("Federer") || this.player1.equalsIgnoreCase("Nadal") || this.player1.equalsIgnoreCase("Djocovic") ){
			points += 3;
		} 
		if (this.player2.equalsIgnoreCase("Federer") || this.player2.equalsIgnoreCase("Nadal") || this.player2.equalsIgnoreCase("Djocovic") ) {
			points += 3;
		}
		return points;
	}
	
}

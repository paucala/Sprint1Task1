package exercici4;

public class F1 extends News implements NewsPrice, NewsPoints {
	
	private String team;

	public F1(String head, String team) {
		super(head);
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public int calculateNewsPrice() {
		int price = 100;
		if (this.team.equalsIgnoreCase("Ferrari")) {
			price += 50;
		} else if (this.team.equalsIgnoreCase("Mercedes")) {
			price += 50;
		}
		return price;
	}
	
	public int calculateNewsPoints() {
		int points = 4;
		if (this.team.equalsIgnoreCase("Ferrari")) {
			points += 2;
		} else if (this.team.equalsIgnoreCase("Mercedes")) {
			points += 2;
		}
		return points;
	}

}

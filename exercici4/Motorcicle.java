package exercici4;

public class Motorcicle extends News{
	
	private String team;

	public Motorcicle(String head, String team) {
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
		if (this.team.equalsIgnoreCase("Honda")) {
			price += 50;
		} else if (this.team.equalsIgnoreCase("Yamaha")) {
			price += 50;
		}
		return price;
	}
	
	public int calculateNewsPoints() {
		int points = 3;
		if (this.team.equalsIgnoreCase("Honda")) {
			points += 3;
		} else if (this.team.equalsIgnoreCase("Yamaha")) {
			points += 3;
		}
		return points;
	}


}
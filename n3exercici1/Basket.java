package n3exercici1;

public class Basket extends News{
		
	private String competition;
	private String club;
	
	public Basket(String head, String competition, String club) {
		super(head);
		this.competition = competition;
		this.club = club;
	}

	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public int calculateNewsPrice() {
		int price = 250;
		if (this.competition.equalsIgnoreCase("EuroLiga")) {
			price += 75;
		}
		if (this.club.equalsIgnoreCase("Barça")) {
			price += 75;
		} else if (this.club.equalsIgnoreCase("Madrid")) {
			price += 75;
		}
		
		return price;
	}
	
	public int calculateNewsPoints() {
		int points = 4;
		if (this.competition.equalsIgnoreCase("EuroLiga")) {
			points += 3;
		} else if (this.competition.equalsIgnoreCase("ACB")) {
			points += 2;
		}
		if (this.club.equalsIgnoreCase("Barça")) {
			points += 1;
		} else if (this.club.equalsIgnoreCase("Madrid")) {
			points += 1;
		}
		return points;
	}

}

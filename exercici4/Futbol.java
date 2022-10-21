package exercici4;

public class Futbol extends News{
	
	private String competition;
	private String club;
	private String player;

	public Futbol(String head, String competition, String club, String player) {
		super(head);
		this.competition = competition;
		this.club = club;
		this.player = player;
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

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public int calculateNewsPrice() {
		int price = 300;
		if (this.competition.equalsIgnoreCase("ChampionsLeague")) {
			price += 100;
		}
		if (this.club.equalsIgnoreCase("Barça")) {
			price += 100;
		} else if (this.club.equalsIgnoreCase("Madrid")) {
			price += 100;
		}
		if (this.player.equalsIgnoreCase("FerranTorres")) {
			price += 50;
		} else if (this.player.equalsIgnoreCase("Benzema")) {
			price += 50;
		}
		return price;
	}
	
	public int calculateNewsPoints() {
		int points = 5;
		if (this.competition.equalsIgnoreCase("ChampionsLeague")) {
			points += 3;
		} else if (this.competition.equalsIgnoreCase("LaLiga")) {
			points += 2;
		}
		if (this.club.equalsIgnoreCase("Barça")) {
			points += 1;
		} else if (this.club.equalsIgnoreCase("Madrid")) {
			points += 1;
		}
		if (this.player.equalsIgnoreCase("FerranTorres")) {
			points += 1;
		} else if (this.player.equalsIgnoreCase("Benzema")) {
			points += 1;
		}
		return points;
	}



}

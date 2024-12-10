package tascas101level3;

public class BasketballNews extends News {
	private String competition;
	private String club;
	
	public BasketballNews(String headline,String competition, String club) {
		super(headline);
		this.competition = competition;
		this.club = club;
		this.price = 250;
		this.score = 4;
	}
	public String getCompetition() {
		return this.competition;
	}
	public String getClub() {
		return this.club;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	public int calculateNewsPrice() {
		int finalPrice = 0;
		if (this.competition.equalsIgnoreCase("Euroleague")) {
			finalPrice += 75;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			finalPrice += 100;
		}
		finalPrice += this.getPrice();
		return finalPrice;
	}
	
	public int calculateNewsScore() {
		int finalScore = 0;
		if (this.competition.equalsIgnoreCase("Euroleague") || (this.competition.equalsIgnoreCase("ACB"))) {
			finalScore += 3;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			finalScore += 1;
		}
		finalScore += this.score;
		return finalScore;
	}
	
}


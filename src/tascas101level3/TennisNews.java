package tascas101level3;

public class TennisNews extends News {
	private String competition;
	private String tennisPlayer;
	
	public TennisNews(String headline,String competition, String tennisPlayer) {
		super(headline);
		this.competition = competition;
		this.tennisPlayer = tennisPlayer;
		this.price = 150;
		this.score = 4;
	}
	
	public String getCompetition() {
		return this.competition;
	}
	public String getTennisPlayer() {
		return this.tennisPlayer;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	public void setTennisPlayer(String tennisPlayer) {
		this.tennisPlayer = tennisPlayer;
	}
	
	public int calculateNewsPrice() {
		int finalPrice = 0;
		if (this.tennisPlayer.equalsIgnoreCase("Federer") || (this.tennisPlayer.equalsIgnoreCase("Nadal")
			|| (this.tennisPlayer.equalsIgnoreCase("Djokovic")))) {
			finalPrice += 75;
		}
		finalPrice += this.getPrice();
		return finalPrice;
	}
	
	public int calculateNewsScore() {
		int finalScore = 0;
		if (this.tennisPlayer.equalsIgnoreCase("Nadal") || (this.tennisPlayer.equalsIgnoreCase("Djokovic"))) {
			finalScore += 3;
		}
		finalScore += this.score;
		return finalScore;
	}
}
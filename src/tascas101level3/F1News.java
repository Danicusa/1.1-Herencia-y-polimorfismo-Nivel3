package tascas101level3;

public class F1News extends News {
private String team;
	
	public F1News(String headline,String team) {
		super(headline);
		this.team = team;
		this.price = 100;
		this.score = 4;
	}
	
	public String getTeam() {
		return this.team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public int calculateNewsPrice() {
		int finalPrice = 0;
		if (this.team.equalsIgnoreCase("Ferrari") || (this.team.equalsIgnoreCase("Mercedes"))) {
			finalPrice += 50;
		}
		finalPrice += this.getPrice();
		return finalPrice;
	}
	
	public int calculateNewsScore() {
		int finalScore = 0;
		if (this.team.equalsIgnoreCase("Ferrari") || (this.team.equalsIgnoreCase("Mercedes"))) {
			finalScore += 2;
		}
		finalScore += this.score;
		return finalScore;
	}
}

package tascas101level3ex1;

public class MotorcyclingNews extends News {
private String team;
	
	public MotorcyclingNews(String headline,String team) {
		super(headline);
		this.team = team;
		this.price = 100;
		this.score = 3;
	}
	
	public String getTeam() {
		return this.team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public int calculateNewsPrice() {
		int finalPrice = 0;
		if (this.team.equalsIgnoreCase("Honda") || (this.team.equalsIgnoreCase("Yamaha"))) {
			finalPrice += 50;
		}
		finalPrice += this.getPrice();
		return finalPrice;
	}
	
	public int calculateNewsScore() {
		int finalScore = 0;
		if (this.team.equalsIgnoreCase("Honda") || (this.team.equalsIgnoreCase("Yamaha"))) {
			finalScore += 3;
		}
		finalScore += this.score;
		return finalScore;
	}
}


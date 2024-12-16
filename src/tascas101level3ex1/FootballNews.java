package tascas101level3ex1;

public class FootballNews extends News {
	private String competition;
	private String club;
	
	public FootballNews(String headline, String competition, String club) {
		super(headline);
		this.competition = competition;
		this.club = club;
		this.price = 300;
		this.score = 5;
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
	
	public static String createFootballNews(String headline, String competition, String club) {
		String answer = "";
		
		FootballNews fnew = new FootballNews(headline,competition,club);
		answer = "The footbal new has been created correctly";
		
		return answer;
	}
	
	public int calculateNewsPrice() {
		int finalPrice = 0;
		if (this.competition.equalsIgnoreCase("Champions league")) {
			finalPrice += 100;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			finalPrice += 100;
		}
		if (this.getText().toLowerCase().contains("Ferran Torres".toLowerCase()) ||
		   (this.getText().toLowerCase().contains("Benzema".toLowerCase())))  {
			finalPrice +=100;
		}
		finalPrice += this.getPrice();
		return finalPrice;
	}
	
	public int calculateNewsScore() {
		int finalScore = 0;
		if (this.competition.equalsIgnoreCase("Champions league") || (this.competition.equalsIgnoreCase("League"))) {
			finalScore += 3;
		}
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
			finalScore += 1;
		}
		if (this.getText().toLowerCase().contains("Ferran Torres".toLowerCase()) ||
		   (this.getText().toLowerCase().contains("Benzema".toLowerCase()))) {
			finalScore +=1;
		}
		finalScore += this.score;
		return finalScore;
	}
}

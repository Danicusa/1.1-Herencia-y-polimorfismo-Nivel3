package tascas101level3ex1;

public abstract class News {
	protected String headline;
	protected String text;
	protected int score;
	protected int price;
	
	public News(String headline) {
		this.headline = headline;
		this.setText("");
		this.score = 0;
		this.price = 0;
	}
	
	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public  String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public int getPrice() {
		return price;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract int calculateNewsPrice();
	
	public abstract int calculateNewsScore();
	
	public String toString() {
        return "Headline: " + headline + "\nText: " + text;
    }

}

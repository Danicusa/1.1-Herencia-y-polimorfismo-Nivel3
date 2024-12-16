package tascas101level3ex1;

import java.util.Scanner;

public class mainClass {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0;
		int subMenu = 0;
		String editorsName = "";
		String editorsId = "";
		String answer = "";
		String club = "";
		
		do {
		menu =showMenu(menu);
		
		
		switch(menu) {
		case 1:
			System.out.println(menuOption1());
			break;
		case 2:
			System.out.println(menuOption2());
			break;
		case 3:
			System.out.println(menuOption3());
			break;
		case 4:
			System.out.println(menuOption4());
			break;
		case 5:
			menuOption5();
			break;
		case 6:
			menuOption6();
			break;
		case 7:
			menuOption7();
		}
		} while (menu != 0);
		
	}	
	public static String addNewEditor(String name, String id) {
		String answer = "";
		Editor editor1 = new Editor(name,id);
		EditorialOffice.addEditor(editor1);
		answer = "The editor has been created correctly.";
		
		return answer;
	}
	
	public static String removeEditor(String id) {
		int index = 0;
		String answer = "";
		index = EditorialOffice.editorsIndex(id);
		if (index < 0) {
			answer = "The editor ID doesn't exist";
		} else {
		EditorialOffice.editorsList.remove(index);
		answer = "The editor with ID " + id + "was removed correctly.";	
		}
		return answer;
	}
	
	public static int showMenu(int menu) {
		
		System.out.println("Select an option:\n"
				+ "1. Add a new editor.\n"
				+ "2. Delete an editor.\n"
				+ "3. Submit a news article to an editor.\n"
				+ "4. Delete a news article.\n"
				+ "5. Show all the news articles of an editor.\n"
				+ "6. Calculate a news score.\n"
				+ "7. Calculate a news price.\n"
				+ "0. Exit");
		
		while (!sc.hasNextInt()) {  
	        System.out.println("Invalid input. Please enter a valid number:");
	        sc.next();  
	    }
		menu = sc.nextInt();
		sc.nextLine();
		return menu;
		} 
	
	
	public static String menuOption1() {
		String editorsName = "";
		String editorsId = "";
		String answer = "";
		
		System.out.println("Introduce the editor's name");
		editorsName = sc.next();
		System.out.println("Introduce the editor's ID");
		editorsId = sc.next();
		
		answer = addNewEditor(editorsName,editorsId);
		
		return answer;
	}
	
	public static String menuOption2() {
		String editorsId = "";
		String answer = "";	
		System.out.println("Introduce the editor's ID that will be removed");
		editorsId = sc.next();
		answer = removeEditor(editorsId);
		
		return answer;
	}
	
	public static String menuOption3() {
		int subMenu = 0;
		String headline = "";
		String competition = "";
		String club = "";
		String answer = "";
		String tennisPlayer = "";
		String team = "";
		
		System.out.println("What kind of news do you want to create? Choose:\n"
				+ "1.Football news\n"
				+ "2.Basketball news\n"
				+ "3.Tennis news\n"
				+ "4.F1 news\n"
				+ "5.Motorcycling news");
		subMenu = sc.nextInt();
		sc.nextLine();
		
		switch(subMenu) {
		case 1:
			headline = createHeadline();
			competition = selectCompetition();
			club = selectClub();
			FootballNews FoNews = new FootballNews(headline,competition,club);
			EditorialOffice.addNews(FoNews);
			wichEditor().addNewsArticle(FoNews);
			addText(FoNews);
			answer = "The football article has been created";
			break;
		case 2:
			headline = createHeadline();
			competition = selectCompetition();
			club = selectClub();
			BasketballNews BaNews = new BasketballNews(headline,competition,club);
			EditorialOffice.addNews(BaNews);
			Editor.addNewsArticle(BaNews);
			wichEditor().addNewsArticle(BaNews);
			addText(BaNews);
			answer = "The football article has been created";
			break;
		case 3:
			headline = createHeadline();
			competition = selectCompetition();
			tennisPlayer = selectTennisPlayer();
			TennisNews TeNews = new TennisNews(headline,competition,tennisPlayer);
			EditorialOffice.addNews(TeNews);
			Editor.addNewsArticle(TeNews);
			wichEditor().addNewsArticle(TeNews);
			addText(TeNews);
			answer = "The Tennis article has been created";
			break;
		case 4:
			headline = createHeadline();
			team = selectTeam();
			F1News F1News = new F1News(headline,team);
			EditorialOffice.addNews(F1News);
			Editor.addNewsArticle(F1News);
			wichEditor().addNewsArticle(F1News);
			addText(F1News);
			answer = "The F1 article has been created";
			break;
		case 5:
			headline = createHeadline();
			team = selectTeam();
			MotorcyclingNews MoNews = new MotorcyclingNews(headline,team);
			EditorialOffice.addNews(MoNews);
			Editor.addNewsArticle(MoNews);
			wichEditor().addNewsArticle(MoNews);
			addText(MoNews);
			answer = "The motorcycling article has been created";
			break;			
		}
		return answer;
	}
	
	public static String menuOption4() {
		int newsIndex = 0;
		int indexEditor = 0;
		String id = "";
		String headline = "";
		
		System.out.println("Enter the editor's ID:");
	    id = sc.next();
	    System.out.println("Enter the headline of the news to remove:");
	    headline = sc.next();
	    
		indexEditor = EditorialOffice.editorsIndex(id);
		Editor editor = EditorialOffice.editorsList.get(indexEditor);
		newsIndex = editor.getNewsArticleIndex(headline);
		editor.getNewsArticles().remove(newsIndex);
		newsIndex = EditorialOffice.newsIndex(headline);
		EditorialOffice.getNewsList().remove(indexEditor);
		
		return "The article with the headline " + headline + " has been removed correctly.";
	}
	
	public static void  menuOption5() {
		
		wichEditor().showAllNews();
	}
	
	public static void menuOption6() {
		String headline = "";
		
		System.out.println("Enter the headline of the news that you want to get the score");
		headline = sc.next();
		int control = -1;
		int result = 0;
		
		for (int i = 0; i < EditorialOffice.newsList.size() && control == -1 ; i++) {
			if (headline.equalsIgnoreCase(EditorialOffice.newsList.get(i).getHeadline())) {
				result = EditorialOffice.newsList.get(i).calculateNewsScore();
				System.out.println("The price of the news is " + result);
			}
		}
	}
	
	public static void menuOption7() {
		String headline = "";
		
		System.out.println("Enter the headline of the news that you want to get the price");
		headline = sc.next();
		int control = -1;
		int result = 0;
		
		for (int i = 0; i < EditorialOffice.newsList.size() && control == -1 ; i++) {
			if (headline.equalsIgnoreCase(EditorialOffice.newsList.get(i).getHeadline())) {
				result = EditorialOffice.newsList.get(i).calculateNewsPrice();
				System.out.println("The price of the news is " + result);
			}
		}
	}
	
	
	public static String selectCompetition() {
		String competition = "";
		System.out.println("Insert the competition that the news will be focused on");
		competition = sc.next();
		
		return competition;
	}
	
	public static String createHeadline() {
		String headline = "";
		System.out.println("Insert the news headline");
		headline = sc.next();
		
		return headline;
	}
	
	public static String selectClub() {
		String club = "";
		System.out.println("Insert the name of the club that the article will be focused on");
		club = sc.next();
		
		return club;
	}
	
	public static String selectTennisPlayer() {
		String tennisPlayer = "";
		System.out.println("Insert the name of the tennis player that the article will be focused on");
		tennisPlayer = sc.next();
		
		return tennisPlayer;
	}
	
	public static String selectTeam() {
		String team = "";
		System.out.println("Insert the name of the team that the article will be focused on");
		team = sc.next();
		
		return team;
	}
	
	public static void addText(News news) {
		String text = "";
		System.out.println("Enter the text that will be shown in the new");
		text = sc.next();
		news.setText(text);
	}
	
	public static Editor wichEditor() {
		String id = "";
		int indexEditor = 0;
		System.out.println("Enter the editor's ID:");
	    id = sc.next();
	    indexEditor = EditorialOffice.editorsIndex(id);
		Editor editor1 = EditorialOffice.editorsList.get(indexEditor);
		
		return editor1;
	}
}


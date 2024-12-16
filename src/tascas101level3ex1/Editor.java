package tascas101level3ex1;

import java.util.ArrayList;

public class Editor {
	private static String name;
	private final  String id;
	private static int salary;
	static ArrayList<News>newsArticles;
	
	public Editor(String nombre, String id) {
		Editor.name = nombre;
		this.id = id;
		Editor.salary = 1500;
		Editor.newsArticles = new ArrayList<News>();
	}

	public String getName() {
		return name;
	}

	public static void setName(String name) {
		Editor.name = name;
	}

	public String getId() {
		return this.id;
	}
	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		Editor.salary = salary;
	}
	
	public ArrayList<News> getNewsArticles(){
		return Editor.newsArticles;
	}
	
	public static String addNewsArticle(News news) {
		Editor.newsArticles.add(news);
		return "The " + news + "news article has been added to the Editor with ID ";
	}
	
	public int getNewsArticleIndex(String headline) {
		int index = -1;
		int i = 0;
		
		while (i < newsArticles.size() && index == -1 ) {
			if (headline.equals(newsArticles.get(i).getHeadline())) {
				index = i;
			}
		i++;
		}
		
		return index;
	}
	
	public static void showAllNews() {
        if (newsArticles.isEmpty()) {
            System.out.println("This editor has no news articles.");
        } else {
            System.out.println("News articles for editor " + name + ":");
            for (News news : newsArticles) {
                System.out.println(news); 
            }
        }
    }
	
}

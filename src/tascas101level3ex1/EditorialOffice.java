package tascas101level3ex1;

import java.util.ArrayList;

public class EditorialOffice {
    public static ArrayList<Editor> editorsList = new ArrayList<>();
    public static ArrayList<News> newsList = new ArrayList<>();
	
	public ArrayList<Editor> getEditorsList(){
		return EditorialOffice.editorsList;
	}
	public static ArrayList<News> getNewsList(){
		return EditorialOffice.newsList;
	}
	public static String addNews(News news) {
		EditorialOffice.newsList.add(news);
		return "The news article " + news + " has been added correctly";
	}
	
	public static String addEditor(Editor editor) {
		EditorialOffice.editorsList.add(editor);
		return "The editor " + editor + " has been added correctly";
	}
	
	public static int editorsIndex(String id) {
		int index = -1;
		int i = 0;
		while (i < editorsList.size() && index == -1 ) {
			if (id.equals(editorsList.get(i).getId())) {
				index = i;
			}
			i++;
		}		
		return index;
	}
	public static int newsIndex(String headline) {
		int index = -1;
		int i = 0;
		while (i < newsList.size() && index == -1 ) {
			if (headline.equals(newsList.get(i).getHeadline())) {
				index = i;
			}
			i++;
		}		
		return index;
	}
	
}

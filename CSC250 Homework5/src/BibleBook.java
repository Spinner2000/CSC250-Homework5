
public class BibleBook {
	
	private String bibleBook;
	private String description;
	private int chapters;
	
	public BibleBook(String bibleBook, String description, int chapters) {
		this.bibleBook=bibleBook;
		this.description=description;
		this.chapters=chapters;
	}
	
	public void display(){
		
		System.out.println("Book: "+this.bibleBook+"\nChapters: "+this.chapters+"\nDescription: "+this.description+"\n");
	}
}

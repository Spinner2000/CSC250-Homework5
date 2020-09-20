import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		
		BibleBook book1=new BibleBook("Exodus","The Israelites Escape Egypt and How It Takes Them 40 Years To Get Home",40);
		BibleBook book2=new BibleBook("Acts","The Acts of the Apostles, Or How Saul Came To Be Paul and Stopped Harrasing Christians",28);
		BibleBook book3=new BibleBook("Revelation","Descriptions of Judgement Day, Armageddon, Ragnarok, The End Times, The Apocalypse, Or Whatever You Want To Call It",22);
		
		
		book1.display();
		book2.display();
		book3.display();
		
		
		
		
		
	}
}

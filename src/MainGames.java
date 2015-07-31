import java.util.Scanner;

public class MainGames {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		Character p1 = new Character();
		Map NorthSacros = new Map(p1);
		//p1.setLvl(5);
		System.out.println("Welcome to Liberation Games");
		System.out.print("Enter your character name? ");
		p1.setName(sc.nextLine()); 
		System.out.println("Hello " + p1.getName());
		NorthSacros.openMap(p1, NorthSacros);

	}
	
}
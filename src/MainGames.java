import java.util.Scanner;

public class MainGames {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		Character p1 = new Character();
		Map NorthSacros = new Map(p1);
		System.out.println("Welcome to Liberation Games");
		System.out.print("Enter your character name? ");
		p1.setName(sc.nextLine()); 
		System.out.println("Hello " + p1.geName());
		//System.out.println("What you gonna do? ");
	
		//System.out.println("3. Show status");
		do{
			System.out.println("-----Menu-----");
			System.out.println("1. Show status");
			System.out.println("2. Visit Inn");
			System.out.println("3. Open Map");
			System.out.println("4. Item Shop");
			i = sc.nextInt();
			switch(i){
			case 1: 
				p1.print();
				break;
			case 2:
				
				switch(p1.getPosition()){
				case 1:
					NorthSacros.getCity(p1.getPosition()).visitInn(p1);
					break;
				case 2:
					NorthSacros.getCity(p1.getPosition()).visitInn(p1);
					break;
				}
				break;
			case 3:
				NorthSacros.openMap(p1);
			case 4:
				NorthSacros.getCity(p1.getPosition()).ss.print_menu();
			}
			
		}while(true);
	}
	
}

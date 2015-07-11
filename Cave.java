import java.util.Scanner;


public class Cave {
	
	Character a;
	Monster b;
	int i = 0;
	private boolean battleStatus = true;
	
	public Cave (Character a1) {
		a = a1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to London Cave");
		System.out.println("1 . Enter the cave.");
		System.out.println("2 . Exit the Cave.");
		System.out.print("Enter your choice : ");
		i = sc.nextInt();
		switch (i){
		case 1: 
		b = this.randomMonster();
			do{
			System.out.println("Character HP :"+ a.getHP());
			System.out.println("Enemy HP : "+ b.getHP());
			System.out.println("Character Damage :"+a.getatt());
			System.out.println("Enemy Attack :"+b.getatt());
			System.out.println("BOOM there is a monster " + b.geName());
			System.out.println("1. Attack ");
			System.out.println("2. Flee");
			System.out.print("Enter your choice : ");
			i = sc.nextInt();
			switch (i){
				case 1:
					b.setHP(b.getHP() - a.getatt());
						if (b.getHP() >= 0){
							a.setHP(a.getHP() - b.getatt());
						}
						else if (b.getHP() == 0 || a.getHP() == 0){
							battleStatus = false;
						}
						break;
				case 2:
					battleStatus = false;
					break;
				}
				}while (battleStatus);
		case 2: 
			break;
		}
	}
	
	
	public Monster randomMonster (){
		return new Monster();
		
	}
}

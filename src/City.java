import java.util.Scanner;

/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 2:11:17 PM, Jul 5, 2015
 */

public class City{
	private int InnPrice;
	boolean innInput=true;
	int innChoice;
	private String name;
	Scanner sc = new Scanner(System.in);
	//-----------Constructor----------

	public City(String name, int InnPrice){
		this.name = name;
		this.InnPrice = InnPrice;
	}
	
	public void visitInn(Character p1){
		System.out.println("Welcome to " + this.name +" Inn. We have room here for you to rest. It will cost " + this.InnPrice + "$ per night.");
		System.out.println("Do you wanna stay?");
		System.out.println("1. Yes\n2. No");
		do{
			innChoice = sc.nextInt();
			if(innChoice == 1 || innChoice == 2){
				innInput = false;
				//innChoice = sc.nextInt();
			}
			else{
				System.out.println("Invalid input");
				System.out.println("Enter your choice again. ");
				
			}
		}while(innInput);
		if(innChoice == 1){
			System.out.println("The day has past. You're fully rested.");
			p1.setMoney(p1.getMoney() - InnPrice);
			p1.setHP(p1.getMaxHP());
			System.out.println("Your money " + p1.getMoney());
			//System.out.println("Your HP = " + p1.getHP());
			innChoice = 2;
		}
		else if (innChoice == 2){
			System.out.println("Good bye, come again.");
		}
	}

	
	//--------------Getter---------------
	public String getName() {
		return name;
	}

	
	//---------------Setter--------------
	public void setName(String name) {
		this.name = name;
	}


}

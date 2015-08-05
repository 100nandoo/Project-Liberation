import java.util.Scanner;

/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 9:37:24 PM, Jul 29, 2015
 */

public class Inn  {
	private String InnName;
	private int InnPrice;
	boolean innInput=true;
	int innChoice;
	
	//-----------Constructor----------
	public Inn(String InnName,int InnPrice) {
		this.InnName = InnName;
		this.InnPrice = InnPrice;
	}
	public Inn() {
	}
	

	Scanner sc = new Scanner(System.in);
	
	public void InnMenu(Character p1){
		System.out.println("Welcome to " + this.InnName +" Inn. We have room here for you to rest. It will cost " + this.InnPrice + "$ per night.");
		System.out.println("Do you wanna stay?");
		System.out.println("1. Yes\n2. No");
		do{													//pengulangan bila user salah input
			innChoice = sc.nextInt();
			if(innChoice == 1 || innChoice == 2){			//jika input 1 atau 2, pengulangan diatas berhenti
				innInput = false;
				//innChoice = sc.nextInt();
			}
			else{
				System.out.println("Invalid input");
				System.out.println("Enter your choice again. ");
				
			}
		}while(innInput);
		if(innChoice == 1){														//jika input 1, kerjakan....
			System.out.println("The day has past. You're fully rested.");
			p1.setMoney(p1.getMoney() - InnPrice);
			p1.setHP(p1.getMaxHP());
			System.out.println("Your money " + p1.getMoney());
			//System.out.println("Your HP = " + p1.getHP());
			innChoice = 2;
		}
		else if (innChoice == 2){												//jika input 2, cetak...
			System.out.println("Good bye, come again.");
		}
	}
	
	//--------------Getter---------------
	public String getInnName() {
		return InnName;
	}

	
	//---------------Setter--------------
	public void setInnName(String InnName) {
		this.InnName = InnName;
	}
	
	//--------------Getter---------------
	public int getInnPrice() {
		return InnPrice;
	}

	
	//---------------Setter--------------
	public void setInnPrice(int InnPrice) {
		this.InnPrice = InnPrice;
	}
}

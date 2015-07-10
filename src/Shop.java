import java.util.Scanner;

/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 3:18:32 PM, Jul 10, 2015
 */

public class Shop {
	Scanner sc = new Scanner(System.in);
	private int shopChoice=0;
	private int i;
	private boolean shopStatus = true;
	private int shop_money;
	private Item[] cupboard = new Item[10];
	//-----------Constructor----------
	public Shop() {
		// TODO Auto-generated constructor stub
		this.shop_money = 100;
		cupboard[0] = new HP_Potion(5, "Small Potion");
		cupboard[1] = new HP_Potion(10, "Medium Potion");
		cupboard[2] = new HP_Potion(20, "Large Potion");
		
	}
	
	public void print_item(){
		for(i=0; i < 3; i++){
			System.out.println(i + ". " + cupboard[i].getName());
		}
	}
	
	public void print_menu(){
		do{
			System.out.println("Welcome to item shop. What do you want to do?");
			System.out.println("1. Buy");
			shopChoice = sc.nextInt();
			if (shopChoice != 1){
				System.out.println("Invalid input");
			}
			else{
				switch(shopChoice){
				case 1:
					System.out.println("What do you want to buy?");
					print_item();
					shopChoice = sc.nextInt();
					//this is where i left out--------------------------------------
					shopStatus = false;
					break;
				}
			}
		}while(shopStatus);
		
	}

}

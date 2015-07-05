import java.util.Scanner;
import java.util.Arrays;
/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 3:30:16 PM, Jul 5, 2015
 */

public class Map {
	Scanner sc = new Scanner(System.in);
	private City[] cityList = new City[3];
	private int mapChoice=0;
	private boolean mapStatus = true;
	public void openMap(Character p1){
		do{
			System.out.println("-----Map Menu-----");
			System.out.println("1. Visit Grommich City");
			System.out.println("2. Visit Weldar City");
			mapChoice = sc.nextInt();
			if(mapChoice < 0 && mapChoice > 2){
				System.out.println("Invalid input");
			}
			else{
				switch(mapChoice){
				case 1: 
					System.out.println("Welcome to " + cityList[mapChoice].getName() + " City");
					p1.setPosition(mapChoice);
					mapStatus = false;
					break;
				case 2:
					System.out.println("Welcome to " + cityList[mapChoice].getName());
					p1.setPosition(mapChoice);
					mapStatus = false;
					break;
				}
			}
		}while(mapStatus);
	}
	
	public City getCity(int i){
		return cityList[i];
	}
	//-----------Constructor----------
	public Map() {
		cityList[1] = new City("Grommich", 10);
		cityList[2] = new City("Weldar", 15);
	}

}

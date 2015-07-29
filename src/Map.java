import java.util.Scanner;
import java.util.Arrays;


public class Map {
	Scanner sc = new Scanner(System.in);
	private City[] cityList = new City[3];
	private Cave[] caveList = new Cave[2];
	private TrainingGround[] trainingList = new TrainingGround[1];
	private int mapChoice=0;
	private boolean mapStatus = true;
	Character p1;
	
	public Map(){
		
	}
	
	//-----------Constructor----------
	public Map(Character p1) {
		cityList[1] = new City("Grommich", 10);
		cityList[2] = new City("Weldar", 15);
		caveList[0] = new Cave ("Afrodit");
		caveList[1] = new Cave ("Exodus");
		trainingList[0] = new TrainingGround();
	}
	
	public void openMap(Character p1){
		do{
			System.out.println("-----Map Menu-----");
			System.out.println("1. Visit Grommich City");
			System.out.println("2. Visit Weldar City");
			System.out.println("3. Visit Afrodit Cave");
			System.out.println("4. Visit Exodus Cave");
			System.out.println("5. Si Lau Temple");
			mapChoice = sc.nextInt();
			if(mapChoice < 0 || mapChoice > 5){
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
				case 3: 
					System.out.println("Welcome to " + caveList[0].getName());
					caveList[0].caveMenu(p1);
					p1.setPosition(mapChoice);
					break;
				case 4:
					System.out.println("Welcome to " + caveList[1].getName());
					caveList[1].CaveMenu1(p1);
					p1.setPosition(mapChoice);
					break;
				case 5:
					trainingList[0].visitTemple(p1);
					p1.setPosition(mapChoice);
					break;
				}
			}
		}while(mapStatus);
	}
	
	public City getCity(int i){
		return cityList[i];
	}


}

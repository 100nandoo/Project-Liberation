import java.util.Scanner;
import java.util.Arrays;


public class Map {
	Scanner sc = new Scanner(System.in);
	private City[] cityList = new City[3];
	private Cave[] caveList = new Cave[2];
	private Inn[] InnList = new Inn[3];
	private TrainingGround[] trainingList = new TrainingGround[1];
	private MegaCity[] MegaList = new MegaCity[2];
	private int mapChoice=0;
	private boolean mapStatus = true;
	Character p1;
	
	public Map(){
		
	}
	
	//-----------Constructor----------
	public Map(Character p1) {
		cityList[1] = new City("Grommich", 15);
		cityList[2] = new City("Weldar", 10);
		caveList[0] = new Cave ("Afrodit");
		caveList[1] = new Cave ("Exodus");
		InnList[1] = new Inn("Gatoo",8);
		InnList[2] = new Inn("Cranera",10);
		MegaList[1] = new MegaCity("Carrocos",10);
		trainingList[0] = new TrainingGround();
	}
	
	public void openMap(Character p1, Map m1){
		do{
			System.out.println("----------Map Menu-----------");
			System.out.println("1. Visit Grommich City");
			System.out.println("2. Visit Weldar City");
			System.out.println("3. Visit Afrodit Cave");
			System.out.println("4. Visit Exodus Cave");
			System.out.println("5. Si Lau Temple");
			System.out.println("6. Visit Gatoo Inn");
			System.out.println("7. Visit Cranera Inn");
			System.out.println("8. Visit Carrocos Mega City");
			System.out.println("-----------------------------");
			mapChoice = sc.nextInt();
			if(mapChoice < 0 || mapChoice > 8){
				System.out.println("Invalid input");
			}
			else{
				switch(mapChoice){
				case 1: 
					System.out.println("Welcome to " + cityList[mapChoice].getCityName() + " City");
					p1.setPosition(mapChoice);
					cityList[1].CityMenu(p1,m1);
					mapStatus = false;
					break;
				case 2:
					System.out.println("Welcome to " + cityList[mapChoice].getCityName() + " City");
					p1.setPosition(mapChoice);
					cityList[2].CityMenu(p1,m1);
					mapStatus = false;
					break;
				case 3: 
					System.out.println("Welcome to " + caveList[0].getName());
					caveList[0].caveMenu(p1,m1);
					p1.setPosition(mapChoice);
					break;
				case 4:
					System.out.println("Welcome to " + caveList[1].getName());
					caveList[1].CaveMenu1(p1,m1);
					p1.setPosition(mapChoice);
					break;
				case 5:
					trainingList[0].visitTemple(p1);
					p1.setPosition(mapChoice);
					break;
				case 6:
					p1.setPosition(mapChoice);
					InnList[1].InnMenu(p1);
					break;
				case 7:
					p1.setPosition(mapChoice);
					InnList[2].InnMenu(p1);
					break;
				
				case 8:
					p1.setPosition(mapChoice);
					MegaList[1].MegaCityMenu(p1, m1);
					break;
					
				}
			}
		}while(mapStatus);
	}
	
	public City getCity(int i){
		return cityList[i];
	}

}
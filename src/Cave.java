import java.util.Scanner;

/*
 * Nama			: WILLIAM LINARDI
 * NIM 			: 00000004773
 * Mata Kuliah	: OOP
 */

public class Cave{
	
	Character a;
	//Monster b;
	private Monster monsterList = new Monster();
	private Character characterList = new Character();
	private Status newStatus = new Status();
	private Map newMap = new Map();
	private String caveName;
	int v = 10;
	int i = 0;
	private boolean battleStatus = true;
	Map c;
//====================================================================
	
	
	public Cave (String Name) {
		this.caveName = Name;
	}
		
//====================================================================	
	public void caveMenu (Character a1){
		a = a1;
	Scanner sc = new Scanner(System.in);
	System.out.println("1 . Enter the cave.");
	System.out.println("2 . Exit the Cave.");
	System.out.println("3 . Show Status.");
	System.out.println("4 . Open Map.");
	System.out.print("Enter your choice : ");
	i = sc.nextInt();
	switch (i){
	case 1: 
		do{
		System.out.println("Character HP :"+ characterList.getHP());
		System.out.println("Enemy HP : "+ monsterList.getHP());
		System.out.println("Character Damage :"+characterList.getatt());
		System.out.println("Enemy Attack :"+monsterList.getatt());
		System.out.println("BOOM there is a monster " + monsterList.geName());
		System.out.println("1. Attack ");
		System.out.println("2. Flee");
		System.out.print("Enter your choice : ");
		i = sc.nextInt();
		switch (i){
			case 1:
				//monsterList.attackMonster();
				monsterList.setHP(monsterList.getHP() - characterList.getatt());
				if (monsterList.getHP() <= 1){
					Wait(500);
					System.out.println("\n");
					System.out.println("You killed " + monsterList.geName());
					System.out.println("Yeay you get Money");
					characterList.setMoney(characterList.getMoney() + v);
					System.out.println("Your Balance : "+ characterList.getMoney());
					System.out.println("\n");
					battleStatus = false;
				}
				else if (characterList.getHP() <= 1){
					Wait(500);
					System.out.println("\n");
					characterList.setMoney(characterList.getMoney()-5);
					System.out.println("You have been killed by " + monsterList.geName());
					System.out.println("poorly you have to pay for your medicine $5");
					System.out.println("Your Balance :$ " + characterList.getMoney());
					System.out.println("\n");
					battleStatus = false;
				}
				else if (monsterList.getHP() >= 0){
					characterList.setHP(characterList.getHP() - monsterList.getatt());
				}
				break;
			case 2:
				battleStatus = false;
				break;
			}
			}while (battleStatus);
	case 2: 
		break;
	case 3:
		newStatus.print();
		characterList.print();
		break;
		
	case 4:
		newMap.openMap(a1);
		}
	
	}
	
	
	
	
//--------------------------------------------------------------
	public void Wait(int a){
		try{
			Thread.sleep(a);
		}catch (InterruptedException e){
			
		}
	}

//----------- ---------------getter---------------------------
	public String getName() {
		return caveName;
	}

//------------ ---------------Setter---------------------------
	public void setName(String name) {
		caveName = name;
	}
}


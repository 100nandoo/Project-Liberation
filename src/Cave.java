import java.util.Scanner;
import java.awt.Color;

public class Cave{
	
	Character a;
	Monster b;
	private Monster monsterList = new Monster();
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
	public void caveMenu (Character a1, Map m1){
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome To Cave Menu 1");
	System.out.println("1 . Enter the cave.");
	System.out.println("2 . Exit the Cave.");
	System.out.println("3 . Show Status.");
	System.out.println("4 . Open Map.");
	System.out.print("Enter your choice : ");
	i = sc.nextInt();
	switch (i){
	case 1: 
		do{
		monsterList.MonsterMenu1();
		System.out.println("BOOM there is a monster " + monsterList.getName());
		System.out.println();
		System.out.println("Character HP :"+ a1.getHP());
		System.out.println("Character Damage :"+a1.getatt());
		System.out.println("--------------------------------");
		System.out.println("Enemy HP : "+ monsterList.getHP());
		System.out.println("Enemy Attack :"+monsterList.getatt());
		System.out.println("---------------------------------");
		System.out.println("1. Attack ");
		System.out.println("2. Flee");
		System.out.print("Enter your choice : ");
		i = sc.nextInt();
		switch (i){
			case 1:
				//Wait(10000);
				monsterList.setHP(monsterList.getHP() - a1.getatt());
				if (monsterList.getHP() <= 1){
					Wait(500);
					System.out.println("\n");
					System.out.println("You killed " + monsterList.getName());
					System.out.println("Yeay you get Money");
					a1.setMoney(a1.getMoney() + v);
					a1.setExp(a1.getExp()+25);
					System.out.println("Your Balance : "+ a1.getMoney());
					System.out.println("Your curretn exp = " +a1.getExp() +"/" + a1.getMaxExp());
					System.out.println("\n");
					battleStatus = false;
					if (a1.getExp() >= a1.getMaxExp()){
						System.out.println("LEVEL UP");
						a1.setLvl(a1.getLvl()+1);
						System.out.println ("Your Level : " + a1.getLvl());
					}
				}
				else if (a1.getHP() <= 1){
					Wait(500);
					System.out.println("\n");
					a1.setMoney(a1.getMoney()-5);
					System.out.println("You have been killed by " + monsterList.getName());
					System.out.println("poorly you have to pay for your medicine $5");
					System.out.println("Your Balance :$ " + a1.getMoney());
					System.out.println("Your curretn exp = " +a1.getExp() +"/" + a1.getMaxExp());
					System.out.println("\n");
					battleStatus = false;
				}
				else if (monsterList.getHP() >= 0){
					a1.setHP(a1.getHP() - monsterList.getatt());
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
		a1.print();
		break;
		
	case 4:
		newMap.openMap(a1,m1);
		}
	}
//-----------------------------------------------Cave Menu 2 -----------------------------------------------
	public void CaveMenu1(Character a1,Map m1){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Cave Menu 2");
		System.out.println("1 . Enter the cave.");
		System.out.println("2 . Exit the Cave.");
		System.out.println("3 . Show Status.");
		System.out.println("4 . Open Map.");
		System.out.print("Enter your choice : ");
		i = sc.nextInt();
		switch (i){
		case 1: 
			do{
			monsterList.MonsterMenu2();
			System.out.println("BOOM there is a monster " + monsterList.getName());
			System.out.println("Character HP :"+ a1.getHP());
			System.out.println("Character Damage :"+a1.getatt());
			System.out.println("---------------------------------------");
			System.out.println("Enemy HP : "+ monsterList.getHP());
			System.out.println("Enemy Attack :"+monsterList.getatt());
			System.out.println("---------------------------------------");
			System.out.println("1. Attack ");
			System.out.println("2. Flee");
			System.out.print("Enter your choice : ");
			i = sc.nextInt();
			switch (i){
				case 1:
					//Wait(10000);
					monsterList.setHP(monsterList.getHP() - a1.getatt());
					if (monsterList.getHP() <= 1){
						Wait(500);
						System.out.println("\n");
						System.out.println("You killed " + monsterList.getName());
						System.out.println("Yeay you get Money");
						a1.setMoney(a1.getMoney() + v);
						a1.setExp(a1.getExp()+25);
						System.out.println("Your Balance : "+ a1.getMoney());
						System.out.println("Your curretn exp = " +a1.getExp() +"/" + a1.getMaxExp());
						System.out.println("\n");
						battleStatus = false;
						if(a1.getExp() == a1.getMaxExp()){
							System.out.println("LEVEL UP");
							a1.setLvl(a1.getLvl()+1);
							System.out.println ("Your Level : " + a1.getLvl());						}
					}
					else if (a1.getHP() <= 1){
						Wait(500);
						System.out.println("\n");
						a1.setMoney(a1.getMoney()-5);
						System.out.println("You have been killed by " + monsterList.getName());
						System.out.println("poorly you have to pay for your medicine $5");
						System.out.println("Your Balance :$ " + a1.getMoney());
						System.out.println("Your current exp = " +a1.getExp() +"/" + a1.getMaxExp());
						System.out.println("\n");
						battleStatus = false;
					}
					else if (monsterList.getHP() >= 0){
						a1.setHP(a1.getHP() - monsterList.getatt());
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
			a1.print();
			break;
			
		case 4:
			newMap.openMap(a1,m1);
			}
		
		}
	
	
	
//----------------------------------------------------------------------------------------------------------
	public void Wait(int a){
		int x=a;
		try{
			for(; x>0 ; x-=250){
				System.out.print("..");
				Thread.sleep(250);
			}
		System.out.println("\n");
		}catch (InterruptedException e){
		}
	}

//----------- -----------------------------------------getter------------------------------------------------
	public String getName() {
		return caveName;
	}

//------------ ----------------------------------------Setter------------------------------------------------
	public void setName(String name) {
		caveName = name;
	}
}


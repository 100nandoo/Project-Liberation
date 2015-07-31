import java.util.Scanner;

public class TrainingGround {
	Character a;
	private String name;
	private boolean choice = true;
	private boolean choice2 = true;
	Map b;
	int i = 0, m = 0;	
	
	//-----------Constructor---------
	public void TrainingMenu(){
		name = "Si Lau Temple";
	}
	
	public void visitTemple(Character a1){
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Welcome to Si Lau Temple");
		
				
				do{
					System.out.println("These are the best Kung Fu Master that we have");
					System.out.println("1. Master Baba Aliong ($18)");
					System.out.println("2. Master Khe Mo Cheng ($10) ");
					System.out.println("3. Master Si Lau ($36) ");
					System.out.println("4. Exit");
					
					m = sc.nextInt();
					switch (m){
					case 1 : 
						Wait(6000);
						System.out.println("You have been trained with Baba Alion");
						System.out.println("your damage increase + 2");
						a1.setatt(a1.getatt()+2);
						a1.setMoney(a1.getMoney()-10);
						a1.setHP(a1.getHP()+5);
						a1.setMaxHP(a1.getMaxHP()+5);
						System.out.println("Paid baba Aliong  $10, Current Balance $"+ a1.getMoney());
						System.out.println("Current Damage :"+a1.getatt());
						break;
					case 2:
						Wait(10000);
						System.out.println("You have been trained with Khe Mo Cheng");
						System.out.println("your damage increase + 2");
						a1.setatt(a1.getatt()+2);
						a1.setMoney(a1.getMoney()-10);
						a1.setHP(a1.getHP()+5);
						a1.setMaxHP(a1.getMaxHP()+5);
						System.out.println("Paid Master Khe Mo Cheng $17, Current Balance $"+ a1.getMoney());
						System.out.println("Current Damage :"+a1.getatt());
						break;
					case 3:
						Wait(12000);
						System.out.println("You have been trained with Master Si Lau");
						System.out.println("your damage increase + 4");
						a1.setatt(a1.getatt()+4);
						a1.setMoney(a1.getMoney()-36);
						a1.setHP(a1.getHP()+5);
						a1.setMaxHP(a1.getMaxHP()+5);
						System.out.println("Paid Master Si Lau $32, Current balance $"+ a1.getMoney());
						System.out.println("Current Damage :"+a1.getatt());
						break;
					case 4:
						choice2 = false;
					}
				}while(choice2);

	}
	
	//--------------------------------------------------------------
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
}



import java.util.Scanner;

public class TrainingGround {
	Character a;
	private String name;
	private Status newStatus = new Status();
	private Character characterList = new Character();
	int i = 0, m = 0;	
	
	public TrainingGround(String Name){
		this.name = name;
	}
	
	public void TrainingMenu(Character a1){
		a = a1;
		System.out.println("Hei, welcom to the Training Ground ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready to start, training?");
		System.out.println("1. Yap");
		System.out.println("2. Hell no!");
		i = sc.nextInt();
		switch (i){
		case 1 :
			System.out.println("These are the best Kung Fu Master that we have");
			System.out.println("1. Master Baba Aliong ($10)");
			System.out.println("2. Master Khe Mo Cheng ($17) ");
			System.out.println("3. Master Si Lau ($32) ");
			System.out.println("Your Choice :");
			m = sc.nextInt();
			switch (m){
			case 1 : 
				System.out.println("You have been trained with Baba Alion");
				System.out.println("your damage increase + 5");
				newStatus.setatt(newStatus.getatt()+5);
				characterList.setatt(newStatus.getatt());
				characterList.setMoney(characterList.getMoney()-10);
				System.out.println("Paid baba Aliong  $10, Current Balance $"+ characterList.getMoney());
				System.out.println("Current Damage :"+newStatus.getatt());
				break;
			case 2:
				System.out.println("You have been trained with Khe Mo Cheng");
				System.out.println("your damage increase + 13");
				newStatus.setatt(newStatus.getatt()+13);
				characterList.setatt(newStatus.getatt());
				characterList.setMoney(characterList.getMoney()-17);
				System.out.println("Paid Master Khe Mo Cheng $17, Current Balance $"+ characterList.getMoney());
				System.out.println("Current Damage :"+newStatus.getatt());
				break;
			case 3:
				System.out.println("You have been trained with Master Si Lau");
				System.out.println("your damage increase + 24");
				newStatus.setatt(newStatus.getatt()+24);
				characterList.setatt(newStatus.getatt());
				characterList.setMoney(characterList.getMoney()-32);
				System.out.println("Paid Master Si Lau $32, Current balance $"+ characterList.getMoney());
				System.out.println("Current Damage :"+newStatus.getatt());
				break;
			}
		case 2 : 
			break;
		}
	}
}

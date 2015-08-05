import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 7:14:10 PM, Jul 30, 2015
 */

public class MegaCity extends City{
	private String MegaCityName;
	private int i, ti, udah = 0;
	private boolean tc=true;
	private boolean tc2=true;
	private int waitTime = 3000;

	//-----------Constructor----------
	public MegaCity() {
		// TODO Auto-generated constructor stub
	}
	public MegaCity(String MegaCityName, int InnPrice) {
		this.MegaCityName = MegaCityName;
		setInnName(MegaCityName);
		setInnPrice(InnPrice);


	}

	public void MegaCityMenu(Character p1, Map m1){
		College kampus = new College();
		do{
			System.out.println("-----Menu-----");
			System.out.println("1. Show status");
			System.out.println("2. Visit Inn");
			System.out.println("3. Open Map");
			if(p1.getLvl() % 5 == 0)
			System.out.println("4. Enter Sacred temple");
			System.out.println("5. Visit College");
			i = sc.nextInt();
			switch(i){
			case 1: 
				p1.print();
				break;
			case 2:
				InnMenu(p1);
				break;
			case 3:
				m1.openMap(p1,m1);
				break;
			case 4:
				if(p1.getLvl() % 5 != 0){
					break;
				}
				System.out.println("Welcome to the Temple.");
				do{
					System.out.println("1. Begin the ritual");
					System.out.println("2. Get out. This place is weird");
					ti = sc.nextInt();
					switch (ti){
						case 1: System.out.println("Prepare your heart");
							Dot(4000);
							System.out.println("Body");
							Dot(waitTime);
							System.out.println("Mind");
							Dot(waitTime);
							System.out.println("and Soul.");
							Dot(waitTime);
							do{
								System.out.println("(The Vallarth start to pray)");
								Dot(3000);
								System.out.println("Oh.... Our Divine Pioneer, I bring you your pupil.");
								Dot(4000);
								System.out.println("May your vision guide the path of his life.");
								Dot(3000);
								System.out.println("May every step that he takes, bring us THE TRUE LIBERATION that you've prepared.");
								System.out.println("Vallarth stop praying");
								Dot(5000);
								System.out.println("Vallarth told you to put your hand on one of the SACRED TOMB.");
								System.out.println("(There are two SACRED TOMB in the temple)");
								System.out.println("(1. Where Gollur the Might is buried.)");
								System.out.println("(2. Where Visarr the Bright is buried.)");
								System.out.println("Make your choice");
								ti = sc.nextInt();
								Dot(waitTime);
								if(p1.getLvl() % 5 != 0){
									System.out.println("Vallarth shout at you. He told you to leave the temple!!!");
									System.out.println("(You're not ready)");
									tc2=false;
								}
								switch (ti){
									case 1:
										Dot(waitTime);
										System.out.println("A bright light shine trough the ceiling of the temple");
										Dot(waitTime);
										System.out.println("Instantly, your feel your body become stronger");
										Dot(4000);
										System.out.println("As the light start to disappear");
										Dot(1000);
										System.out.print("The priest start saying that, ");
										System.out.println("You have become Warrior of Bremar");
										Dot(waitTime);
										Dot(waitTime);
										System.out.println("(Your defense and health has increase.)");
										Temple(p1,1);
										break;
									case 2:
										Dot(waitTime);
										System.out.println("A bright light shine trough the ceiling of the temple");
										Dot(waitTime);
										System.out.println("Instantly, your feel your body become stronger");
										Dot(4000);
										System.out.println("As the light start to disappear");
										Dot(1000);
										System.out.print("The priest start saying that, ");
										System.out.println("You have become Warrior of Stenmar");
										Dot(waitTime);
										Dot(waitTime);
										System.out.println("(Your attack and health has increase.)");
										Temple(p1,2);
										break;
								}
								tc2=false;
							}while (tc2);

						case 2: tc=false;
							break;
					}
				}while(tc);

				case 5:
					kampus.CollegeMenu(getMegaCityName(),m1,p1);
					break;

			}

		}while(true);
	}

	public void Temple(Character p1, int Path){
		switch(Path){
		case 1:
			p1.setMaxHP(p1.getMaxHP() + 50);
			p1.setDef(p1.getDef() + 10);
			p1.setLvl(p1.getLvl() + 1);
			break;
			case 2:
				p1.setMaxHP(p1.getMaxHP() + 50);
				p1.setatt(p1.getatt() + 10);
				p1.setLvl(p1.getLvl() + 1);

		}
	}
	
	//--------------Getter---------------
	public String getMegaCityName() {
		return MegaCityName;
	}

	//---------------Setter--------------
	public void setMegaCityName(String megaCityName) {
		MegaCityName = megaCityName;
	}
	
	//--------------Wait----------------
	public void Wait(int a){
		try{
			Thread.sleep(a);
		}catch(InterruptedException e){
			
		}
	}

	//-------------Membuat loading dengan titik---------------------------
	public void Dot(int b){
		int x;
		try{
			for(x=0 ; x<b; x+=250){
				System.out.print(".");
				Thread.sleep(250);
			}
			System.out.println("");
		}catch(InterruptedException e){

		}
	}
}

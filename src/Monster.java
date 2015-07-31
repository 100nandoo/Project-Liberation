import java.util.Random;

public class Monster extends Status {
	Monster b;
	Character a;
	public String Name; 
	Random rand = new Random();
	public Monster() {
		super();
		}
	
	public void MonsterMenu1(){
		int  MonsterSelect = rand.nextInt(5) + 1;
		int  hpMonster1 = rand.nextInt(20)+1;
		int  attMonster = rand.nextInt(10)+1;
		switch (MonsterSelect){
		case 1: 
			this.setName("Monster Boklan");
			this.setMaxHP(hpMonster1);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster);
			break;
		case 2: 
			this.setName("Monster Zoda");
			this.setMaxHP(hpMonster1);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster);
			break;
		case 3: 
			this.setName("Monster Jom");
			this.setMaxHP(hpMonster1);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster);
			break;
		case 4: 
			this.setName("Monster Holly Horse");
			this.setMaxHP(hpMonster1);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster);
			break;
		case 5:
			this.setName("Monster Lunker");
			this.setMaxHP(hpMonster1);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster);
			break;
		
			}	
		
		}
	public void MonsterMenu2(){
		int  monsterSelect2 = rand.nextInt(5) + 1;
		int  hpMonster2 = rand.nextInt(50) + 40;
		int  attMonster2 = rand.nextInt(50) + 40;
		switch (monsterSelect2) {
		case 1:
			this.setName("Monster Bulky Lunker");
			this.setMaxHP(hpMonster2);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster2);
			break;
		case 2:
			this.setName("Monster Cannibal");
			this.setMaxHP(hpMonster2);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster2);
			break;
		case 3:
			this.setName("Monster Great Worm");
			this.setMaxHP(hpMonster2);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster2);
			break;
		case 4:
			this.setName("Monster Abba ");
			this.setMaxHP(hpMonster2);
			this.setHP(this.getMaxHP());
			this.setatt(attMonster2);
			break;
			}
		}
	}

	


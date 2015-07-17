import java.util.Random;
/*
 * Name		: WILLIAM LINARDI
 * NIM		: 00000004773
 */

public class Monster extends Status {
	Monster b;
	Character a;
	public Monster() {
		super();
		Random rand = new Random();
		int  g = rand.nextInt(5) + 1;
		int  z = rand.nextInt(20)+1;
		int  x = rand.nextInt(15)+1;
		switch (g){
		case 1: 
			this.setName("Monster Afrodit");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 2: 
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 3: 
			this.setName("Monster Jom");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 4: 
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 5:
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 6:
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 7:
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 8:
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
		case 9:
			this.setName("Monster Zoda");
			this.setMaxHP(z);
			this.setHP(this.getMaxHP());
			this.setatt(x);
			}	
		}

	public void attackMonster(){
		this.setHP(b.getHP()- a.getatt());
		if (b.getHP() >= 0){
			a.setHP(a.getHP() - b.getatt());
		}
		else if (b.getHP() == 0 || a.getHP() == 0){
		}
	}
	}


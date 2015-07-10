/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 2:52:55 PM, Jul 10, 2015
 */

public class Potion extends Item{

	private int effect_poin;
	private int type;
	
	//-----------Constructor----------
	public Potion(int type, int effect_poin) {
		if (type == 1){
			
		}
		
	}
	
	public void effect(Character p1){
		if(effect_poin > p1.getMaxHP())
			effect_poin = p1.getMaxHP();
		p1.setHP(effect_poin);
	}

}

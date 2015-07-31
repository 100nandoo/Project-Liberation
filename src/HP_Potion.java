public class HP_Potion extends Item{

	private int effect_poin;
	
	
	//-----------Constructor----------
		public HP_Potion() {
			effect_poin = 5;
		}
	//-----------Constructor----------
	public HP_Potion(int effect_poin, String name) {
			this.effect_poin = effect_poin;
			super.setName(name);
	}
	
	public void effect(Character p1){
		if(effect_poin > p1.getMaxHP())
			effect_poin = p1.getMaxHP();
		p1.setHP(effect_poin);
	}

	
	
}
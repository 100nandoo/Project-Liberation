import java.util.Scanner;

public class City extends Inn{
	private String cityName;
	private int i;
	Shop ss = new Shop();

	//-----------Constructor----------
	public City(String cityName, int InnPrice){
		this.cityName = cityName;
		setInnName(cityName);
		setInnPrice(InnPrice);
	}
	public City(){
		
	}
	
	//--------------Getter---------------
	public String getCityName() {
		return cityName;
	}
	
	//---------------Setter--------------
	public void setCityName(String cityName) {
		cityName = cityName;
	}

	public void CityMenu(Character p1, Map m1){
		do{
			System.out.println("-----Menu-----");
			System.out.println("1. Show status");
			System.out.println("2. Visit Inn");
			System.out.println("3. Open Map");
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
			}
			
		}while(true);
	}
}
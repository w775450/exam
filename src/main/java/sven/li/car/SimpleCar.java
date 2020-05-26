package sven.li.car;

public class SimpleCar extends AbstractCar{	
	
	public SimpleCar(CarPark park,int x,int y,String o) {
		super.setCurrentPark(park);
		super.setOrientation(o);  
		super.setPositionX(x);
		super.setPositionY(y);
	}
	

}

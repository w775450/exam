package sven.li.car;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import sven.li.car.command.CarCommandFactory;

public abstract class AbstractCar implements Car{
	private Logger log = LoggerFactory.getLogger(AbstractCar.class);
	public static List<String> CAR_DIRECTIONS =  Arrays.asList("N","E","S","W");
	
	private CarPark currentPark;
	
	private int positionX;
	private int positionY;   
	private String orientation;
	  

	@Override
	public void move(String command) {
		log.info("car excute command : {}",command);
		CarCommandFactory.getCommand(command).excute(this); 
		log.info("car's position: {},{};car's orientation:{}",positionX,positionY,orientation);
	}

	@Override
	public int getPositionX() { 
		return positionX;
	}

	@Override
	public int getPositionY() { 
		return positionY;
	}

	@Override
	public String getOrientation() { 
		return orientation;
	}
	 

	 
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public CarPark getCurrentPark() {
		return currentPark;
	}

	public void setCurrentPark(CarPark currentPark) {
		this.currentPark = currentPark;
	}
	 
	
	
	
	
}

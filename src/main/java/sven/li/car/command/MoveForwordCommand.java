package sven.li.car.command;

import sven.li.car.AbstractCar;
import sven.li.car.CarException;

public class MoveForwordCommand implements CarCommand {

	@Override
	public void excute(AbstractCar car) {
		switch (car.getOrientation()) {
		case "N":
			car.setPositionY(car.getPositionY() + 1);
			break;
		case "E":
			car.setPositionX(car.getPositionX() + 1);
			break;
		case "S":
			car.setPositionY(car.getPositionY() - 1);
			break;
		case "W":
			car.setPositionX(car.getPositionX() - 1);
			break;
		default:
			break;
		}
		if (car.getPositionX() > car.getCurrentPark().getParkX() 
				|| car.getPositionY() > car.getCurrentPark().getParkY() 
				|| car.getPositionX() < 1
				|| car.getPositionY() < 1) {
			throw new CarException("out of boundary");
		}
	}

}

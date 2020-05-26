package sven.li.car.command;

import sven.li.car.AbstractCar;

public class TurnsClockwiseCommand implements CarCommand{

	@Override
	public void excute(AbstractCar car) { 
		String  o = car.getOrientation();
		int nextIndex = AbstractCar.CAR_DIRECTIONS.indexOf(o) + 1;
		if(nextIndex >= AbstractCar.CAR_DIRECTIONS.size()) {
			nextIndex = 0;
		}
		car.setOrientation(AbstractCar.CAR_DIRECTIONS.get(nextIndex));
	}

}

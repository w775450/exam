package sven.li.car.command;

import sven.li.car.CarException;

public class CarCommandFactory {
	public  static CarCommand getCommand(String c) {
		CarCommand command;
		switch (c) {
		case "T": 
			command = new TurnsClockwiseCommand();	
			break;
		case "M": 
			command = new MoveForwordCommand();	
			break;
		default:
			throw new CarException("Undefined command"); 
		}
		return command;
	}
}

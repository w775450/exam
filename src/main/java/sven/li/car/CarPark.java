package sven.li.car;

public class CarPark {
	
	
	public CarPark(int parkX, int parkY) {
		super();
		this.parkX = parkX;
		this.parkY = parkY;
	}

	private int parkX;
	private int parkY;

	public int getParkX() {
		return parkX;
	}

	public void setParkX(int parkX) {
		this.parkX = parkX;
	}

	public int getParkY() {
		return parkY;
	}

	public void setParkY(int parkY) {
		this.parkY = parkY;
	}

}

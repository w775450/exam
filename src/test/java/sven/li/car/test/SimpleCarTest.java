package sven.li.car.test;

import static org.junit.Assert.assertEquals;
 
import org.junit.Test;

import sven.li.car.Car;
import sven.li.car.CarPark;
import sven.li.car.SimpleCar;

public class SimpleCarTest {
	@Test
	public void test1() {
		Car car = new SimpleCar(new CarPark(4,4),1, 1, "N"); 
		car.move("T");
		assertCar(car,1,1,"E");
	}
	
	@Test
	public void test2() {
		Car car = new SimpleCar(new CarPark(4,4),1, 1, "N"); 
		car.move("M");
		assertCar(car,1,2,"N");
	}
	
	@Test
	public void test3() {
		Car car = new SimpleCar(new CarPark(4,4),1, 1, "E"); 
		car.move("M");
		assertCar(car,2,1,"E");
	}
	
	@Test
	public void test4() {
		Car car = new SimpleCar(new CarPark(4,4),1, 1, "W"); 
		car.move("M"); 
	}	
	@Test
	public void test5() {
		Car car = new SimpleCar(new CarPark(4,4),1, 1, "E"); 
		car.move("M"); 
		car.move("M"); 
		assertCar(car,3,1,"E");

	}	

	protected  void assertCar(Car car,int x,int y,String o) {
		assertEquals(x, car.getPositionX());
		assertEquals(y, car.getPositionY());
		assertEquals(o, car.getOrientation());
	}
}

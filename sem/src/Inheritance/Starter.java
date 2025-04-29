package Inheritance;

public class Starter {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.speed=10;
		c1.capacity=5;
		System.out.println(c1.speed);
		System.out.println(c1.capacity);
		Bike b1= new Bike();
		b1.speed=30;
		b1.run();
		
	}
}

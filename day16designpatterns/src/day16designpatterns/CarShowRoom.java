package day16designpatterns;

public class CarShowRoom {

	public static void main(String[] args) {
		
		Car car=CarFactory.makeACar("Hynduai");
		System.out.println(car);
		
		car=CarFactory.makeACar("Toyota");
		System.out.println(car);

	}

}

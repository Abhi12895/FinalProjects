package day16designpatterns;

public class CarFactory {

	public static Car makeACar(String brand) {//it should be static
		if(brand.equals("Hynduai"))return new Hynduai();
		
		else if(brand.equals("Toyota"))return new Toyota();
		
		return null;
	}
}

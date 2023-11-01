package temp;

import protected_access.Cars;

public class Japanese_Cars extends Cars{
	
	public void setCarDetails() {
		make = "BMW";
		//model = "X6";  default cant be accessed outside package
		//year = 2018;
	}

}

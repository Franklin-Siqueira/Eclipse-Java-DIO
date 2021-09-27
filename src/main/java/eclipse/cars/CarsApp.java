package eclipse.cars;

import eclipse.models.CarsModel;

public class CarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendor vendorN = new Vendor();
		CarsModel carModels = new CarsModel();
		
		System.out.println(vendorN);
		System.out.println(carModels);

	}

}

class Vendor {
	public String name;
	public String city;
}
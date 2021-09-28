package eclipse.cars;

import eclipse.models.CarsModel;
import eclipse.models.Vendors;

public class CarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendor vendorN = new Vendor();
		Vendors vendorX = new Vendors();
		CarsModel carModels = new CarsModel();
		
		carModels.setMake("ford");
		carModels.setModel("mustang");
		carModels.setColor("red");
		carModels.setYear(2015);
		
		vendorX.setName("Dealer X");
//		vendorX.setMake("ford", carModels.getMake().toString());
//		vendorX.setMake(["ford", "GM", "Chrysler"]);
		vendorX.setState("PE");
		vendorX.setCity("Recife");
		
		
		System.out.println(vendorN);
		System.out.println(vendorX);
		System.out.println(carModels);

	}

}

class Vendor {
	public String name;
	public String city;
}
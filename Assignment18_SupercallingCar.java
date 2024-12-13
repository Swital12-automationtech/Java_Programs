package assignments_gtm; //Constructor
class Vehicle
{
	Vehicle()
	{
		System.out.println("Honda cars");
	}
}
public class Assignment18_SupercallingCar extends Vehicle {
	Assignment18_SupercallingCar()
	{
		super();
		System.out.println("Car company with all models of honda");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Assignment18_SupercallingCar();
	}

}

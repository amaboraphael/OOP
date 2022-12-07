package classCar;

public class carclass {

	public static void main(String[] args) {
		Car car1=new Car();
		
		car1.brake();
		car1.accelerate();
		car1.setModel(null);
		car1.getModel();
		Car car2 = new Car("Renault","Clio",0);
		car2.refuel(5);
		
	}

}// end of main


class Car{
	//Default constructor
	public Car()
	{
		brand="";
		model="";
		amountOfFuel=0;
	}
	//parametized constructor
	public Car(String brand, String model, int amountOfFuel)
	{
		this.brand=brand;
		this.model=model;
		this.amountOfFuel=amountOfFuel;
		printData();
	}
	
	
	private String brand="kia";
	private String model="Rio";
	private int amountOfFuel=0;
	
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	
	
	
	public void brake() 
	{
		System.out.println("Car is breaking");
		
	}
	
	public void accelerate()
	{
		amountOfFuel--;
		if(amountOfFuel > 0)
			System.out.println("Car is accelerating");
	}
	// method which will print the data
	private void printData()
	{
	System.out.println("Brand: "+ brand);
	System.out.println("Model: "+ model);
	System.out.println("Fuel: "+ amountOfFuel);
	}
	//this method adds an amount of fuel to whats left in the tank
	public void refuel(int amount)
	{
		System.out.println("Fuel in the tank: " + amountOfFuel);
		amountOfFuel=amount + amountOfFuel;
		
		System.out.println("Refuel: "+ amount);
		
		System.out.println("Fuel in the tank after the refuel:" + amountOfFuel);
		
	}

	
}

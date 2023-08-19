package Asngnmt2;

public class Car 
{
	//Initialize variables
	private int year;
	private double price;
	private String make;
	private String vin;
	public static int count;
	
	//Default constructor
	public Car()
	{
		year = 1970;
		price = 0;
		make = "N/A";
		vin = "N/A";
		
		//Increment count
		count++;
	}
	
	//Overloaded constructor
	public Car(int y, double p, String m, String v) throws CarException
	{
		try
		{
			setYear(y);
			setPrice(p);
			setMake(m);
			setVIN(v);
			
			//Increment count
			count++;
		}
		catch(CarException e)
		{
			System.out.println(e.getMsg());
			throw e;
		}
	}
	
	//Copy constructor
	public Car(Car x) throws CarException
	{
		try
		{
			setYear(x.getYear());
			setPrice(x.getPrice());
			setMake(x.getMake());
			setVIN(x.getVIN());
			
			//Increment count
			count++;
		}
		catch(CarException e)
		{
			throw new CarException(e.getMessage());
		}
	}
	
	//Return year
	public int getYear()
	{
		return year;
	}
	
	//Set year of car
	public void setYear(int y) throws CarException
	{
		if(y >= 1970 && y <= 2011)
			year = y;
		else
			throw new CarException("Invalid Year");
	}
	
	//Return price
	public double getPrice()
	{
		return price;
	}
	
	//Set price of car
	public void setPrice(double p) throws CarException
	{
		if(p >= 0 && p <= 100000)
			price = p;
		else
			throw new CarException("Invalid Price");
	}
	
	//Set make of the car
	public void setMake(String m) throws CarException
	{
		if(m == null || m.isEmpty())
		{
			System.out.println("in expected area");
			throw new CarException("Invalid Make");
		}
		else
			make = m;
	}
	
	//Get make of the car
	public String getMake()
	{
		return make;
	}
	
	//Set VIN of the car
	public void setVIN(String v) throws CarException
	{
		if(v == null || v.isEmpty())
			throw new CarException("Invalid VIN");
		else
			vin = v;
	}
	
	//Get VIN of the car
	public String getVIN()
	{
		return vin;
	}
	
	//ToString
	public String toString()
	{
		return "[Year: " + year + ", Price: " + ((int) price) + ", Make: " + make + ", VIN: " + vin + "]";
	}
	
	//Get count
	public int getCount()
	{
		return count;
	}
	
	//Finalize method
	protected void finalize()
	{
		//Decrement count
		count--;
		System.out.println("The finalize method of the car class was called.");
	}
}

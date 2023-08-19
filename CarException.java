package Asngnmt2;

public class CarException extends Exception
{
	//Instance variable
	private String msg;
	
	//Overloaded constructor
	public CarException(String x)
	{
		setMessage(x);
	}
	
	//Return message
	public String getMsg()
	{
		return msg;
	}
	
	//Set message
	public void setMessage(String m)
	{
		msg = m;
	}
}

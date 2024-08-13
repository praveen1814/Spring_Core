package Spring_Core.SIM;

public class Airtel implements Sim{
	
	Airtel()
	{
		System.out.println("airtel constructor is loaded");
	}
	public void calling()
	{
		System.out.println("calling from airtel sim");
	}
	public void data()
	{
		System.out.println("browsing using airtel sim");
	}
}

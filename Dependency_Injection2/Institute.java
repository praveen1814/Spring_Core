package Dependency_Injection;

public interface Institute {
		public void getCollegeName();
}

class College implements Institute
{
	public void getCollegeName()
	{
		System.out.println("Cits");
	}
}
class Location implements Institute
{
	public void getCollegeName()
	{
		System.out.println("wits");
	}
}
class Info implements Institute
{
	public void getCollegeName()
	{
		System.out.println("kits");
	}
}

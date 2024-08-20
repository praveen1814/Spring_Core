
package Spring_Core.Dependency_Injection_Object_Returntype;

public class Student {
	private int id;
	private MathCheat mathcheat;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat=mathcheat;
	}

	public void cheat()
	{
		mathcheat.cheating();
		System.out.println("my id is "+ id);
	}
	
	
}

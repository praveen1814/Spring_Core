
package Spring_Core.loose_coupling;

public class Student{
	private Cheating cheat;
	
	
	public void setcheat(Cheating cheat) {
		this.cheat=cheat;
	}	
	public void cheat()
	{
		cheat.cheat();
	}
	
	
}

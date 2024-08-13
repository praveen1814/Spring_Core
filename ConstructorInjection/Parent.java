package ConstructorInjection;

public class Parent {
	String pname;
	String pdept;
	int pid;
	public Parent(String pname, String pdept, int pid) {
		this.pname = pname;
		this.pdept = pdept;
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Parent [pname=" + pname + ", pdept=" + pdept + ", pid=" + pid + "]";
	}
	
	
	
}

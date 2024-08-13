package ConstructorInjection;

public class Student {
	String sname;
	int sroll;
	Parent parent;
	public Student(String sname, int sroll, Parent parent) {
		this.sname = sname;
		this.sroll = sroll;
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sroll=" + sroll + ", parent=" + parent + "]";
	}
	
	
}

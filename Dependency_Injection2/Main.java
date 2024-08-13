package Dependency_Injection;

public class Main {

	public static void main(String[] args) {
		Institute institute=new College();
		Student stu=new Student(institute);
		stu.getInfo();
		
		Institute institute1=new Location();
		Student student=new Student(institute1);
		student.getInfo();
		
		

	}

}

package SetterInjection;

public class Main {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.setPname("robin");
		p.setPdept("tech");
		p.setPid(123);
		
		Student std=new Student();
		std.setName("pope");
		std.setRollno(154);
		std.setParent(p);
		
		System.out.println("Parent Data from Student");
		System.out.println(std.getParent().pname);
		System.out.println(std.getParent().pdept);
		System.out.println(std.getParent().pid);
		
		System.out.println("Student Data");
		System.out.println(std.getName());
		System.out.println(std.getRollno());
	}

}

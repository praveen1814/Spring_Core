package ConstructorInjection;

public class Main {

	public static void main(String[] args) {
		Parent p=new Parent("robin","tech",123);
		
		Student s=new Student("pope",456,p);
		System.out.println(s);

	}

}

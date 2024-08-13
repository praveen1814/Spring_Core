package Dependency_Injection;

public class Student {
		Institute institute;
		Student(Institute institute)
		{
			this.institute=institute;
		}
		public void getInfo()
		{
			institute.getCollegeName();
		}
}

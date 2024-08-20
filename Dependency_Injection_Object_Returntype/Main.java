package Spring_Core.Dependency_Injection_Object_Returntype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Student stu=context.getBean("student",Student.class);
		stu.cheat();
	}

}

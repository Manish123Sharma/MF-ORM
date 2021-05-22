package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);


        Employee employee=context.getBean("Employee",Employee.class);

        employee.getName();
        employee.setName();
        employee.calculate_sal();

        context.close();
	}

}

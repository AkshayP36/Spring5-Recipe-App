package com.mycompany.DependencyInjectionBasics;

import com.mycompany.DependencyInjectionBasics.controller.MyController;
import com.mycompany.DependencyInjectionBasics.services.ConstructorGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionBasicsApplication {

	public static void main(String[] args) {

		//getting application context
		ApplicationContext context=SpringApplication.run(DependencyInjectionBasicsApplication.class, args);

		//getting context for the controller
		/* Explanation of below code of line -> this is an example of Dependency
		injection.
		In this entire code we haven't called for the MyController class and created it's instance like
		MyController myController = new MyController();
		Also neither created an constructor in the MyController class.
		Everything is happening in the background. We are creating an context and passing the instance
		object value into it. Here Spring is creating instance to be stored int the context from background

		 */
		MyController myController=(MyController) context.getBean("myController");

		//calling method for the controller
		String greeting = myController.HelloWorld();
		System.out.println(greeting);

		ConstructorGreetingService constructorGreetingService = (ConstructorGreetingService) context.getBean("constructorGreetingService");
		System.out.println(constructorGreetingService.getGreetings());

		System.out.println("------------From Primary Bean");
		System.out.println(myController.HelloWorld());
	}

}

package eld.springframework.sfddi;

import eld.springframework.sfddi.controllers.ConstructorInjectedController;
import eld.springframework.sfddi.controllers.MyController;
import eld.springframework.sfddi.controllers.PropertyInjectedContlroller;
import eld.springframework.sfddi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Set;

@SpringBootApplication
public class SfdDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfdDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------- Property ---------");

		PropertyInjectedContlroller propertyInjectedContlroller = (PropertyInjectedContlroller) ctx.getBean("propertyInjectedContlroller");

		System.out.println(propertyInjectedContlroller.getGreeting());

		System.out.println("____________END of Property___________");


		System.out.println("------- Setter ---------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("____________END of Setter___________");



		System.out.println("------- Constructor ---------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("____________END of Constructor___________");
	}

}

package eld.springframework.sfddi;

import eld.springframework.sfddi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Set;

@SpringBootApplication
public class SfdDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfdDiApplication.class, args);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("------- Primary Bean ---------");


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

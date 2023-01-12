package com.xworkz.autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.autowired.bean.Gender;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class TaskConfiguration {

	public TaskConfiguration() {
		System.out.println("Created TaskConfiguration...");
	}

	@Bean
	public int no() {
		System.out.println("Registering no...");
		return 03;
	}

	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName ");
		return "Vijaya Karnataka";
	}

	@Bean
	public String owner() {
		System.out.println("Registering owner ");
		return "Vijay";
	}

	@Bean
	public String lang() {
		System.out.println("Registering lang ");
		return "Kannada";
	}

	@Bean
	public double rate() {
		System.out.println("Registering rate ");
		return 2.2;
	}

	@Bean
	public String engineName() {
		System.out.println("Registering engineName ");
		return "Activa";

	}

	@Bean
	public String engineType() {
		System.out.println("Registering engineType ");
		return "petrol";

	}

	@Bean
	public int engineNo() {
		System.out.println("Registering engineNo ");
		return 3133412;

	}

	@Bean
	public double engineVersion() {
		System.out.println("Registering engineVersion ");
		return 3.0;

	}

	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany ");
		return "Honda";

	}

	@Bean
	public int engineStroke() {
		System.out.println("Registering engineStroke ");
		return 4;

	}

	@Bean
	public String snakeName() {
		System.out.println("Registering snakeName ");
		return "Cobra";

	}

	@Bean
	public double snakeLength() {
		System.out.println("Registering snakeLength ");
		return 4.5;

	}

	@Bean
	public String snakeColor() {
		System.out.println("Registering snakeColor ");
		return "Brown";

	}

	@Bean
	public String snakeType() {
		System.out.println("Registering snakeType ");
		return "venomous";

	}

	@Bean
	public boolean snakePoisonous() {
		System.out.println("Registering engineCompany ");
		return true;

	}

	@Bean
	public String ghostName() {
		System.out.println("Registering ghostname ");
		return "Devva";

	}

	@Bean
	public byte ghostAge() {
		System.out.println("Registering ghostAge ");
		return 100;
	}

	@Bean
	public short ghostHeigth() {
		System.out.println("Registering ghostHeigth ");
		return 6;

	}
	
	@Bean
	public double ghostWeight() {
		System.out.println("Registering ghostWeight ");
		return 60;

	}
	
	@Bean
	public long ghostPhNo() {
		System.out.println("Registering ghostPhNo ");
		return 948399930;

	}
	
	@Bean
	public float ghostNoOflegs() {
		System.out.println("Registering ghostNoOflegs ");
		return 4f;

	}
	
	@Bean
	public int ghostNoOfHands() {
		System.out.println("Registering ghostNoOfHands ");
		return 4;

	}
	
	@Bean
	public boolean ghostAlive() {
		System.out.println("Registering ghostAlive ");
		return true;

	}
	
	@Bean
	public Gender ghostGender() {
		System.out.println("Registering ghostGender ");
		return Gender.Male;

	}
	
	@Bean
	public LocalDate ghostDOB() {
		System.out.println("Registering ghostDOB ");
		return LocalDate.of(2000, 12, 23);

	}
	
	@Bean
	public LocalDate ghostDOD() {
		System.out.println("Registering ghostDOB ");
		return LocalDate.of(2020, 12, 23);

	}
	
	@Bean
	public String ghostDress() {
		System.out.println("Registering ghostDress ");
		return "nighty";

	}
	
	@Bean
	public String ghostColor() {
		System.out.println("Registering ghostColor ");
		return "White";

	}
	
	@Bean
	public String ghostEducation() {
		System.out.println("Registering ghostEducation ");
		return "SSLC";

	}
	
	@Bean
	public boolean ghostGradaute() {
		System.out.println("Registering ghostGradaute ");
		return false;

	}
	
	@Bean
	public String ghostCollegeName() {
		System.out.println("Registering ghostCollegeName ");
		return "";

	}
	
	@Bean
	public boolean ghostDrinksBlood() {
		System.out.println("Registering ghostDrinksBlood ");
		return false;

	}
	
	@Bean
	public String ghostLivesIn() {
		System.out.println("Registering ghostLivesIn ");
		return "Tree";

	}
	
	@Bean
	public String ghostScaredOf() {
		System.out.println("Registering ghostScaredOf ");
		return "God";

	}
	
	@Bean
	public boolean ghostDangerous() {
		System.out.println("Registering ghostDangerous ");
		return false;

	}

}

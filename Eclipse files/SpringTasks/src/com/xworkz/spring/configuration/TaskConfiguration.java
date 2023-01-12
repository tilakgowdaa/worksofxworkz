package com.xworkz.spring.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class TaskConfiguration {

	public TaskConfiguration() {
		System.out.println("Created TaskConfiguration...");
	}

	@Bean
	public int number() {
		System.out.println("Registering number...");
		return 10;
	}

	@Bean
	public String hesaru() {
		System.out.println("Registering hesaru...");
		return "SLV hardware";
	}

	@Bean
	public String gstnumber() {
		System.out.println("Registering gstnumber...");
		return "GSTIN5322";
	}

	@Bean
	public String owner() {
		System.out.println("Registering owner...");
		return "Lakshmi";
	}

	@Bean
	public String address() {
		System.out.println("Registering address...");
		return "Bengaluruu,560021";
	}

	@Bean
	public String naama() {
		System.out.println("Registering naama...");
		return "Spring";
	}
	
	@Bean
	public double vers() {
		System.out.println("Registering vers...");
		return 5.3;
	}

	@Bean
	public String father() {
		System.out.println("Registering father...");
		return "Om";
	}

	@Bean
	public LocalDate dinanka() {
		System.out.println("Registering dinanka...");
		LocalDate ref = LocalDate.of(2000, 12, 1);
		return ref;
	}

	@Bean
	public boolean fullufree() {
		System.out.println("Registering fullufree...");
		return true;
	}
	
	@Bean
	public String engName() {
		System.out.println("Registering engName...");
		return "Tilak";
	}
	
	@Bean
	public double sambala() {
		System.out.println("Registering sambala...");
		return 30000.0;
	}
	
	@Bean
	public String office() {
		System.out.println("Registering office...");
		return "TCS";
	}
	
	@Bean
	public double years() {
		System.out.println("Registering years...");
		return 3.5;
	}
	
	@Bean
	public String sisa() {
		System.out.println("Registering sisa...");
		return "Nataraja";
	}
	
	
	@Bean
	public String yavPencil() {
		System.out.println("Registering yavPencil...");
		return "Bariyodu";
	}
	
	@Bean
	public double rate() {
		System.out.println("Registering rate...");
		return 10;
	}
	
	@Bean
	public String banna() {
		System.out.println("Registering banna...");
		return "Red";
	}
	
	@Bean
	public boolean sharp() {
		System.out.println("Registering sharp...");
		return true;
	}
	
	@Bean
	public boolean kadMaal() {
		System.out.println("Registering kadMaal...");
		return false;
	}
	
	@Bean
	public String eraser() {
		System.out.println("Registering eraser...");
		return "Apsara";
	}
	
	@Bean
	public String yavRubber() {
		System.out.println("Registering yavRubber...");
		return "Pencil Rubber";
	}
	
	@Bean
	public double rubberRate() {
		System.out.println("Registering rubberRate...");
		return 5;
	}
	
	@Bean
	public String rubberBanna() {
		System.out.println("Registering rubberBanna...");
		return "White";
	}
	
	@Bean
	public String yavShape() {
		System.out.println("Registering yavShape...");
		return "rectangle";
	}
	
	@Bean
	public boolean kaddiroRubber() {
		System.out.println("Registering kaddiroRubber...");
		return false;
	}
	
	@Bean
	public char rubberSize() {
		System.out.println("Registering rubberSize...");
		return 'L';
	}
	
	@Bean
	public String studentName() {
		System.out.println("Registering studentName...");
		return "Virat";
	}
	
	@Bean
	public byte varsha() {
		System.out.println("Registering varsha...");
		return 12;
	}
	
	@Bean
	public short standard() {
		System.out.println("Registering standard...");
		return 7;
	}
	
	@Bean
	public int no() {
		System.out.println("Registering no...");
		return 27;
	}
	
	@Bean
	public long mobile() {
		System.out.println("Registering mobile...");
		return 863822993;
	}
	
	@Bean
	public float etthara() {
		System.out.println("Registering etthara...");
		return 5.2f;
		}
	
	@Bean
	public double thuuka() {
		System.out.println("Registering thuuka...");
		return 50;
	}
	
	@Bean
	public char sec() {
		System.out.println("Registering sec...");
		return 'A';
	}
	
	@Bean
	public boolean result() {
		System.out.println("Registering result...");
		return false;
	}
	
	
}

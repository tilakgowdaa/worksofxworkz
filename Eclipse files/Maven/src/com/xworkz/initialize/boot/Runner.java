package com.xworkz.initialize.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.initialize.configuration.TaskConfig;
import com.xworkz.initialize.thing.Actor;
import com.xworkz.initialize.thing.Rocket;
import com.xworkz.initialize.thing.Season;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(TaskConfig.class);
		Rocket refOfRocket=spring.getBean( Rocket.class);
		System.out.println(refOfRocket.toString());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		
		Rocket refOfRocket1=spring.getBean("jacket", Rocket.class);
		System.out.println(refOfRocket1.toString());
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getBudget());
		
		Actor refOfActor=spring.getBean("actor",Actor.class);
		System.out.println(refOfActor.toString());
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge());
		
		Actor refOfActor2=spring.getBean("hero",Actor.class);
		System.out.println(refOfActor2.toString());
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.getLanguage());
		System.out.println(refOfActor2.getAge());
		
		
		Season refOfSeason=spring.getBean("season", Season.class);
		System.out.println(refOfSeason.toString());
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getStartingMonth());
		
		Season refOfSeason1=spring.getBean("cold", Season.class);
		System.out.println(refOfSeason1.toString());
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getDuration());
		System.out.println(refOfSeason1.getStartingMonth());
		
		}
	
		
}

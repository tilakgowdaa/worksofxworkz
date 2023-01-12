package com.xworkz.autowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Engine;
import com.xworkz.autowired.bean.Ghost;
import com.xworkz.autowired.bean.NewsPaper;
import com.xworkz.autowired.bean.Snake;
import com.xworkz.autowired.configuration.TaskConfiguration;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(TaskConfiguration.class);
		System.out.println("------------------NEWSPAPER-----------------");
		NewsPaper refOfNewsPaper = container.getBean(NewsPaper.class);
		// refOfNewsPaper.setPrice(5.0);
		System.out.println(refOfNewsPaper.getId());
		System.out.println(refOfNewsPaper.getName());
		System.out.println(refOfNewsPaper.getLanguage());
		System.out.println(refOfNewsPaper.getOwnerName());
		System.out.println(refOfNewsPaper.getPrice());

		System.out.println("------------------ENGINE-----------------");

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine.getStroke());
		System.out.println(refOfEngine.getCompany());
		System.out.println(refOfEngine.getName());
		System.out.println(refOfEngine.getType());
		System.out.println(refOfEngine.getNumber());

		System.out.println("------------------SNAKE-----------------");

		Snake refOfSnake = container.getBean(Snake.class);
		System.out.println(refOfSnake.getName());
		System.out.println(refOfSnake.getColor());
		System.out.println(refOfSnake.getLength());
		System.out.println(refOfSnake.getType());

		System.out.println("------------------GHOST-----------------");

		Ghost refOfGhost = container.getBean(Ghost.class);
		System.out.println(refOfGhost.getName());
		System.out.println(refOfGhost.getCollegeName());
		System.out.println(refOfGhost.getColor());
		System.out.println(refOfGhost.getDress());
		System.out.println(refOfGhost.getEducation());
		System.out.println(refOfGhost.getLivesIn());
		System.out.println(refOfGhost.getNoOfHands());
		System.out.println(refOfGhost.getNoOfLegs());
		System.out.println(refOfGhost.getPhNo());
		System.out.println(refOfGhost.getScaredOf());
		System.out.println(refOfGhost.getWeight());
		System.out.println(refOfGhost.getAge());
		System.out.println(refOfGhost.getDoB());
		System.out.println(refOfGhost.getDoD());
		System.out.println(refOfGhost.getGender());
		System.out.println(refOfGhost.getHeight());
		System.out.println(refOfGhost.isAlive());
		System.out.println(refOfGhost.isDangerous());
		System.out.println(refOfGhost.isDrinksBlood());
		System.out.println(refOfGhost.isGraduate());

	}
}

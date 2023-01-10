package com.xworkz.Bean.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Bean")
public class SpringConfig {

	@Bean
	public String happy() {
		System.out.println("Registering happy with spring...");
		String string = new String();
		return string;
	}

	@Bean
	public String sad() {
		System.out.println("Registering sad with spring...");
		String string = new String();
		return string;
	}

	@Bean
	public String good() {
		System.out.println("Registering good with spring...");
		String string = new String();
		return string;
	}

	@Bean
	public String bad() {
		System.out.println("Registering bad with spring...");
		String string = new String();
		return string;
	}

	@Bean
	public String confuse() {
		System.out.println("Registering confuse with spring...");
		String string = new String();
		return string;
	}

	@Bean
	public Boolean hadDinner() {
		System.out.println("Registering hadDinner with spring...");
		Boolean boolean1 = new Boolean(false);
		return boolean1;
	}

	@Bean
	public Boolean isLocked() {
		System.out.println("Registering isLocked with spring...");
		Boolean boolean1 = new Boolean(true);
		return boolean1;
	}

	@Bean
	public Boolean veryNice() {
		System.out.println("Registering veryNice with spring...");
		Boolean boolean1 = new Boolean(false);
		return boolean1;
	}

	@Bean
	public Boolean onTheWay() {
		System.out.println("Registering onTheWay with spring...");
		Boolean boolean1 = new Boolean(true);
		return boolean1;
	}

	@Bean
	public Boolean fast() {
		System.out.println("Registering fast with spring...");
		Boolean boolean1 = new Boolean(false);
		return boolean1;
	}

	@Bean
	public double content() {
		System.out.println("Registering content with spring...");
		double d = new Double(0.0);
		return d;
	}

	@Bean
	public double shop() {
		System.out.println("Registering shop with spring...");
		double d = new Double(0.0);
		return d;
	}

	@Bean
	public double movie() {
		System.out.println("Registering movie with spring...");
		double d = new Double(0.0);
		return d;
	}

	@Bean
	public double bike() {
		System.out.println("Registering bike with spring...");
		double d = new Double(0.0);
		return d;
	}

	@Bean
	public double help() {
		System.out.println("Registering help with spring...");
		double d = new Double(0.0);
		return d;
	}

	@Bean
	public StringBuffer sleep() {
		System.out.println("Registering sleep with spring...");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}

	@Bean
	public StringBuffer wakeUp() {
		System.out.println("Registering wakeUp with spring...");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}

	@Bean
	public StringBuffer bed() {
		System.out.println("Registering bed with spring...");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}

	@Bean
	public StringBuffer cold() {
		System.out.println("Registering cold with spring...");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}

	@Bean
	public StringBuffer hot() {
		System.out.println("Registering hot with spring...");
		StringBuffer buffer = new StringBuffer("");
		return buffer;
	}

	@Bean
	public StringBuilder god() {
		System.out.println("Registering god with spring...");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder river() {
		System.out.println("Registering river with spring...");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder festival() {
		System.out.println("Registering festival with spring...");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder road() {
		System.out.println("Registering road with spring...");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder trip() {
		System.out.println("Registering trip with spring...");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public Collection<Integer> collect() {
		System.out.println("Registering collect with spring...");
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(10);
		collection.add(20);
		collection.add(30);
		collection.add(40);
		collection.add(50);

		return collection;
	}

	@Bean
	public Map<String, Integer> pair() {
		System.out.println("Registering pair with spring...");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pen", 2);
		map.put("book", 3);
		map.put("Laptop", 1);
		map.put("Charger", 1);
		map.put("bag", 1);

		return map;

	}
}

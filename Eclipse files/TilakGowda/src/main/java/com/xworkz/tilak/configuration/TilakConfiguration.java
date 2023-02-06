package com.xworkz.tilak.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.tilak")
public class TilakConfiguration {
	public TilakConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}

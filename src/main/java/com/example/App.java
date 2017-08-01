package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.val;

/**
 * App.java.
 *
 * @author MEG
 *
 */
@SpringBootApplication
public class App {

	/**
	 * entry point.
	 *
	 * @param args vm args
	 */
	public static void main(String[] args) {
		val app = new SpringApplication(App.class);
		app.setWebEnvironment(true);
		app.run(args);
	}

}

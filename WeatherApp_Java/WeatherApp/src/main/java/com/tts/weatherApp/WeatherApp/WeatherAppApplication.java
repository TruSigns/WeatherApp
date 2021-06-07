package com.tts.weatherApp.WeatherApp;

import com.tts.weatherApp.WeatherApp.Model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {



		SpringApplication.run(WeatherAppApplication.class, args);

		Person person = new Person();
//		person.firstName = "Maurice";
//		person.lastName = "Ruffin";
//		person.age = 45;
//		person.favoriteFoods = Arrays.asList("Pizza","Steak", "Pie");
//
//		System.out.println(person);

	}

}

package com.example.dbinitialization;

import com.example.dbinitialization.model.Person;
import com.example.dbinitialization.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbInitializationApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DbInitializationApplication.class, args);

		PersonRepository personRepository = configurableApplicationContext
				.getBean(PersonRepository.class);

		Person person = new Person("Chris", "Anderson", 32);
		personRepository.save(person);
	}
}

package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Recipe;

@SpringBootApplication
public class RecipesApplication {

	private static final Logger log = LoggerFactory.getLogger(RecipesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(RecipeRepository repository) {
		//"Fetticuine Noodles", "Butter", "Half and Half"
		return (args) -> {

			final List<String> ing = new ArrayList<String>();
			ing.add("Chicken");// "Fetticuine Noodles", "Butter", "Half and Half");
			// save a couple of recipes
			repository.save(new Recipe("Charlie Burris", "Pasta", "30 mins",
					"Chicken Alfredo is a great classic Italian pasta dish. ",
					ing,
					"Beginner", 3, "Chicken Alfredo", "30 mins"));


			//			repository.save(new Recipe("Chloe", "O'Brian"));
			//			repository.save(new Recipe("Kim", "Bauer"));
			//			repository.save(new Recipe("David", "Palmer"));
			//			repository.save(new Recipe("Michelle", "Dessler"));

			// fetch all recipes
			log.info("Recipes found with findAll():");
			log.info("-------------------------------");
			for (final Recipe recipe : repository.findAll()) {
				log.info(recipe.toString());
			}
			log.info("");

			// fetch an individual recipe by ID
			repository.findById(1L)
			.ifPresent(recipe -> {
				log.info("Recipe found with findById(1L):");
				log.info("--------------------------------");
				log.info(recipe.toString());
				log.info("");
			});

			// fetch recipes by last name
			log.info("Recipe found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			//			repository.findByLastName("Bauer").forEach(bauer -> {
			//				log.info(bauer.toString());
			//			});
			// for (Recipe bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}
}

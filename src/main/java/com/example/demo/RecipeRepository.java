package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Recipe;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {

	List<Recipe> findByTitle(String title);

}

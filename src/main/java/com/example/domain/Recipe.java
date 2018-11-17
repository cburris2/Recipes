/**
 *
 */
package com.example.domain;

import java.util.List;

/**
 * @author cburris
 *
 */
public class Recipe {

	String author;

	String category;

	String cook_time;

	String description;

	List<Ingredient> ingredients;
	List<String> instructions;

	String level;

	int rating;

	String title;
	String prep_time;


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the cook_time
	 */
	public String getCook_time() {
		return cook_time;
	}

	/**
	 * @param cook_time the cook_time to set
	 */
	public void setCook_time(String cook_time) {
		this.cook_time = cook_time;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * @return the instructions
	 */
	public List<String> getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the prep_time
	 */
	public String getPrep_time() {
		return prep_time;
	}

	/**
	 * @param prep_time the prep_time to set
	 */
	public void setPrep_time(String prep_time) {
		this.prep_time = prep_time;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Recipe [author=" + author + ", category=" + category + ", cook_time=" + cook_time + ", description="
				+ description + ", ingredients=" + ingredients + ", instructions=" + instructions + ", level=" + level
				+ ", rating=" + rating + ", title=" + title + ", prep_time=" + prep_time + "]";
	}

}

package com.jeopardy.game;
import java.util.*;
/**
 * @author Ashia Lewis
 *
 */
final class Question {
	
	private final Category category;
	private double value;
	private final String question, answer;
	
	enum Category {

		STRINGS_200, NUMBERS_200, BOOLEANS_200, CONTROL_200, COLLECTIONS_200,
		STRINGS_400, NUMBERS_400, BOOLEANS_400, CONTROL_400, COLLECTIONS_400,
		STRINGS_600, NUMBERS_600, BOOLEANS_600, CONTROL_600, COLLECTIONS_600,
		STRINGS_800, NUMBERS_800, BOOLEANS_800, CONTROL_800, COLLECTIONS_800,
		STRINGS_1000, NUMBERS_1000, BOOLEANS_1000, CONTROL_1000, COLLECTIONS_1000,
		
	};
	
	public Question(Category aCategory, String aQuestion, String anAnswer) {
		String c = aCategory.toString();
		this.category = aCategory;
		this.value = Integer.parseInt(c.substring(c.indexOf("_") + 1, c.length()));
		this.question = aQuestion;
		this.answer = anAnswer;
	}
	
	public String getCategory() {
		return this.category.toString().substring(0, category.toString().indexOf("_"));
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void doubleJeopardy() {
		this.value *= 2;
	}
	
	
	public static void main(String[] args) {
		System.out.println("juggly".substring(0, 3));
		

	}
}

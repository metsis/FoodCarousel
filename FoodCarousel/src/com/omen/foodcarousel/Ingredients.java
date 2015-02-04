package com.omen.foodcarousel;

import java.util.Random;

public class Ingredients {

	public final String[] vegetables = { "broccoli", "spinach", "cauliflower", "carrot", "pumpkin", "zucchini", "pak choy", "beetroot", "brussels sprout", "cabbage", "sweet corn", "peas", "avocado" };
	public final String[] protein = { "tofu", "tempeh", "soy flakes", "kidney beans", "walrus meat", "beef", "pork", "chicken", "fish", "cheese" };
	public final String[] starch = { "potatoes", "pasta", "noodles", "couscous", "plantain", "rice", "bulgur" };
	public final String[] spice = { "paprika", "chili", "thyme", "basil", "rosemary", "black pepper", "cumin", "sea salt", "cayenne pepper", "soy sauce", "fish sauce" };

	// TODO: omnivore / vegetarian / vegan settings
	
    public static Random rand = new Random();

	
	public Ingredients() {
				
		// initialize 
	}
	
	public String getRandom(int type) {

		switch(type) {
		
		case 0: 
			return vegetables[randInt(0, vegetables.length)];
		case 1:
			return protein[randInt(0, protein.length)];
		case 2:
			return starch[randInt(0, starch.length)];
		case 3:
			return spice[randInt(0, spice.length)];		
		default:
			return "lol";
		}		
		
	}

	public static int randInt(int min, int max) {

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt(max - min) + min;

	    return randomNum;
	}
	
}

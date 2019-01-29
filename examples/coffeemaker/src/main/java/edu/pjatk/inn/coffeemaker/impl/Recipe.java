package edu.pjatk.inn.coffeemaker.impl;

import sorcer.core.context.ServiceContext;
import sorcer.service.Context;
import sorcer.service.ContextException;

import java.io.Serializable;

/**
 * A class that contains information to prepare coffee according to custom recipe.
 *
 * @author   Sarah & Mike
 *
 * Documentation made by s19801 and s12669
 */
public class Recipe implements Serializable {

	/**
	 * Class attribute that contains the name of recipe.
	 */
	private String name;

	/**
	 * Class attribute that contains the price for this recipe.
	 */
	private int price;

	/**
	 * Class attribute that contains amount of Coffee i this recipe.
	 */
	private int amtCoffee;

	/**
	 * Class attribute that contains amount of Milk in this recipe.
	 */
	private int amtMilk;

	/**
	 * Class attribute that contains amount of Sugar in this recipe.
	 */
	private int amtSugar;

	/**
	 * Class attribute that contains amount of Chocolate in this recipe.
	 */
	private int amtChocolate;

	/**
	 * Constructor of the class that sets all attributes to default values.
	 */

	public Recipe() {
    	this.name = "";
    	this.price = 0;
    	this.amtCoffee = 0;
    	this.amtMilk = 0;
    	this.amtSugar = 0;
    	this.amtChocolate = 0;
    }
    
    /**
	 * Returns amount of chocolate in recipe.
	 *
	 * @return   Returns the amtChocolate.
	 *
	 */
    public int getAmtChocolate() {
		return amtChocolate;
	}
    /**
	 * Sets amount of chocolate in recipe and it has to be greater than or equal to 0.
	 *
	 * @param amtChocolate   The amtChocolate to setValue.
	 */
    public void setAmtChocolate(int amtChocolate) {
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} 
	}
    /**
	 * Returns amount of Coffee in recipe.
	 *
	 * @return   Returns the amtCoffee.
	 */
    public int getAmtCoffee() {
		return amtCoffee;
	}
    /**
	 * Sets amount of Coffee in recipe and it has to be greater than or equal to 0.
	 *
	 * @param amtCoffee   The amtCoffee to setValue.
	 */
    public void setAmtCoffee(int amtCoffee) {
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} 
	}
    /**
	 * Returns amount of Milk in recipe.
	 *
	 * @return   Returns the amtMilk.
	 */
    public int getAmtMilk() {
		return amtMilk;
	}
    /**
	 * Sets amount of milk in recipe and it has to be greater than or equal to 0.
	 *
	 * @param amtMilk   The amtMilk to setValue.
	 */
    public void setAmtMilk(int amtMilk) {
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} 
	}
    /**
	 * Reutrns amount of Sugar in recipe.
	 *
	 * @return   Returns the amtSugar.
	 */
    public int getAmtSugar() {
		return amtSugar;
	}
    /**
	 * Sets amount of Sugar in recipe.
	 *
	 * @param amtSugar   The amtSugar to setValue.
	 */
    public void setAmtSugar(int amtSugar) {
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} 
	}
    /**
	 * Returns the name of recipe.
	 *
	 * @return   Returns the name.
	 */
    public String getName() {
		return name;
	}
    /**
	 * Sets name of recipe and it cant be null.
	 *
	 * @param name   The name to setValue.
	 */
    public void setName(String name) {
    	if(name != null) {
    		this.name = name;
    	}
	}
    /**
	 * Returns the price of recipe.
	 *
	 * @return   Returns the price.
	 */
    public int getPrice() {
		return price;
	}
    /**
	 * Sets the price for recipe and it has to be greater than or equal to 0.
	 *
	 * @param price   The price to setValue.
	 */
    public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} 
	}
	/**
	 * Check if the name of this recipe equals to already given recipe and returns true if they match and false if not.
	 *
	 * @param r   The recipe to compare with.
	 * @return   Returns the boolean value specifying if both recipes are the same.
	 *
	*/
    public boolean equals(Recipe r) {
        if((this.name).equals(r.getName())) {
            return true;
        }
        return false;
    }
	/**
	 * Returns string name of this recipe object.
	 *
	 * @return   Returns the string name.
	 */
    public String toString() {
    	return name;
    }
	/**
	 * Returns a recipe from given context.
	 *
	 * @param context   Context to create recipe from.
	 * @return   Returns a new recipe object.
	 */

	static public Recipe getRecipe(Context context) throws ContextException {
		Recipe r = new Recipe();
		r.name = (String)context.getValue("name");
		r.price = (int)context.getValue("price");
		r.amtCoffee = (int)context.getValue("amtCoffee");
		r.amtMilk = (int)context.getValue("amtMilk");
		r.amtSugar = (int)context.getValue("amtSugar");
		r.amtChocolate = (int)context.getValue("amtChocolate");
		return r;
	}
	/**
	 * Returns a context from given recipe.
	 *
	 * @param recipe   Recipe to create context from.
	 * @return   Returns a new context object.
	 */

	static public Context getContext(Recipe recipe) throws ContextException {
		Context cxt = new ServiceContext();
		cxt.putValue("name", recipe.getName());
		cxt.putValue("price", recipe.getPrice());
		cxt.putValue("amtCoffee", recipe.getAmtCoffee());
		cxt.putValue("amtMilk", recipe.getAmtMilk());
		cxt.putValue("amtSugar", recipe.getAmtSugar());
		cxt.putValue("amtChocolate", recipe.getAmtChocolate());
		return cxt;
	}


}

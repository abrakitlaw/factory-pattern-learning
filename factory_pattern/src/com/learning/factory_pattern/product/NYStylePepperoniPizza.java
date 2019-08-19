package com.learning.factory_pattern.product;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

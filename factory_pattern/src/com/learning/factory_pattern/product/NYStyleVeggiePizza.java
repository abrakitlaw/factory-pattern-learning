package com.learning.factory_pattern.product;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

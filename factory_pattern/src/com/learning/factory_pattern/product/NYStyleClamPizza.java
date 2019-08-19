package com.learning.factory_pattern.product;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

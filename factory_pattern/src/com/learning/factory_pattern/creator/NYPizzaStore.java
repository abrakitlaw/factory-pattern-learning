package com.learning.factory_pattern.creator;

import com.learning.factory_pattern.product.Pizza;
import com.learning.factory_pattern.product.NYStyleCheesePizza;
import com.learning.factory_pattern.product.NYStyleClamPizza;
import com.learning.factory_pattern.product.NYStylePepperoniPizza;
import com.learning.factory_pattern.product.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}

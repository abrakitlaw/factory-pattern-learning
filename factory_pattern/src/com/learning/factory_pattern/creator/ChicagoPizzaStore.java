package com.learning.factory_pattern.creator;

import com.learning.factory_pattern.product.Pizza;
import com.learning.factory_pattern.product.ChicagoStyleCheesePizza;
import com.learning.factory_pattern.product.ChicagoStyleClamPizza;
import com.learning.factory_pattern.product.ChicagoStylePepperoniPizza;
import com.learning.factory_pattern.product.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}

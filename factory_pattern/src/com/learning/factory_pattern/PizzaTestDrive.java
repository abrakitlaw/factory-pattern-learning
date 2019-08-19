package com.learning.factory_pattern;

import com.learning.factory_pattern.creator.ChicagoPizzaStore;
import com.learning.factory_pattern.creator.NYPizzaStore;
import com.learning.factory_pattern.creator.PizzaStore;
import com.learning.factory_pattern.product.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Abra ordered a " + pizza.getName());
        System.out.println();

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName());
        System.out.println();
    }
}

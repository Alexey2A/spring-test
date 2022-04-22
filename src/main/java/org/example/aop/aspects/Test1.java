package org.example.aop.aspects;

import org.example.aop.Config;
import org.example.aop.FoodWarehouse;
import org.example.aop.Warehouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        FoodWarehouse foodWarehouse = context.getBean("fwhBean", FoodWarehouse.class);
        System.out.println(foodWarehouse instanceof FoodWarehouse);
    }
}

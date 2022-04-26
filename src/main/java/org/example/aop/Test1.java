package org.example.aop;

import org.example.aop.Config;
import org.example.aop.FoodWarehouse;
import org.example.aop.Warehouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        FoodWarehouse foodWarehouse = context.getBean("fwhBean", FoodWarehouse.class);

        foodWarehouse.addProductToTheWarehouse();

//        System.out.println(foodWarehouse.getWarehouseName());
//        System.out.println(foodWarehouse.getWarehouseCharacteristics().getNumberOfForkliftTrucks());;
//        System.out.println(foodWarehouse.getWarehouseCharacteristics().getRacks().getDepth());;
//
//        WarehouseCharacteristics wc = context.getBean("wcBean", WarehouseCharacteristics.class);
//        System.out.println(wc.getNumberOfForkliftTrucks());

        context.close();
    }
}

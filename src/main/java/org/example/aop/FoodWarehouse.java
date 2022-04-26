package org.example.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    Продовольственный склад
*/

@Component("fwhBean")
public class FoodWarehouse extends Warehouse {

//    public FoodWarehouse(){}

    @Autowired
    public FoodWarehouse(@Value("${warehouse.warehouseName}") String warehouseName,
                         WarehouseCharacteristics wc, Product product) {
        super(warehouseName, wc, product);
    }

    @Override
    public void addProductToTheWarehouse() {
        System.out.println("добавляем продукт на склад (метод addProductToTheWarehouse())");
        System.out.println("----------------");
    }

    @Override
    public void getProductFromTheWarehouse() {
        System.out.println("получаем продукт со склада (метод getProductFromTheWarehouse())");
        System.out.println("----------------");
    }

    @Override
    public void changeProduct() {
        System.out.println("изменияем продукт (метод changeProduct())");
        System.out.println("----------------");
    }

    @Override
    public void removeProductFromTheWarehouse() {
        System.out.println("удаляем продукт (метод removeProductFromTheWarehouse())");
        System.out.println("----------------");
    }
}

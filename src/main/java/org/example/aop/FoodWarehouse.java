package org.example.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    Продовольственный склад
*/

@Component("fwhBean")
public class FoodWarehouse extends Warehouse {

    @Value("warehouse")
    private String foodWarehouseName;
    private WarehouseCharacteristics warehouseCharacteristics;
    private Product product;

//    public FoodWarehouse(){}


    @Autowired
    public FoodWarehouse(WarehouseCharacteristics warehouseCharacteristics, Product product) {
        this.warehouseCharacteristics = warehouseCharacteristics;
        this.product = product;
    }

    @Override
    public void addProductOnTheWarehouse() {

    }

    @Override
    public void getProductOnTheWarehouse() {

    }

    @Override
    public void changeProduct() {

    }

    @Override
    public void removeProductOnTheWarehouse() {

    }
}

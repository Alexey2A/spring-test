package org.example.aop;

abstract public class Warehouse {
    private String warehouseName;
    private WarehouseCharacteristics warehouseCharacteristics;
    private Product product;

    public Warehouse(String warehouseName,
                     WarehouseCharacteristics wc, Product product){
        this.warehouseName=warehouseName;
        this.warehouseCharacteristics=wc;
        this.product=product;
    }

    abstract public void addProductToTheWarehouse();
    abstract public void getProductFromTheWarehouse();
    abstract public void changeProduct();
    abstract public void removeProductFromTheWarehouse();

    public String getWarehouseName() {
        return warehouseName;
    }

    public WarehouseCharacteristics getWarehouseCharacteristics() {
        return warehouseCharacteristics;
    }

    public Product getProduct() {
        return product;
    }
}

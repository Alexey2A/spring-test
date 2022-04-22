package org.example.aop;

abstract public class Warehouse {
    private String warehouseName;
    private WarehouseCharacteristics warehouseCharacteristics;
    private Product product;

    public Warehouse(){}

    public Warehouse(String warehouseName,
                     WarehouseCharacteristics wc, Product product){
        this.warehouseName=warehouseName;
        this.warehouseCharacteristics=wc;
        this.product=product;
    }

    abstract public void addProductOnTheWarehouse();

    abstract public void getProductOnTheWarehouse();
    abstract public void changeProduct();
    abstract public void removeProductOnTheWarehouse();

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public WarehouseCharacteristics getWarehouseCharacteristics() {
        return warehouseCharacteristics;
    }

    public void setWarehouseCharacteristics(WarehouseCharacteristics warehouseCharacteristics) {
        this.warehouseCharacteristics = warehouseCharacteristics;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

package org.example.aop;
/*
* Параметры склада
* */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("wcBean")
public class WarehouseCharacteristics {
    @Value("1000")
    private double warehouseAreaInMetersSquared;    // площадь склада в квадратных метрах
    private Racks racks;    // стеллажи
    @Value("2")
    private short numberOfForkliftTrucks;   // количество вилочных погрузчиков

    @Autowired
    public WarehouseCharacteristics(Racks racks) {
        this.racks = racks;
    }

    public double getWarehouseAreaInMetersSquared() {
        return warehouseAreaInMetersSquared;
    }

    public Racks getRacks() {
        return racks;
    }

    public void setRacks(Racks racks) {
        this.racks = racks;
    }

    public short getNumberOfForkliftTrucks() {
        return numberOfForkliftTrucks;
    }

    public void setNumberOfForkliftTrucks(short numberOfForkliftTrucks) {
        this.numberOfForkliftTrucks = numberOfForkliftTrucks;
    }
}

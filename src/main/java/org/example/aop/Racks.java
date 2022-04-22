package org.example.aop;

/*
Стеллаж и его характеристики (ширина, высота, глубина,
                                количество полок, общее количество стеллажей)
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("racksBean")
public class Racks {
    @Value("1.5")
    private double width;
    @Value("2.0")
    private double height;
    @Value("0.8")
    private double depth;
    @Value("4")
    private short numberOfShelves;
    @Value("30")
    private int numberOfRacks;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public short getNumberOfShelves() {
        return numberOfShelves;
    }

    public int getNumberOfRacks() {
        return numberOfRacks;
    }

}


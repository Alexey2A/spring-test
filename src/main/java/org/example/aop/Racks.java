package org.example.aop;

/*
Стеллаж и его характеристики (ширина, высота, глубина,
                                количество полок, общее количество стеллажей)
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("racksBean")
public class Racks {
    @Value("${racks.width}")
    private double width;
    @Value("${racks.height}")
    private double height;
    @Value("${racks.depth}")
    private double depth;
    @Value("${racks.numberOfShelves}")
    private short numberOfShelves;
    @Value("${racks.numberOfRacks}")
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


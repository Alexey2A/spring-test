package org.example.aop;
/*
*  Продукт/товар
* */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("productBean")
public class Product {

    @Value("${product.productName}")
    private String productName;
    @Value("${product.weightInKilograms}")
    private double weightInKilograms;
    @Value("${product.numberOfPieces}")
    private int numberOfPieces;

    public Product() {
    }

    private Product(String productName) {

        this.productName = productName;
    }
    public Product(String productName, double weightInKilograms){
        this(productName);
        this.weightInKilograms = weightInKilograms;
    }
    public Product(String productName, int numberOfPieces){
        this(productName);
        this.numberOfPieces = numberOfPieces;
    }
    public Product(String productName, double weightInKilograms, int numberOfPieces){
        this(productName);
        this.weightInKilograms = weightInKilograms;
        this.numberOfPieces = numberOfPieces;
    }

    public String getProductName() {
        return productName;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public void setWeightInKilograms(double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
}

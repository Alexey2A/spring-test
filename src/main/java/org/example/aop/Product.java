package org.example.aop;
/*
*  Продукт/товар
* */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("productBean")
public class Product {

    private long id;
    private int article;
    @Value("product")
    private String productName;
    private double weightInKilograms;
    private int numberOfPieces;

    public Product() {
    }

    public Product(long id, int article, String productName,
                   double weightInKilograms, int numberOfPieces) {
        this.id = id;
        this.article = article;
        this.productName = productName;
        this.weightInKilograms = weightInKilograms;
        this.numberOfPieces = numberOfPieces;
    }

    public long getId() {
        return id;
    }

    public int getArticle() {
        return article;
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

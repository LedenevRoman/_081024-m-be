package org.example._2025_03_06;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return (int) ((product1.getFinalPrice() - product2.getFinalPrice()) * 100);
    }
}

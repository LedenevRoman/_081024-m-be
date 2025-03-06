package org.example._2025_03_06;

import java.util.*;

public class ProductService {

    public Map<String, List<Product>> groupByCategory(List<Product> products) {
        Map<String, List<Product>> categoryProductsMap = new HashMap<>();

        for (Product product : products) {
            categoryProductsMap.putIfAbsent(product.getCategory(), new ArrayList<>());
            categoryProductsMap.get(product.getCategory()).add(product);
        }
        return categoryProductsMap;
    }

    public List<Product> getSortedByFinalPrice(List<Product> products) {
        List<Product> result = new ArrayList<>(products);
        /*Comparator<Product> productComparator = new ProductComparator();*/
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return (int) ((product1.getFinalPrice() - product2.getFinalPrice()) * 100);
            }
        };
        result.sort(productComparator);
        return result;
    }

    public List<Product> getThreeMostExpensiveProducts(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        Comparator<Product> productComparator = new ProductComparator();
        sorted.sort(productComparator.reversed());
        if (sorted.size() < 3) {
            return sorted;
        }
        return sorted.subList(0, 3);
    }
}

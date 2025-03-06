package org.example._2025_03_06;

import java.util.Objects;

public class Product {
    private String name;
    private String sku;
    private String category;
    private double price;
    private double discountPercentage;

    public Product(String name, String sku, String category, double price, double discountPercentage) {
        this.name = name;
        this.sku = sku;
        this.category = category;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice() {
        return price - ((price * discountPercentage) / 100);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Double.compare(discountPercentage, product.discountPercentage) == 0 && Objects.equals(name, product.name) && Objects.equals(sku, product.sku) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sku, category, price, discountPercentage);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}

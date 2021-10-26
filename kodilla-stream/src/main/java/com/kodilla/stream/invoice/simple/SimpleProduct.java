package com.kodilla.stream.invoice.simple;

public class SimpleProduct {
    private final String productName;
    private final double productPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleProduct that = (SimpleProduct) o;

        return getProductName() != null ? getProductName().equals(that.getProductName()) : that.getProductName() == null;
    }

    @Override
    public int hashCode() {
        return getProductName() != null ? getProductName().hashCode() : 0;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public SimpleProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}

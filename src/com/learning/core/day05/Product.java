package com.learning.core.day05;

public class Product {
    public String productId;
    public String productName;

    public Product(String productId, String productName)
    {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() 
    {
        return productId;
    }

    public String getProductName() 
    {
        return productName;
    }

    
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }

    
    public int hashCode()
    {
        return productId.hashCode();
    }
}


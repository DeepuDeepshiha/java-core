package com.learning.core.day05;
import java.util.HashSet;

public class D05P03 {
    public static void main(String[] args) {
        
        HashSet<Product> productSet = new HashSet<Product>();

        productSet.add(new Product("P001", "Maruthi 800"));
        productSet.add(new Product("P002", "MaruthiZen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruthi Alto"));

      
        for (Product product : productSet)
        {
            System.out.println(product.productId+" "+product.productName);
        }
    }
}

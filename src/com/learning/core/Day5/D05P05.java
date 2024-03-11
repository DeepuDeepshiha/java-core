package com.learning.core.day5;

import java.util.HashSet;
import java.util.Iterator;
public class D05P05 {
    public static void main(String[] args) 
    {
        HashSet<Product> productSet = new HashSet<>();

        productSet.add(new Product("P001", "Maruthi 800"));
        productSet.add(new Product("P002", "MaruthiZen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruthi Alto"));

        String productIdToRemove = "P002";

        Iterator<Product> itr= productSet.iterator();
        while (itr.hasNext()) 
        {
            Product p = itr.next();
            if (p.getProductId().equals(productIdToRemove)) 
            {
                itr.remove();
                System.out.println(productIdToRemove);
                break; 
            }
        }

        System.out.println("Remaining products:");
        for (Product product : productSet)
        {
            System.out.println( product.getProductId() +" " +  product.getProductName());
        }
    }
}
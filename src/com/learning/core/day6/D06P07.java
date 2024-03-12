package com.learning.core.day6;

import java.util.Map;
import java.util.TreeMap;

public class D06P07 {
    public static void main(String[] args) {
       
        TreeMap<Car, String> tr = new TreeMap<>();

        
        tr.put(new Car("Bugatti", 80050.0), "1");
        tr.put(new Car("Swift", 305000.0), "2");
        tr.put(new Car("Audi", 600100.0), "3");
        tr.put(new Car("Benz", 900000.0), "4");

       
        Map.Entry<Car, String> greatestEntry = tr.lastEntry();
        System.out.println("Car with the least price: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

       
        Map.Entry<Car, String> leastEntry = tr.firstEntry();
        System.out.println("Car with the greatest price: " + leastEntry.getValue() + ". " + leastEntry.getKey());
    }
}
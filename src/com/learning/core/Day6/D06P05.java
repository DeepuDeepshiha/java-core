package com.learning.core.day6;
import java.util.Map.Entry;
import java.util.TreeMap;

public class D06P05 {
	public static void main(String[] args)
	{
TreeMap<Car, String> tr = new TreeMap<>();

        
        tr.put(new Car("Bugatti", 80050.0), "1");
        tr.put(new Car("Swift", 305000.0), "2");
        tr.put(new Car("Audi", 600100.0), "3");
        tr.put(new Car("Benz", 900000.0), "4");
		for(Entry<Car, String> e:tr.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}

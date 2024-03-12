package com.learning.core.day6;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class D06P09{ 

	public static void main(String[] args) {
		TreeMap<Car, String> tr = new TreeMap<>(); 
		tr.put(new Car("Bugatti", 80050.0), "1"); 
		tr.put(new Car("Swift", 305000.0), "2"); 
		tr.put(new Car("Audi", 600100.0), "3"); 
		tr.put(new Car("Benz", 900000.0), "4"); 
		double keyToReplace = 80050.0; 
		String newValue = "Reva"; 
		for (Map.Entry<Car1, String> entry : tr.entrySet()) 
		{ 
			if (entry.getKey().price == keyToReplace) 
			{ 
				entry.setValue(newValue);
				break;
			} 

		} 
		for (Map.Entry<Car, String> entry : tr.entrySet()) 
		{ 
			System.out.println(entry. getValue()+". "+entry.getKey());

		}
		}
	}

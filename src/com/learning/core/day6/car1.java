package com.learning.core.day6;

import java.util.*; 

class Car1 implements Comparable<Car1> { 

	String name; 

	double price; 

	public Car1(String name, double price) { 

		this.name = name; this.price = price;

		}

	@Override 

	public String toString() { 

		return name + ": $" + price;

		} 

	@Override

	public int hashCode() { 

		return Objects.hash(name, price); 

		} 

	@Override

	public boolean equals(Object obj) { 

		if (this == obj) return true; 

		if (obj == null || getClass() != obj.getClass()) 

			  return false;

		Car1 car = (Car1) obj; 

		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);

		} 

	@Override 

	public int compareTo(Car1 otherCar) { 

		return Double.compare(this.price, otherCar.price); 

		} 

	} 

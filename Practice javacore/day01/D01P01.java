package javacore.day01;

public class D01P01 extends Books{
	
	public void createbooks(String bookname,double price)
	{
		booktitle=bookname;
		bookprice=price;
	}
	
	public void showbooks()
	{
		System.out.println(booktitle+bookprice);
	}
	
	public static void main(String[] args)
	{
		D01P01 C = new D01P01();
		C.createbooks("Java Programing ", 350.00);
		C.showbooks();
	}

}
